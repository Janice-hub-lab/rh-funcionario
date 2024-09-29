package br.com.rh.funcionario.empresa_funcionario.empresa.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.rh.funcionario.empresa_funcionario.empresa.domain.Empresa;
import lombok.Value;

@Value
public class EmpresaListResponse {
	private UUID idEmpresa;
	private String nomeCompletoEmpresa;
	private String email;
	private String celular;
	private String cnpj;
	
	public static List<EmpresaListResponse> converte(List<Empresa> empresas) {
		return empresas.stream()
				.map(EmpresaListResponse::new)
				.collect(Collectors.toList());
	}

	private EmpresaListResponse(Empresa empresa) {
		super();
		this.idEmpresa = empresa.getIdEmpresa();
		this.nomeCompletoEmpresa = empresa.getNomeCompletoEmpresa();
		this.email = empresa.getEmail();
		this.celular = empresa.getCelular();
		this.cnpj = empresa.getCnpj();
	}
	

	}


