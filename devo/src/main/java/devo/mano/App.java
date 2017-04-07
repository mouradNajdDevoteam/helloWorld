package devo.mano;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class App {
public static void main(String[] args) {
	SpringApplication.run(App.class, args);
}
@RequestMapping("/index")
public String sayHello(){
	
	return "Hallo Mourad!";
}
}
