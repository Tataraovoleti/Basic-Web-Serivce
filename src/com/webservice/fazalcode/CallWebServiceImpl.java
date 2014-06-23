/**
 * Copyright 2014@ fazalcode
 * All Rights Reserved to fazalcode
 */
package com.webservice.fazalcode;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author Tatarao voleti
 * @date   08-Apr-2014
 *
 */
@WebService(endpointInterface="com.webservice.fazalcode.CallWebService")
@SOAPBinding(style=Style.RPC)
public class CallWebServiceImpl implements CallWebService {

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}

}
