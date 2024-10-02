package br.com.rh.funcionario.empresa_funcionario.funcionario.application.service;

import br.com.rh.funcionario.empresa_funcionario.funcionario.domain.Funcionario;

public interface FuncionarioRepository {

	Funcionario salvaFuncionario(Funcionario funcionario);

}
