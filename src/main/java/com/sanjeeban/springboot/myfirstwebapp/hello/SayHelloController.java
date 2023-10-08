package com.sanjeeban.springboot.myfirstwebapp.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  // Telling spring is this is a spring bean. We are building here a web ui application.
public class SayHelloController {
	@RequestMapping("say-hello-api")    // Mapping a request url to this method.
	@ResponseBody  // It is looking for a view to display.
	public String sayHello() {
		return "Hello World API";
	}
	
	@RequestMapping("say-hello-html")    // Mapping a request url to this method.
	@ResponseBody  // It is looking for a view to display.
	public String sayHelloHtml() {
		
		StringBuffer sb = new StringBuffer();

		sb.append("<head>");
		sb.append("<title> My first html page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first html body");
		sb.append("</body>");
		sb.append("</html>");

		return sb.toString();
	}
	
	
	@RequestMapping("say-hello-jsp")    // Mapping a request url to this method.
	public String sayHelloJsp() {
		return "sayHello"; // this should map to the jsp file name without the .jsp
	}
}
