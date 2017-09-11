package com.asura.java.JavaBasics;


/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */

public class Product implements Cloneable{
    public int weight;
    public String color;
    
    /**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	@Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Product p1 = new Product();
        p1.setColor("red");
        p1.setWeight(0);
        
        Product p2 = (Product)p1.clone();
        
        System.out.println("p2: "+p2);
    }
    
}
