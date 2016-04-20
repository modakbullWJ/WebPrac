package com.wj.mwp;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wj.mwp.db.MwpDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private MwpDAO md;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model m) {

		m.addAttribute("contentPage", "intro.jsp");

		return "index";
	}

	@RequestMapping(value = "/join.go", method = RequestMethod.GET)
	public String gojoin(Model m) {

		m.addAttribute("contentPage", "join.jsp");

		return "index";
	}

	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	public String dojoin(HttpServletRequest req) {

		md.join(req);

		req.setAttribute("contentPage", "login.jsp");

		return "index";
	}

	@RequestMapping(value = "/login.go", method = RequestMethod.GET)
	public String gologin(HttpServletRequest req) {

		req.setAttribute("contentPage", "login.jsp");

		return "index";
	}

}
