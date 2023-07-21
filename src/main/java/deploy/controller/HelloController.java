package deploy.controller;

import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
	@GetMapping("/")
    public String hello(Model model,Locale locale) {
		return "Hello!";
    }
}