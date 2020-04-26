package hu.ebamine;

public class tutorial {
	
	static int pig = 15-5;
	static String sheep = "The first if statement is true!" ;
	static double cow = 42.456; 
	static boolean chicken = true;
	public static void main(String[] args){
		
		if (pig >= cow) 
		{
			System.out.println(sheep);
		}
		else if (pig == 11)
		{
			System.out.println("The second if statement is true!");
		}
		else
		{
			System.out.println("None of the if statements are true!");
		}
		System.out.println(pig);
	}
}
