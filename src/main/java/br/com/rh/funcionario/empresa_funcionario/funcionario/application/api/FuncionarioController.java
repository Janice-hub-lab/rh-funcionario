package br.com.rh.funcionario.empresa_funcionario.funcionario.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class FuncionarioController implements FuncionarioAPI {

	@Override
	public FuncionarioResponse postFuncionario(UUID idEmpresa, @Valid FuncionarioRequest funcionarioRequest) {
		log.info("[inicia] FuncionarioController - postFuncionario");
		log.info("[idEmpresa] {}", idEmpresa);
		log.info("[finaliza] FuncionarioController - postFuncionario");
		return null;
	}

}
