package br.com.rh.funcionario.empresa_funcionario.empresa.application.service;

import java.util.List;
import java.util.UUID;

import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaAlteracaoRequest;
import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaDetalhadoResponse;
import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaListResponse;
import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaRequest;
import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaResponse;
import jakarta.validation.Valid;

public interface EmpresaService {
	EmpresaResponse criaEmpresa(EmpresaRequest empresaRequest);
	List<EmpresaListResponse> buscaTodasEmpresas();
	EmpresaDetalhadoResponse buscaEmpresaAtravesId(UUID idEmpresa);
	void deletaEmpresaatravesId(UUID idEmpresa);
	void patchAlteraEmpresa(UUID idEmpresa, @Valid EmpresaAlteracaoRequest empresaAlteracaoRequest);

}
