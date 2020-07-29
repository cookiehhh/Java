
public class Mnage {
	String user = "gaoq";
	String password = "4210";
	
	public boolean Check(String inputuser , String inputpassword)
	{
		return (user.equals(inputuser) && password.equals(inputpassword));
	}
	
	public String toString()
	{
		return "ÓÃ»§Ãû£º" + user + "\nÃÜÂë£º" + password;
	}
}
