package com.oca;

public class Test{
	
	public void updateProduct(Product product,double price) {
		
		price=price*2;
		product.price=product.price+price;
	
	}


	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.price=200;
		double newPrice=100;
		Test t=new Test();
		t.updateProduct(p1, newPrice);
		System.out.println(p1.price+""+newPrice);
		
	

	}

}
class Product{
double price;
}