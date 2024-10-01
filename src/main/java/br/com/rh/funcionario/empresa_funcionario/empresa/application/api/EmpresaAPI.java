package br.com.rh.funcionario.empresa_funcionario.empresa.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/empresa")
public interface EmpresaAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	EmpresaResponse postEmpresa(@Valid @RequestBody EmpresaRequest empresaRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<EmpresaListResponse> getTodasEmpresas();
	
	@GetMapping(value = "/{idEmpresa}")
	@ResponseStatus(code = HttpStatus.OK)
	EmpresaDetalhadoResponse getEmpresaAtravesId(@PathVariable UUID idEmpresa);
	
	@DeleteMapping(value = "/{idEmpresa}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaEmpresaAtravesId(@PathVariable UUID idEmpresa);


}
