package br.com.rh.funcionario.empresa_funcionario.empresa.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idEmpresa;
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
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	private Empresa(@NotBlank String nomeCompletoEmpresa, @NotBlank @Email String email, @NotBlank String celular,
			String telefone, @NotNull LocalDate dataInicio, @CNPJ String cnpj) {
		this.nomeCompletoEmpresa = nomeCompletoEmpresa;
		this.email = email;
		this.celular = celular;
		this.telefone = telefone;
		this.dataInicio = dataInicio;
		this.cnpj = cnpj;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

}


