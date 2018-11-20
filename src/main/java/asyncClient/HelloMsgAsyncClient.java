package asyncClient;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public class HelloMsgAsyncClient {

	public static void main(String[ ] args) {
        HelloSIBService service = new HelloSIBService();
        HelloSEI port = service.getHelloSIBPort();
        port.helloMsgAsync( new MyHandler());                            
        try {
            Thread.sleep(5000); // in production, do something useful!
        }
        catch(Exception e) { }
        System.out.println("\nmain is exiting yo yo...");
    }
    static class MyHandler implements AsyncHandler<HelloMsgResponse> {     
        public void handleResponse(Response<HelloMsgResponse> future) {    
            try {
                HelloMsgResponse response = future.get();                  
                String msg = response.getReturn();              
                System.out.println(msg);       
            }
            catch(Exception e) { System.err.println(e); }
        }
    }
}
