package com.wj.mwp.db;

import javax.servlet.http.HttpServletRequest;

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
			
			System.out.println(m_emailID);
			System.out.println(m_pw);
			System.out.println(m_phoneNO);
			System.out.println(m_birthD);
			
			

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

}
