package br.com.rh.funcionario.empresa_funcionario.funcionario.application.api;

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

import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaDetalhadoResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/empresa/{idEmpresa}/funcionario")
public interface FuncionarioAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	FuncionarioResponse postFuncionario(@PathVariable UUID idEmpresa, 
			@Valid @RequestBody FuncionarioRequest funcionarioRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<FuncionarioEmpresaListResponse> getFuncionariosEmpresaComId
	(@PathVariable UUID idEmpresa);
	
	@GetMapping(value = "/{idFuncionario}")
	@ResponseStatus(code = HttpStatus.OK)
	FuncionarioEmpresaDetalheResponse getFuncionarioComId(@PathVariable 
			UUID idEmpresa, @PathVariable UUID idFuncionario);
	
	@DeleteMapping(value = "/{idFuncionario}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deleteFuncionarioComId(@PathVariable UUID idEmpresa, @PathVariable UUID idFuncionario);
	

}
