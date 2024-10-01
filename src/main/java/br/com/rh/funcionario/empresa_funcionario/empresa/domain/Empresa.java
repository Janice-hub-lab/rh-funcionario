package br.com.rh.funcionario.empresa_funcionario.empresa.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CNPJ;

import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaAlteracaoRequest;
import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idEmpresa;
	@NotBlank
	private String nomeCompletoEmpresa;
	@NotBlank
	@Email
	@Column(unique = true)
	private String email;
	@NotBlank
	private String celular;
	private String telefone;
	@NotNull
	private LocalDate dataInicio;
	@CNPJ
	@Column(unique = true)
	private String cnpj;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	
	public Empresa(EmpresaRequest empresaRequest) {
		this.nomeCompletoEmpresa = empresaRequest.getNomeCompletoEmpresa();
		this.email = empresaRequest.getEmail();
		this.celular = empresaRequest.getCelular();
		this.telefone = empresaRequest.getTelefone();
		this.dataInicio = empresaRequest.getDataInicio();
		this.cnpj = empresaRequest.getCnpj();
		this.dataHoraDoCadastro = LocalDateTime.now();
		
	}


	public void altera(@Valid EmpresaAlteracaoRequest empresaRequest) {
		this.nomeCompletoEmpresa = empresaRequest.getNomeCompletoEmpresa();
		this.celular = empresaRequest.getCelular();
		this.telefone = empresaRequest.getTelefone();
		this.dataHoraDoCadastro = LocalDateTime.now();
		
	}

}


