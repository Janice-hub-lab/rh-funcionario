package br.com.rh.funcionario.empresa_funcionario.empresa.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;

@Value
public class EmpresaDetalhadoResponse {
	private UUID idEmpresa;
	private String nomeCompletoEmpresa;
	private String email;
	private String celular;
	private String telefone;
	private String cnpj;
	
	private LocalDateTime dataHoraDoCadastro;

}
