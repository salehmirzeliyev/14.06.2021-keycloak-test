package com.example.keycloak.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@SpringBootApplication
public class KeycloakAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakAppApplication.class, args);
	}

}

@Controller
class ProductController {

	@GetMapping(path = "/products")
	public String getProducts(Model model){
		model.addAttribute("products", Arrays.asList("Aa", "Bb", "Cc"));
		return "products";
	}

	@GetMapping(path = "/logout")
	public String Logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "/";
	}
}
