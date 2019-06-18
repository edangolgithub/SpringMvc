package abc;

public class login 
{
	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean validate()
	{
		if(username.compareTo("chandra")==0)
		{
			if(password.compareTo("abc")==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}

}
