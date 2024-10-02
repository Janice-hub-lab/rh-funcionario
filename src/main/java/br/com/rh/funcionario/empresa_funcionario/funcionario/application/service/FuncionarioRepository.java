package br.com.rh.funcionario.empresa_funcionario.funcionario.application.service;

import java.util.List;
import java.util.UUID;

import br.com.rh.funcionario.empresa_funcionario.funcionario.domain.Funcionario;

public interface FuncionarioRepository {
	Funcionario salvaFuncionario(Funcionario funcionario);
	List<Funcionario> buscaFuncionariosDaEmpresaComId(UUID idEmpresa);
	Funcionario buscaFuncionario(UUID idFuncionario);
}
