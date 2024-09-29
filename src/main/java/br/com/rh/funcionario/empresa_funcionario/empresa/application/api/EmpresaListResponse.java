package br.com.rh.funcionario.empresa_funcionario.empresa.application.api;

import java.util.List;
import java.util.UUID;

import br.com.rh.funcionario.empresa_funcionario.empresa.domain.Empresa;

public class EmpresaListResponse {
	private UUID idEmpresa;
	private String nomeCompletoEmpresa;
	private String email;
	private String celular;
	private String telefone;
	private String cnpj;
	
	public static List<EmpresaListResponse> converte(List<Empresa> empresas) {
		return null;
	}
	

	}


