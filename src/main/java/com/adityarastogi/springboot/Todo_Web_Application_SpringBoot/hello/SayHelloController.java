package com.adityarastogi.springboot.Todo_Web_Application_SpringBoot.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController: This annotation is a specialization of @Controller and is used to create RESTful web services. It combines the functionality of @Controller and @ResponseBody, meaning that the methods within the class will return data directly as responses rather than views (like HTML pages).
@Controller    //This tells Spring that this class is a controller, and it should consider it when handling incoming requests.
public class SayHelloController {
    //"say-hello" => "Hello! What are you learning today?"
	
	//say-hello
	// http://localhost:8080/say-hello
	@RequestMapping("say-hello")    //@RequestMapping maps the URL to the method, so that when the URL is hit, the method is called.
	@ResponseBody                //@ResponseBody tells Spring that the return value of the method is the response, not the name of a template to render. In easy words, it tells Spring to return the value as it is.
	public String sayHello() {
		return "Hello! What are you learning today?";
	}

    // http://localhost:8080/say-hello-html
    @RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page - Changed</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first html page with body - Changed");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}

    // "say-hello-jsp" => sayHello.jsp 
    // /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    // /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
    // /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
    // /src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
    @RequestMapping("say-hello-jsp")
    // @ResponseBody
    public String sayHelloJsp() {
        return "sayHello";
    }
}
