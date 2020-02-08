package Sweets;

public class Sweets {
	public double weight;
	public int price_of_sweets;
	public Sweets(double weight,int price_of_sweets)
	{
		this.weight=weight;
		this.price_of_sweets=price_of_sweets;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getPrice_of_sweets() {
		return price_of_sweets;
	}
	public void setPrice_of_sweets(int price_of_sweets) {
		this.price_of_sweets = price_of_sweets;
	}
}
