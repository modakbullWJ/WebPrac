package com.wj.mwp.bean;

public class Members {

	private String m_emailID;
	private String m_pw;
	private String m_phoneNO;
	private String m_birthD;

	public Members() {
		// TODO Auto-generated constructor stub
	}

	public Members(String m_emailID, String m_pw, String m_phoneNO, String m_birthD) {
		super();
		this.m_emailID = m_emailID;
		this.m_pw = m_pw;
		this.m_phoneNO = m_phoneNO;
		this.m_birthD = m_birthD;
	}

	public String getM_emailID() {
		return m_emailID;
	}

	public void setM_emailID(String m_emailID) {
		this.m_emailID = m_emailID;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_phoneNO() {
		return m_phoneNO;
	}

	public void setM_phoneNO(String m_phoneNO) {
		this.m_phoneNO = m_phoneNO;
	}

	public String getM_birthD() {
		return m_birthD;
	}

	public void setM_birthD(String m_birthD) {
		this.m_birthD = m_birthD;
	}

}
