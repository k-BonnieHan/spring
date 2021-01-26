package aa.bb.ex;

import org.springframework.stereotype.Component;

@Component
public class LoginCommand {  //FormBean 역할
	private String userid, passwd;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
}
