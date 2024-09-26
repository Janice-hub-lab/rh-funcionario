package br.com.rh.rh_funcionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class RhFuncionarioApplicationTeste {
	
	@GetMapping
	public String getHomeTeste() {
		return "Rh Funcionario - API Home";
	}

	
	public static void main(String[] args) {
		SpringApplication.run(RhFuncionarioApplicationTeste.class, args);
	}

}
