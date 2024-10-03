package br.com.rh.funcionario.empresa_funcionario.funcionario.application.service;

import java.util.List;
import java.util.UUID;

import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioAlteracaoRequest;
import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioEmpresaDetalheResponse;
import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioEmpresaListResponse;
import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioRequest;
import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioResponse;
import jakarta.validation.Valid;

public interface FuncionarioService {
	FuncionarioResponse criaFuncionario(UUID idEmpresa, @Valid FuncionarioRequest funcionarioRequest);
	List<FuncionarioEmpresaListResponse> buscaFuncionariosDaEmpresaComId(UUID idEmpresa);
	FuncionarioEmpresaDetalheResponse buscaFuncionarioDaEmpresaComId(UUID idEmpresa, UUID idFuncionario);
	void deletaFuncionarioDaEmpresaComId(UUID idEmpresa, UUID idFuncionario);
	void alteraFuncionarioDaEmpresaComId(UUID idEmpresa, UUID idFuncionario,
			FuncionarioAlteracaoRequest funcionarioAlteracaoRequest);
}
