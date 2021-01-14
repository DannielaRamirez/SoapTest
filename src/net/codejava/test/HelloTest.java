package net.codejava.test;

public class HelloTest {

	public static void main(String[] args) {
		HelloService service = new HelloService();
		Hello hello = service.getHelloPort();
		
		String response = hello.bonjour("Chef");
		
		System.out.println(response);
	}

}
