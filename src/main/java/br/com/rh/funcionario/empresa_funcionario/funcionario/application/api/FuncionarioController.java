package br.com.rh.funcionario.empresa_funcionario.funcionario.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.rh.funcionario.empresa_funcionario.funcionario.application.service.FuncionarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {

	private final FuncionarioService funcionarioService;
	@Override
	public FuncionarioResponse postFuncionario(UUID idEmpresa, @Valid FuncionarioRequest funcionarioRequest) {
		log.info("[inicia] FuncionarioController - postFuncionario");
		log.info("[idEmpresa] {}", idEmpresa);
		FuncionarioResponse funcionario = funcionarioService.criaFuncionario(idEmpresa, funcionarioRequest);
		log.info("[finaliza] FuncionarioController - postFuncionario");
		return funcionario;
	}
	@Override
	public List<FuncionarioEmpresaListResponse> getFuncionariosEmpresaComId(UUID idEmpresa) {
		log.info("[inicia] FuncionarioController - getFuncionariosEmpresaComId");
		log.info("[idEmpresa] {}", idEmpresa);
		List<FuncionarioEmpresaListResponse> funcionariosDaEmpresa = funcionarioService
				.buscaFuncionariosDaEmpresaComId(idEmpresa);
		log.info("[finaliza] FuncionarioController - getFuncionariosEmpresaComId");
		return funcionariosDaEmpresa;
	}
	@Override
	public FuncionarioEmpresaDetalheResponse getFuncionarioComId(UUID idEmpresa, UUID idFuncionario) {
		log.info("[inicia] FuncionarioController - getFuncionarioComId");
		log.info("[idEmpresa] {} - [idFuncionario] {}", idEmpresa, idFuncionario);
		FuncionarioEmpresaDetalheResponse funcionario = funcionarioService
				.buscaFuncionarioDaEmpresaComId(idEmpresa, idFuncionario);
		log.info("[finaliza] FuncionarioController - getFuncionarioComId");
		return funcionario;
	}
	@Override
	public void deleteFuncionarioComId(UUID idEmpresa, UUID idFuncionario) {
		log.info("[inicia] FuncionarioController - deleteFuncionarioComId");
		log.info("[idEmpresa] {} - [idFuncionario] {}", idEmpresa, idFuncionario);
		log.info("[finaliza] FuncionarioController - deleteFuncionarioComId");
		
	}

}
