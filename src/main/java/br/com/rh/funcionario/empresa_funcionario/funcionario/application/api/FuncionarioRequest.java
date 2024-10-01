package br.com.rh.funcionario.empresa_funcionario.funcionario.application.api;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class FuncionarioRequest {
	@NotBlank
	private String nomeCompletoFuncionario;
	@NotBlank
	private String cargo;
	private double salario;
	private String telefone;
	private String endereco;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

}
