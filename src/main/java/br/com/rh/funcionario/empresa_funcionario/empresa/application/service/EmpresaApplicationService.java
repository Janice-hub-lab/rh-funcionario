package br.com.rh.funcionario.empresa_funcionario.empresa.application.service;

import org.springframework.stereotype.Service;

import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaRequest;
import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class EmpresaApplicationService implements EmpresaService {

	@Override
	public EmpresaResponse criaEmpresa(EmpresaRequest empresaRequest) {
		log.info("[inicia] EmpresaApplicationService - criaEmpresa");
		log.info("[finaliza] EmpresaApplicationService - criaEmpresa");
		return null;
	}

}
