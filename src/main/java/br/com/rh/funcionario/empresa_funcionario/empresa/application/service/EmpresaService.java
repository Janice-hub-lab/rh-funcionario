package br.com.rh.funcionario.empresa_funcionario.empresa.application.service;

import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaRequest;
import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaResponse;

public interface EmpresaService {

	EmpresaResponse criaEmpresa(EmpresaRequest empresaRequest);

}
