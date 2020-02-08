package Main;
import java.util.*;
import Gifts.*;
public class Main
{
	public static void main(String args[])
	{
		int noOfChoco;
		int noOfSweets;
		int i;
		Scanner sc=new Scanner(System.in);
		/*enter the number of chocolates*/
		System.out.println("Enter number of chocolates:");
		noOfChoco=sc.nextInt();
		/*Enter number sweets*/
		System.out.println("Enter number of sweets:");
		noOfSweets=sc.nextInt();
		/*initialize the variables*/
		double weightOfChoco[]=new double[noOfChoco];
		int price_of_choco[]=new int[noOfChoco];
		
		double weightOfSweets[]=new double[noOfSweets];
		int price_of_sweets[]=new int[noOfSweets];
		/*Enter the price variables*/
		System.out.println("Enter the weight and price of each sweet");
		
		for(i=0;i<noOfSweets;i++)
		{
			System.out.println("Enter the weight and price of Sweet "+(i+1)+" :");
			weightOfSweets[i]=sc.nextDouble();
			price_of_sweets[i]=sc.nextInt();
		}
		/*Enter the chocolates variables*/
		System.out.println("Enter the weight and price of each Chocolate");
		
		for(i=0;i<noOfChoco;i++)
		{
			System.out.println("Enter the weight and price of Chocolate "+(i+1)+" :");
			weightOfChoco[i]=sc.nextDouble();
			price_of_choco[i]=sc.nextInt();
		}
		
		ChildrensNewYearGifts gifts=new ChildrensNewYearGifts(noOfSweets,noOfChoco,weightOfSweets,price_of_sweets,weightOfChoco,price_of_choco);
		/*sweets in sorted array*/
		for(i=0;i<noOfSweets;i++)
		{
			System.out.print("i: "+gifts.sweet[i].price_of_sweets);
			System.out.println(" : "+gifts.sweet[i].weight);
		}
		
		sc.close();
		
	}
}




/*input:
Enter number of chocolates:
2
Enter number of sweets:
2
Enter the weight and price of each sweet
Enter the weight and price of Sweet 1 :
53
15
Enter the weight and price of Sweet 2 :
80
25
Enter the weight and price of each Chocolate
Enter the weight and price of Chocolate 1 :
60
20
Enter the weight and price of Chocolate 2 :
80
35
*Output:
i: 15 : 53.0
i: 25 : 80.0

*/
