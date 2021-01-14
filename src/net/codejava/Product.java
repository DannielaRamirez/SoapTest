package net.codejava;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class Product {
	
	@WebMethod
	public int getPrice() {
		return 100;
	}
	
	@WebMethod
	public String getName(String id) {
		return "iPhone " + id;
	}
	
	@WebMethod
	public void sell(String name, int price) {
		System.out.println(name + " is sold at " + price);
	}
}
