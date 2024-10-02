package br.com.rh.funcionario.empresa_funcionario.funcionario.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.rh.funcionario.empresa_funcionario.empresa.application.service.EmpresaService;
import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioEmpresaDetalheResponse;
import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioEmpresaListResponse;
import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioRequest;
import br.com.rh.funcionario.empresa_funcionario.funcionario.application.api.FuncionarioResponse;
import br.com.rh.funcionario.empresa_funcionario.funcionario.domain.Funcionario;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
	private final EmpresaService empresaService;
	private final FuncionarioRepository funcionarioRepository;

	@Override
	public FuncionarioResponse criaFuncionario(UUID idEmpresa, @Valid FuncionarioRequest funcionarioRequest) {
		log.info("[start] FuncionarioApplicationService - criaFuncionario");
		empresaService.buscaEmpresaAtravesId(idEmpresa);
		Funcionario funcionario = funcionarioRepository.salvaFuncionario(new Funcionario(idEmpresa, funcionarioRequest));
		log.info("[finish] FuncionarioApplicationService - criaFuncionario");
		return new FuncionarioResponse(funcionario.getIdFuncionario());
	}

	@Override
	public List<FuncionarioEmpresaListResponse> buscaFuncionariosDaEmpresaComId(UUID idEmpresa) {
		log.info("[start] FuncionarioApplicationService - buscaFuncionariosDaEmpresaComId");
		empresaService.buscaEmpresaAtravesId(idEmpresa);
		List<Funcionario> funcionariosDaEmpresa = funcionarioRepository
				.buscaFuncionariosDaEmpresaComId(idEmpresa);
		log.info("[finish] FuncionarioApplicationService - buscaFuncionariosDaEmpresaComId");
		return FuncionarioEmpresaListResponse.converte(funcionariosDaEmpresa);
	}

	@Override
	public FuncionarioEmpresaDetalheResponse buscaFuncionarioDaEmpresaComId(UUID idEmpresa, UUID idFuncionario) {
		log.info("[start] FuncionarioApplicationService - buscaFuncionarioDaEmpresaComId");
		empresaService.buscaEmpresaAtravesId(idEmpresa);
		Funcionario funcionario = funcionarioRepository
				.buscaFuncionario(idFuncionario);
		log.info("[finish] FuncionarioApplicationService - buscaFuncionarioDaEmpresaComId");
		return new FuncionarioEmpresaDetalheResponse(funcionario);
	}

}
