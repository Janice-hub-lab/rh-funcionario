package br.com.rh.funcionario.empresa_funcionario.funcionario.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioAlteracaoRequest;
import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idFuncionario", updatable = false, unique = true, nullable = false)
	private UUID idFuncionario;
	@NotNull
	private UUID idEmpresa;
	@NotBlank
	private String nomeCompletoFuncionario;
	@NotBlank
	private String cargo;
	private double salario;
	private String telefone;
	private String endereco;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	
	public Funcionario(UUID idEmpresa, @Valid FuncionarioRequest funcionarioRequest) {
		this.idFuncionario = idFuncionario;
		this.idEmpresa = idEmpresa;
		this.nomeCompletoFuncionario = funcionarioRequest.getNomeCompletoFuncionario();
		this.cargo = funcionarioRequest.getCargo();
		this.salario = funcionarioRequest.getSalario();
		this.telefone = funcionarioRequest.getTelefone();
		this.endereco = funcionarioRequest.getEndereco();
		this.dataHoraDoCadastro = LocalDateTime.now();

	}

	public void alteraFuncionario(FuncionarioAlteracaoRequest funcionarioRequest) {
		this.nomeCompletoFuncionario = funcionarioRequest.getNomeCompletoFuncionario();
		this.cargo = funcionarioRequest.getCargo();
		this.salario = funcionarioRequest.getSalario();
		this.telefone = funcionarioRequest.getTelefone();
		this.endereco = funcionarioRequest.getEndereco();
		this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
		
	}

}
