package br.com.rh.funcionario.empresa_funcionario.empresa.infra;

import org.springframework.stereotype.Repository;

import br.com.rh.funcionario.empresa_funcionario.empresa.application.repository.EmpresaRepository;
import br.com.rh.funcionario.empresa_funcionario.empresa.domain.Empresa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class EmpresaInfraRepository implements EmpresaRepository {

	private final empresaSpringDataJPARepository empresaSprintDataJPARepository;

	@Override
	public Empresa salva(Empresa empresa) {
		log.info("[inicia] EmpresaInfraRepository - salva");
		empresaSprintDataJPARepository.save(empresa);
		log.info("[finaliza] EmpresaInfraRepository - salva");
		return empresa;
	}
}
