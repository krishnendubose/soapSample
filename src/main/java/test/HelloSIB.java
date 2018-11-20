package test;

import javax.jws.WebService;
import javax.jws.WebMethod;

@SuppressWarnings("restriction")
@WebService(endpointInterface = "test.HelloSEI")

public class HelloSIB implements HelloSEI{
	
	
	public String helloMsg() {
		
		return "Hello world !!!";
	}
}
