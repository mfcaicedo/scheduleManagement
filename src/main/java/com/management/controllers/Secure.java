package com.management.controllers;


import com.management.security.SupabaseUser;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Secure {
    @GetMapping("/secure")
    public String secure(Model model, @AuthenticationPrincipal SupabaseUser user) {
        model.addAttribute("user", user);
        return "secure";
    }
}
