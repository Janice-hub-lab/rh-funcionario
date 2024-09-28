package br.com.rh.funcionario.empresa_funcionario.empresa.infra;

import org.springframework.stereotype.Repository;

import br.com.rh.funcionario.empresa_funcionario.empresa.application.repository.EmpresaRepository;
import br.com.rh.funcionario.empresa_funcionario.empresa.domain.Empresa;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class EmpresaInfraRepository implements EmpresaRepository {

	@Override
	public Empresa salva(Empresa empresa) {
		log.info("[inicia] EmpresaInfraRepository - salva");
		log.info("[finaliza] EmpresaInfraRepository - salva");
		return empresa;
	}

}
