# Spring Boot Annotations Explained

This document explains the annotations used in the `SayHelloController` class of a Spring Boot application.

## Annotations Explained

### **1. @Controller**
📌 **Package:** `org.springframework.stereotype.Controller`  
🔹 **Purpose:**  
- Marks the class as a Spring MVC controller.
- Indicates that this class will handle incoming web requests.

🔹 **How It Works:**  
- When the Spring application starts, it scans for classes annotated with `@Controller` and registers them as controllers to handle HTTP requests.

---

### **2. @RequestMapping("say-hello")**
📌 **Package:** `org.springframework.web.bind.annotation.RequestMapping`  
🔹 **Purpose:**  
- Maps HTTP requests to a specific method.
- Here, `"say-hello"` means that when a request is made to **`http://localhost:8080/say-hello`**, the `sayHello()` method will be executed.

🔹 **How It Works:**  
- When the application receives a request for `"say-hello"`, Spring will invoke the `sayHello()` method and return its output.

---

### **3. @ResponseBody**
📌 **Package:** `org.springframework.web.bind.annotation.ResponseBody`  
🔹 **Purpose:**  
- Indicates that the return value of the method should be sent directly as the **HTTP response body**, instead of being interpreted as a view name.

🔹 **How It Works:**  
- Without `@ResponseBody`, Spring would look for a **view (HTML, JSP, etc.)** with the name `"Hello! What are you learning today?"` (which doesn't exist).
- By using `@ResponseBody`, the response `"Hello! What are you learning today?"` is returned as plain text in the HTTP response.

---


### **Usage**
1. Run your Spring Boot application.
2. Open a browser or Postman and visit `http://localhost:8080/say-hello`.
3. You should see the response:  
   **`Hello! What are you learning today?`**

This document is designed to help developers understand the purpose and usage of the annotations in this Spring Boot application. 🚀
