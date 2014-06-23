/**
 * Copyright 2014@ fazalcode
 * All Rights Reserved to fazalcode
 */
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.webservice.fazalcode.CallWebService;


/**
 * @author Tatarao voleti
 * @date   08-Apr-2014
 *
 */
public class CalClient {

	public static void main(String[] args) {
		
		try {
			URL url=new URL("http://localhost:9999/cal?wsdl");
			
			QName qname= new QName("http://fazalcode.webservice.com/","CallWebServiceImplService");
			
			Service service= Service.create(url,qname);
			CallWebService calWebService=service.getPort(CallWebService.class);
			
			System.out.println(calWebService.add(10,20));
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
