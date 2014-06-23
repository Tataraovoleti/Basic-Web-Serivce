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
@WebService
@SOAPBinding(style=Style.RPC)
public interface CallWebService {
	
	public int add(int x,int y);

}
