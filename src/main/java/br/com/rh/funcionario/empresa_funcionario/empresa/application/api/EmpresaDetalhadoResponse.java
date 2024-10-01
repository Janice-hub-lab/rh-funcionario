package br.com.rh.funcionario.empresa_funcionario.empresa.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.rh.funcionario.empresa_funcionario.empresa.domain.Empresa;
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

	public EmpresaDetalhadoResponse(Empresa empresa) {
		this.idEmpresa = empresa.getIdEmpresa();
		this.nomeCompletoEmpresa = empresa.getNomeCompletoEmpresa();
		this.email = empresa.getEmail();
		this.celular = empresa.getCelular();
		this.telefone = empresa.getTelefone();
		this.cnpj = empresa.getCnpj();
		this.dataHoraDoCadastro = empresa.getDataHoraDoCadastro();

	}

}
