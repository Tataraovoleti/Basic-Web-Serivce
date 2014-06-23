/**
 * Copyright 2014@ fazalcode
 * All Rights Reserved to fazalcode
 */
import javax.xml.ws.Endpoint;
import com.webservice.fazalcode.CallWebServiceImpl;


/**
 * @author Tatarao voleti
 * @date   08-Apr-2014
 *
 */

public class Publish {
	
	public static void main(String[] args) {

		Endpoint endpoint=Endpoint.publish("http://localhost:9999/cal",new CallWebServiceImpl());
		System.out.println(endpoint.isPublished());
	}

}
