package Java;


public class VowelsCount {

	public static void main(String[] args)
	{
		String str="Navaneetha";
		String vowel="aeiou";
		
		//System.out.println("Number of vowels in name:" +vowels_count(str));
				
	//Print vowels
		
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=0;j<vowel.length();j++)
			{
				if(vowel.charAt(j)==str.charAt(i))
				{
					System.out.println("Vowels are:"+vowel.charAt(j));
				}
					
						
			}
		}
	}
	}
	
	//Vowels Count
	/*public static int vowels_count(String str)
	{
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
				
				
			}
				
					
		}
		return count;
		
		*/
		

	
