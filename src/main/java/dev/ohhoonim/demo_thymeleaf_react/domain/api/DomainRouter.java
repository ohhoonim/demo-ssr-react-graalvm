package dev.ohhoonim.demo_thymeleaf_react.domain.api;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DomainRouter {
    @GetMapping("/login")
    public String loginPage() {
        return "pages/login"; // templates/pages/login.html 호출
    }

    @GetMapping("/products")
    public String productManagement(Model model) {
        var products = List.of(
            new Product(1L, "matthew", 2000, 60),
            new Product(2L, "ohhoonim", 2300, 10),
            new Product(3L, "alison", 1000, 4)
        );
        model.addAttribute("products", products);
        return "pages/products"; // templates/pages/products.html 호출
    } 

    record Product(
        Long id,
        String name,
        int price,
        int stock
    ){}
}
