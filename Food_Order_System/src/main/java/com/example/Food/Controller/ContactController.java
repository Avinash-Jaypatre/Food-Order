package com.example.Food.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.Food.Entity.Contact;
import com.example.Food.Service.ContactService;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/saveContact")
    public String saveContact(@ModelAttribute Contact contact) {
        contactService.saveContact(contact);
        return "redirect:/ContactUs?success";
    }

    @GetMapping("/ContactUs")
    public String showContactPage() {
        return "ContactUs";
    }

    @GetMapping("/Admin/Contactuus")
    public String viewAllContacts(Model model) {
        List<Contact> contacts = contactService.getAllContacts();
        model.addAttribute("contacts", contacts);
        return "Admin/Contactuus"; // this is the HTML file name (without .html)
    }
    
    
}
