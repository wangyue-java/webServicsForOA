package com.wy.server;

import javax.jws.WebService;

import com.wy.server.interf.HelloName;

@WebService
public class HelloNameImpl implements HelloName{

	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		return "ÄãºÃ£º"+name;
	}

}
