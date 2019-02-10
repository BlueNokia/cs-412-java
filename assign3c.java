
public class assign3c
{
	public static void main( String[] args)
	{	
		
		String[] fl = {"First", "Last"};
		for ( int i=0 ; i<2 ; i++)
		{
			char[] let = args[i].toCharArray();
			boolean res = true;
			for( char j : let)
			{
				if ( Character.isDigit(j))	res = false;
			}
			if ( res )	System.out.println(fl[i] + " Name: "+ args[i]);
			else		System.out.println(fl[i] + " Name: Please enter a valid name.");
		}
		
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
	
		String[] date = args[2].split("/", 3);
		String[] calendar = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		if( Integer.parseInt(date[0])>0 && Integer.parseInt(date[0])<=31 && Integer.parseInt(date[1])>0 && Integer.parseInt(date[1])<=12 && Integer.parseInt(date[2])<2019 )
			System.out.println("Date of Birth: "+ date[0]+"-"+calendar[Integer.parseInt(date[1]) - 1]+"-"+date[2]);
		else
			System.out.println("Date of Birth: Please enter a valid date");
			
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		int l = args[3].length();
		if ( args[3].indexOf('@') <= 0)
			System.out.println("Date of Birth: Please enter a valid mail ID");
		else if ( args[3].charAt(l- 3) != '.' && args[3].charAt(l - 4) != '.')
			System.out.println("Date of Birth: Please enter a valid mail ID");
		else
			{
				String[] mail = args[3].split("@", 2);
				System.out.println("Domain Name: "+ mail[1]);
			}
		
		
		
	}
}
