package com.axsos.pawesomepets.controllers;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.pawesomepets.models.User;
import com.axsos.pawesomepets.services.UserService;
import com.axsos.pawesomepets.validator.UserValidator;

@Controller
public class MainController {
	private UserService userService;
	private UserValidator userValidator;
    
    public MainController(UserService userService,UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }
       
    // ******************************************************************************
    // This method is only commented when you want to comment out the following method
    @PostMapping("/registration")
    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        userValidator.validate(user, result);
        if (result.hasErrors()) {
            return "logreg.jsp";
        }
        
        userService.saveWithUserRole(user);
        return "redirect:/login";
    }
    // ******************************************************************************
    // ******************************************************************************
    // This method is only commented out when you want to add an admin, and the previous method shall be commented 
//    @PostMapping("/registration")
//    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
//        userValidator.validate(user, result);
//        if (result.hasErrors()) {
//            return "logreg.jsp";
//        }
//        userService.saveUserWithAdminRole(user);
//        return "redirect:/login";
//    }
    // ******************************************************************************
    
    @RequestMapping("/login")
    public String login(@RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model, @Valid @ModelAttribute(value="user") User user, BindingResult result) {
	    	if(error != null) {
	            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
	        }
	        if(logout != null) {
	            model.addAttribute("logoutMessage", "Logout Successful!");
	        }    
        return "logreg.jsp";
    }    
    
    @RequestMapping("/admin")
    public String adminPage(Principal principal, Model model) {
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        return "adminPage.jsp";
    }    
    
    @RequestMapping(value = {"/", "/home"})
    public String home(Principal principal, Model model) {
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        return "homePage.jsp";
    }

    @RequestMapping("/about")
    public String aboutUs () {
    	return "aboutus.jsp";	
    }
    @RequestMapping("/ourteam")
    public String ourTeam () {
    	return "ourteam.jsp";	
    }
    @RequestMapping("/editservice")
    public String editService () {
    	return "editService.jsp";	
    }
    @RequestMapping("/editcategory")
    public String editCategory () {
    	return "editCategory.jsp";	
    }
    @RequestMapping("/editappointment")
    public String editAppointment () {
    	return "editAppointment.jsp";	
    }
    @RequestMapping("/services")
    public String services () {
    	return "services.jsp";	
    }
}