package bookmanager;


public class LoginCheck 
{
	private String username;
	private String password;
	
	public LoginCheck(String str1, String str2)
	{
		this.username = str1;
		this.password = str2;
	}
	
	public boolean Legal()
	{
		if("одрЕ╬Э".equals(username)&&"12345".equals(password))
			return true;
		else
			return false;
	}
}

	