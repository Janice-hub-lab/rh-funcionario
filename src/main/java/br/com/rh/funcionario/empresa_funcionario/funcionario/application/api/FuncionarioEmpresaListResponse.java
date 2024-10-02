package br.com.rh.funcionario.empresa_funcionario.funcionario.application.api;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaListResponse;
import br.com.rh.funcionario.empresa_funcionario.funcionario.domain.Funcionario;
import lombok.Value;

@Value
public class FuncionarioEmpresaListResponse {
	private UUID idFuncionario;
	private UUID idEmpresa;
	private String nomeCompletoFuncionario;
	private String cargo;
	private double salario;
	private String telefone;
	private String endereco;
	
	private LocalDateTime dataHoraDoCadastro;

	public static List<FuncionarioEmpresaListResponse> converte(List<Funcionario> funcionariosDaEmpresa) {
		return funcionariosDaEmpresa.stream()
				.map(FuncionarioEmpresaListResponse::new)
				.collect(Collectors.toList());
	}

	public FuncionarioEmpresaListResponse(Funcionario funcionario) {
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
