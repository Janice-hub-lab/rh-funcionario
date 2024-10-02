package br.com.rh.funcionario.empresa_funcionario.funcionario.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;

@Value
public class FuncionarioEmpresaDetalheResponse {
	private UUID idFuncionario;
	private UUID idEmpresa;
	private String nomeCompletoFuncionario;
	private String cargo;
	private double salario;
	private String telefone;
	private String endereco;
	
	private LocalDateTime dataHoraDoCadastro;

}
