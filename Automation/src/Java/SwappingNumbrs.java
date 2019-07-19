package Java;

public class SwappingNumbrs {

	public static void main(String[] args)
	{
		int a=10,b=20;
		System.out.println("Before Swapping a value: " +a+" " +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a value: " +a+" "+b);
	
		

	}

}
