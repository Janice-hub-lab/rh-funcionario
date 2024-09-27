package br.com.rh.funcionario.empresa_funcionario.empresa.application.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.rh.funcionario.empresa_funcionario.empresa.application.service.EmpresaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class EmpresaController implements EmpresaAPI {

	private final EmpresaService empresaService;

	@Override
	public EmpresaResponse postEmpresa(EmpresaRequest empresaRequest) {
		log.info("[inicia] EmpresaController - postEmpresa");
		EmpresaResponse empresaCriada = empresaService.criaEmpresa(empresaRequest);
		log.info("[finaliza] EmpresaController - postEmpresa");
		return empresaCriada;
	}

}
