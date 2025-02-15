package com.adityarastogi.springboot.Todo_Web_Application_SpringBoot.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

    //login => com.adityarastogi.springboot.Todo_Web_Application_SpringBoot.login.LoginController =>loginjsp

    //https://localhost:8080/login?name=aditya
    //Model
    // @RequestMapping("login")
    // public String gotoLoginPage(@RequestParam String name, ModelMap model) {
    //     model.put("name", name);
    //     return "login";
    // }




    // @RequestMapping(value="login",method = RequestMethod.GET)
    // public String gotoLoginPage() {
    //     return "login";
    // }



    // private AuthenticationService authenticationService;

    // //this constructor is used for autowiring the AuthenticationService
    // //autwiring is done between the beans, so that we can use the AuthenticationService in the LoginController
    // public LoginController(AuthenticationService authenticationService) {
    //     super();
    //     this.authenticationService = authenticationService;
    // }





    // @RequestMapping(value="login",method = RequestMethod.POST)
    // //login?name=aditya&password=aditya  RequestParam
    // public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        
    //     if(authenticationService.authenticate(name, password)) {
    //         model.put("name", name);
    //         model.put("password", password);
    //         return "welcome";
    //     } 
    //     model.put("errorMessage", "Invalid Credentials!!");
    //     return "login";
    // }


    //what is the model map?
    //model map is used to pass the data from the controller to the view
    // model map is a key value pair, where key is the name of the variable, and value is the value of the variable
    //a view is a jsp file, which is used to display the data
    
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String gotoWelcomePage(ModelMap model) {
        // model.put("name", "aditya");     //here, we are hardcoding the name
        model.put("name", getLoggedinUsername());  
        return "welcome";
    }

    private String getLoggedinUsername() {

        //Authentication is an interface, it is used to get the details of the user who is logged in
        //how it get the name of user? 
        //it gets the name of the user from the SecurityContextHolder
        //SecurityContextHolder is a class, it is used to get the context of the user who is logged in
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}   
