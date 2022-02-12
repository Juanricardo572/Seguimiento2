package model;

import exception.NegativeNumberException;

public class Ingredient {
	private String name;
	private double weight;
	
	public Ingredient(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	public void addWeight(double additionalW) throws NegativeNumberException {
		weight = weight + additionalW;
		
		if(additionalW<0) {
			throw new NegativeNumberException(this.name,additionalW);
		}
	}
	
	public void removeWeight (double removeW) throws NegativeNumberException {
		weight = weight - removeW;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
	
	
}
