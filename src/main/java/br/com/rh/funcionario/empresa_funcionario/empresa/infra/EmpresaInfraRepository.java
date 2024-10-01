package br.com.rh.funcionario.empresa_funcionario.empresa.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.rh.funcionario.empresa_funcionario.empresa.application.repository.EmpresaRepository;
import br.com.rh.funcionario.empresa_funcionario.empresa.domain.Empresa;
import br.com.rh.funcionario.empresa_funcionario.empresa.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class EmpresaInfraRepository implements EmpresaRepository {

	private final empresaSpringDataJPARepository empresaSpringDataJPARepository;

	@Override
	public Empresa salva(Empresa empresa) {
		log.info("[inicia] EmpresaInfraRepository - salva");
		empresaSpringDataJPARepository.save(empresa);
		log.info("[finaliza] EmpresaInfraRepository - salva");
		return empresa;
	}

	@Override
	public List<Empresa> buscaTodasEmpresas() {
		log.info("[inicia] EmpresaInfraRepository - buscaTodasEmpresas");
		List<Empresa> todasEmpresas = empresaSpringDataJPARepository.findAll();
		log.info("[finaliza] EmpresaInfraRepository - buscaTodasEmpresas");
		return todasEmpresas;
	}

	@Override
	public Empresa buscaEmpresaAtravesId(UUID idEmpresa) {
		log.info("[inicia] EmpresaInfraRepository - buscaEmpresaAtravesId");
		Empresa empresa = empresaSpringDataJPARepository.findById(idEmpresa)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Empresa não encontrada!"));
		log.info("[finaliza] EmpresaInfraRepository - buscaEmpresaAtravesId");
		return empresa;
	}

}
