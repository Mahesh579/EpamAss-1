package Chocolates;

public class Chocolates {
	double weight;
	int price_of_choco;
	public Chocolates(double weight,int price_of_choco)
	{
		this.weight=weight;
		this.price_of_choco=price_of_choco;
		
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getPrice_of_choco() {
		return price_of_choco;
	}
	public void setPrice_of_choco(int price_of_choco) {
		this.price_of_choco = price_of_choco;
	}
}
