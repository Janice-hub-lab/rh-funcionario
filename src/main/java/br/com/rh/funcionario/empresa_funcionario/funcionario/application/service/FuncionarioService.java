package br.com.rh.funcionario.empresa_funcionario.funcionario.application.service;

import java.util.UUID;

import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioRequest;
import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioResponse;
import jakarta.validation.Valid;

public interface FuncionarioService {

	FuncionarioResponse criaFuncionario(UUID idEmpresa, @Valid FuncionarioRequest funcionarioRequest);

}
