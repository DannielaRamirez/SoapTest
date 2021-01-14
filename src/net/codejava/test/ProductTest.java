package net.codejava.test;

public class ProductTest {

	public static void main(String[] args) {
		ProductService service = new ProductService();
		Product product = service.getProductPort();
		
		int price = product.getPrice();
		System.out.println("Price = " + price);
		
		String name = product.getName("18");
		System.out.println("Name = " + name);
		
		product.sell("iMac", 1198);
	}

}
