package br.com.rh.funcionario.empresa_funcionario.empresa.application.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/empresa")
public interface EmpresaAPI {
	
	EmpresaResponse postEmpresa(EmpresaRequest empresaRequest);
	

}
