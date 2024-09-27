package br.com.rh.funcionario.empresa_funcionario.empresa.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class EmpresaController implements EmpresaAPI {

	@Override
	public EmpresaResponse postEmpresa(EmpresaRequest empresaRequest) {
		log.info("[inicia] EmpresaController - postEmpresa");
		log.info("[finaliza] EmpresaController - postEmpresa");
		return null;
	}

}
