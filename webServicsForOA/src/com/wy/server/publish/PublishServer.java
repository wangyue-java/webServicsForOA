package com.wy.server.publish;

import javax.xml.ws.Endpoint;

import com.wy.server.HelloNameImpl;

public class PublishServer {

	public static void main(String[] args) {
		String ad = "http://192.168.1.107:8989/myWebServer/hello";
		Endpoint.publish(ad, new HelloNameImpl());
		System.out.println("发布helloName成功...");
	}
}
