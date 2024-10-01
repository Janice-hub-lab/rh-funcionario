package br.com.rh.funcionario.empresa_funcionario.funcionario.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioRequest;
import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioResponse;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class FuncionarioApplicationService implements FuncionarioService {

	@Override
	public FuncionarioResponse criaFuncionario(UUID idEmpresa, @Valid FuncionarioRequest funcionarioRequest) {
		log.info("[start] FuncionarioApplicationService - criaFuncionario");
		log.info("[finish] FuncionarioApplicationService - criaFuncionario");
		return null;
	}

}
