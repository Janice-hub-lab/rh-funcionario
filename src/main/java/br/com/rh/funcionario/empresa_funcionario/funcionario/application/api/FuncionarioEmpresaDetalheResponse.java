package br.com.rh.funcionario.empresa_funcionario.funcionario.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.rh.funcionario.empresa_funcionario.funcionario.domain.Funcionario;
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
	
	public FuncionarioEmpresaDetalheResponse(Funcionario funcionario) {
		this.idFuncionario = funcionario.getIdFuncionario();
		this.idEmpresa = funcionario.getIdEmpresa();
		this.nomeCompletoFuncionario = funcionario.getNomeCompletoFuncionario();
		this.cargo = funcionario.getCargo();
		this.salario = funcionario.getSalario();
		this.telefone = funcionario.getTelefone();
		this.endereco = funcionario.getEndereco();
		this.dataHoraDoCadastro = funcionario.getDataHoraDoCadastro();
	}
}
