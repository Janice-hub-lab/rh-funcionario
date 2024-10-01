package br.com.rh.funcionario.empresa_funcionario.empresa.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.rh.funcionario.empresa_funcionario.empresa.application.service.EmpresaService;
import jakarta.validation.Valid;
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

	@Override
	public List<EmpresaListResponse> getTodasEmpresas() {
		log.info("[inicia] EmpresaController - getTodasEmpresas");
		List<EmpresaListResponse> empresas = empresaService.buscaTodasEmpresas();
		log.info("[finaliza] EmpresaController - getTodasEmpresas");
		return empresas;
	}

	@Override
	public EmpresaDetalhadoResponse getEmpresaAtravesId(UUID idEmpresa) {
		log.info("[inicia] EmpresaController - getEmpresaAtravesId");
		log.info("[idEmpresa] {}", idEmpresa);
		log.info("[finaliza] EmpresaController - getEmpresaAtravesId");
		EmpresaDetalhadoResponse empresaDetalhado = empresaService.buscaEmpresaAtravesId(idEmpresa);
		return empresaDetalhado;
	}

	@Override
	public void deletaEmpresaAtravesId(UUID idEmpresa) {
		log.info("[inicia] EmpresaController - deletaEmpresaAtravesId");
		log.info("[idEmpresa] {}", idEmpresa);
		empresaService.deletaEmpresaatravesId(idEmpresa);
		log.info("[finaliza] EmpresaController - deletaEmpresaAtravesId");
		
	}

	@Override
	public void patchAlteraEmpresa(UUID idEmpresa, @Valid EmpresaAlteracaoRequest empresaAlteracaoRequest) {
		log.info("[inicia] EmpresaController - patchAlteraEmpresa");
		log.info("[idEmpresa] {}", idEmpresa);
		log.info("[finaliza] EmpresaController - patchAlteraEmpresa");
	}



}
