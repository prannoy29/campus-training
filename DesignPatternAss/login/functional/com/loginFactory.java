package login.functional.com;

public class loginFactory {
	public SocialaAccount  getlogintype(String str)
	{
		if(str.equals("fb"))
			return new facebook();
		else if(str.equals("google"))
			return new google();
		else if(str.equals("linkedin"))
			return new linkedin();
		else if(str.equals("twitter"))
			return new twitter();
		else
			return null;
	}

}
