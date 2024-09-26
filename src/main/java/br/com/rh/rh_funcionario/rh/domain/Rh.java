package br.com.rh.rh_funcionario.rh.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@EntityScan
public class Rh {
	@org.hibernate.validator.constraints.UUID
	private UUID idRh;
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
	
	private Rh(@NotBlank String nomeCompletoEmpresa, @NotBlank @Email String email, @NotBlank String celular,
			String telefone, @NotNull LocalDate dataInicio, @CNPJ String cnpj) {
		this.idRh = UUID.randomUUID();
		this.nomeCompletoEmpresa = nomeCompletoEmpresa;
		this.email = email;
		this.celular = celular;
		this.telefone = telefone;
		this.dataInicio = dataInicio;
		this.cnpj = cnpj;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

}


