package com.example.Food.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Food.Entity.User;
import com.example.Food.Repository.UserRepository;

@Controller
public class FoodController {

//	@GetMapping("/login")
//	public String login() {
//		return "login";
//	}

	
	 @Autowired
	    private UserRepository userRepository;

	    // ================== AUTH ==================

	    @GetMapping("/")
	    public String showRegistrationForm() {
	        return "registration"; // registration.html or registration.jsp
	    }

	    @PostMapping("/")
	    public String registerUser(@ModelAttribute User user) {
	        userRepository.save(user);
	        return "redirect:/login";
	    }

	    @GetMapping("/login")
	    public String loginPage() {
	        return "login"; // login.html or login.jsp
	    }
    
	
	@GetMapping("/home")
	public String homepage() {
		return "Home";
	}

	@GetMapping("/Navbar")
	public String Navbar() {
		return "Navbar";
	}

	@GetMapping("/Product")
	public String ProductPage() {
		return "Product";
	}


	@GetMapping("/MenuPage")
	public String MenuPage() {
		return "MenuPage";
	}

	@GetMapping("/ChickenPage")
	public String ChickenPage() {
		return "ChickenPage";
	}

	@GetMapping("/BurgerPage")
	public String BurgerPage() {
		return "BurgerPage";
	}

	@GetMapping("/PizzaPage")
	public String PizzaPage() {
		return "PizzaPage";
	}

	@GetMapping("/Salads")
	public String Salads() {
		return "Salads";
	}

	@GetMapping("/Drinks")
	public String Drinks() {
		return "Drinks";
	}
	
	@GetMapping("/Ordersucces")
	public String Ordersucces() {
		return "Ordersucces";
	}
	@GetMapping("/AboutUs")
	public String AboutUs() {
		return "AboutUs";
	}
	
	@GetMapping("/contactfetch")
    public String contactfetch() {
        return "Admin/Contactuus"; // Return your contact.jsp or contact.html
    }
	
//	@GetMapping("/")
//	public String registration() {
//		return "registration";
//	}
	
	

	
}
