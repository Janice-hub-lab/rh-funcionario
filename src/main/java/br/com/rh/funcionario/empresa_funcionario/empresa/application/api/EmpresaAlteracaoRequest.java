package br.com.rh.funcionario.empresa_funcionario.empresa.application.api;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class EmpresaAlteracaoRequest {
	@NotBlank
	private String nomeCompletoEmpresa;
	@NotBlank
	private String celular;
	private String telefone;
	@NotNull
	private LocalDate dataInicio;


}
