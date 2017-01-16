package pk.ciit.MavenFinal;

public class Calculator 
{
	public int findMax(int num1, int num2, int num3) 
	{
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) 
		{
			if (arr[i] > max)
			max = arr[i];
		}
		return max;
		}
	
	public int square(int num) throws IllegalArgumentException 
	{
		int result = 0;
		if (num > 0 && num < 10) 
		{
			result = num * num;
		} 
		else
			throw new IllegalArgumentException();
		return result;
	}
	/**
	 * @author Abdullah
	 * @param num - It is the number whose cube we are getting
	 * @return - returns the cube of num
	 */
	public int cube(int num)
	{
		return num*num*num;
	}
}