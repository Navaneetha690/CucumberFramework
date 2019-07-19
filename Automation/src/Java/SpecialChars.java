package Java;
public class SpecialChars {

	public static void main(String[] args) throws Exception 
	{
		String name="Navaneetha*&#@%&";
		for(int i=0;i<name.length();i++)
		{
			char c=name.charAt(i);
			if(!Character.isLetterOrDigit(c))
			{
				System.out.print(c);
			}
		}
	}

}
