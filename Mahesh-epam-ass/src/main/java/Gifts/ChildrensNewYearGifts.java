package Gifts;
import Chocolates.*;
import Sweets.*;
public class ChildrensNewYearGifts 
{
	int noOfSweets;
	int noOfChoco;
	public Sweets sweet[];
	public Chocolates choco[];
	
	public ChildrensNewYearGifts(int noOfSweets,int noOfChoco,double weightOfSweets[],int price_of_sweets[],double weightOfChoco[],int price_of_choco[])
	{
		this.noOfSweets=noOfSweets;
		this.noOfChoco=noOfChoco;
		sweet=new Sweets[noOfSweets];
		choco=new Chocolates[noOfChoco];
		int i;	
		
		for(i=0;i<noOfSweets;i++)
		{
			sweet[i]=new Sweets(weightOfSweets[i],price_of_sweets[i]);
		}
		
		
		for(i=0;i<noOfChoco;i++)
		{
			choco[i]=new Chocolates(weightOfChoco[i],price_of_choco[i]);
		}
		
	}
	
}
