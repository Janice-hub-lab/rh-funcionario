package br.com.rh.funcionario.empresa_funcionario.empresa.application.api;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class EmpresaRequest {
	@NotBlank
	private String nomeCompletoEmpresa;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String celular;
	private String telefone;
	@NotNull
	private LocalDate dataInicio;
	@CNPJ
	private String cnpj;

}
