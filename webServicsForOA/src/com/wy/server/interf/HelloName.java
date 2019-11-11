package com.wy.server.interf;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloName {
	@WebMethod
	public String getName(String name);
}
