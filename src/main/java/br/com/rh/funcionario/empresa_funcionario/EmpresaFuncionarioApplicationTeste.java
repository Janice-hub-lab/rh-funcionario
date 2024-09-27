package br.com.rh.funcionario.empresa_funcionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class EmpresaFuncionarioApplicationTeste {
	
	@GetMapping
	public String getHomeTeste() {
		return "Empresa Funcionario - API Home";
	}

	
	public static void main(String[] args) {
		SpringApplication.run(EmpresaFuncionarioApplicationTeste.class, args);
	}

}
