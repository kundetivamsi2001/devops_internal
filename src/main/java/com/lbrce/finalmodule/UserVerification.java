package com.lbrce.finalmodule;
import java.util.ResourceBundle;
public class UserVerification {
	public boolean check(String uname,String pswd)
	{
		ResourceBundle rb=ResourceBundle.getBundle("configure");
		String username=rb.getString("username");
		String password=rb.getString("password");
		if(uname.equals(username)&&pswd.equals(password))
		        	return true;
		else
					return false;
	}
}
