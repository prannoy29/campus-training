import login.functional.com.SocialaAccount;
import login.functional.com.loginFactory;

public class Main {
	public static void main(String a[])
	{
		loginFactory lgnf = new loginFactory();
		String str = "twitter";
		SocialaAccount obj = lgnf.getlogintype(str);
		obj.login();
		}

}
