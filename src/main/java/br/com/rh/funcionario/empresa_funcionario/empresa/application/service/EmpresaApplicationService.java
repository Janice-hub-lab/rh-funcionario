package br.com.rh.funcionario.empresa_funcionario.empresa.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaDetalhadoResponse;
import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaListResponse;
import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaRequest;
import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaResponse;
import br.com.rh.funcionario.empresa_funcionario.empresa.application.repository.EmpresaRepository;
import br.com.rh.funcionario.empresa_funcionario.empresa.domain.Empresa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class EmpresaApplicationService implements EmpresaService {

	private final EmpresaRepository empresaRepository;

	@Override
	public EmpresaResponse criaEmpresa(EmpresaRequest empresaRequest) {
		log.info("[inicia] EmpresaApplicationService - criaEmpresa");
		Empresa empresa = empresaRepository.salva(new Empresa(empresaRequest));
		log.info("[finaliza] EmpresaApplicationService - criaEmpresa");
		return EmpresaResponse.builder()
				.idEmpresa(empresa.getIdEmpresa())
				.build();
	}

	@Override
	public List<EmpresaListResponse> buscaTodasEmpresas() {
		log.info("[inicia] EmpresaApplicationService - buscaTodasEmpresas");
		List<Empresa> empresas = empresaRepository.buscaTodasEmpresas();
		log.info("[finaliza] EmpresaApplicationService - buscaTodasEmpresas");
		return EmpresaListResponse.converte(empresas);
	}

	@Override
	public EmpresaDetalhadoResponse buscaEmpresaAtravesId(UUID idEmpresa) {
		log.info("[inicia] EmpresaApplicationService - buscaEmpresaAtravesId");
		log.info("[finaliza] EmpresaApplicationService - buscaEmpresaAtravesId");
		return null;
	}


	}

