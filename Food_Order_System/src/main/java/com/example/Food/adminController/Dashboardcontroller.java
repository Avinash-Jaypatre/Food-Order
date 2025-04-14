package com.example.Food.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Dashboardcontroller 
{
	
	  @GetMapping("/dashboard")
	    public String showDashboard() {
	        return "Admin/Dashboard";
	    }
	  
//	 	  @GetMapping("/AddProduct")
//		    public String AddProduct() {
//		        return "Admin/AddProduct";
//		    }
}
