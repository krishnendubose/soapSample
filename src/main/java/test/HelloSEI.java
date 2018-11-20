package test;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface HelloSEI {
	@WebMethod
	public String helloMsg() ;
}
