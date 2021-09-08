
public class Opdracht3
{

	 public static void main(String[] args)
	 {
		//De array 
		int[] som = {1,2,3,4,5,6,7,8};
		
		//resultaat integer om de som bij te houden
		int resultaat = 0;
		
		// for loop om alle elementen in de array af te gaan
		for (int i = 0; i < som.length; i++)
		{
			resultaat = resultaat + som[i];
		}
		
		System.out.println(resultaat);
		 
	 }
}
