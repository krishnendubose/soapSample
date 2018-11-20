package client;

public class HelloMsgClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloSIBService helloSIBService =  new HelloSIBService();
		HelloSEI helloSEIPort = helloSIBService.getHelloSIBPort();
		System.out.println("Response from HelloMsg service :- " + helloSEIPort.helloMsg());
	}

}
