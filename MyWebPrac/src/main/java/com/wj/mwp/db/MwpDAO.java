package com.wj.mwp.db;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wj.mwp.bean.Members;

@Service
public class MwpDAO {

	@Autowired
	private SqlSession ss;

	public void join(HttpServletRequest req) {

		try {
			String m_emailID = req.getParameter("m_emailID");
			String m_pw = req.getParameter("m_pw");
			String m_phoneNO = req.getParameter("m_phoneNO");
			String m_birthD = req.getParameter("m_birthD");

			// System.out.println(m_emailID);
			// System.out.println(m_pw);
			// System.out.println(m_phoneNO);
			// System.out.println(m_birthD);

			Members mbs = new Members(m_emailID, m_pw, m_phoneNO, m_birthD);

			MwpMapper mm = ss.getMapper(MwpMapper.class);

			if (mm.join(mbs) == 1) {

				req.setAttribute("result", "가입성공");

			} else {
				req.setAttribute("result", "가입실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("result", "가입실패");
		}

	}

	public void login(HttpServletRequest req, HttpServletResponse res) {
		String m_emailID = req.getParameter("m_emailID");
		String m_pw = req.getParameter("m_pw");

		Members mbs = new Members(m_emailID, m_pw, null, null);
		MwpMapper mm = ss.getMapper(MwpMapper.class);
		try {
			List<Members> members = mm.login(mbs);

			if (members.size() == 0) {
				req.setAttribute("contentPage", "login.jsp");
				req.setAttribute("result", "ID가 없습니다.");
				return;
			}

			// db에서 나온 유저정보

			Members db_m = members.get(0);

			if (db_m.getM_pw().equals(m_pw)) {
				req.setAttribute("contentPage", "loginOK.jsp");

				// loginOK.jsp에서
				// ${sessionScope.어트리뷰트명.멤버변수명}
				req.getSession().setAttribute("loginUser", db_m);
				req.getSession().setMaxInactiveInterval(15 * 60);

				// login.jsp에서
				// ${cookie.쿠키명.value}
				Cookie c = new Cookie("lastLoginID", m_emailID);
				c.setMaxAge(24 * 60 * 60);
				res.addCookie(c);

			} else {
				req.setAttribute("contentPage", "login.jsp");
				req.setAttribute("result", "pw오류");

			}

		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("contentPage", "login.jsp");
			req.setAttribute("result", "로그인 실패");
		}

	}

	public void logout(HttpServletRequest req) {
		req.getSession().invalidate();
		loginCheck(req);
	}

	public boolean loginCheck(HttpServletRequest req) {

		Members m = (Members) req.getSession().getAttribute("loginUser");

		if (m == null) {
			req.setAttribute("contentPage", "login.jsp");
			return false;

		} else {

			req.setAttribute("contentPage", "loginOK.jsp");
			return true;
		}

	}

}
