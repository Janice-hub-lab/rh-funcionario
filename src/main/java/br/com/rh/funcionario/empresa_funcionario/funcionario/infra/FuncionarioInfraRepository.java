package br.com.rh.funcionario.empresa_funcionario.funcionario.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.rh.funcionario.empresa_funcionario.empresa.handler.APIException;
import br.com.rh.funcionario.empresa_funcionario.funcionario.application.service.FuncionarioRepository;
import br.com.rh.funcionario.empresa_funcionario.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {
	private final FuncionarioSpringDataJPARepository funcionarioSpringDataJPARepository;

	@Override
	public Funcionario salvaFuncionario(Funcionario funcionario) {
		log.info("[start] FuncionarioInfraRepository - salvaFuncionario");
		funcionarioSpringDataJPARepository.save(funcionario);
		log.info("[finish] FuncionarioInfraRepository - salvaFuncionario");
		return funcionario;
	}

	@Override
	public List<Funcionario> buscaFuncionariosDaEmpresaComId(UUID idEmpresa) {
		log.info("[start] FuncionarioInfraRepository - buscaFuncionariosDaEmpresaComId");
		var funcionarios = funcionarioSpringDataJPARepository.findByIdEmpresa(idEmpresa);
		log.info("[finish] FuncionarioInfraRepository - buscaFuncionariosDaEmpresaComId");
		return funcionarios;
	}

	@Override
	public Funcionario buscaFuncionario(UUID idFuncionario) {
		log.info("[start] FuncionarioInfraRepository - buscaFuncionario");
		var funcionario = funcionarioSpringDataJPARepository.findById(idFuncionario)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Funcionario não encontrado para o ID =" + idFuncionario));
		log.info("[finish] FuncionarioInfraRepository - buscaFuncionario");
		return funcionario;
	}

	@Override
	public void deletaFuncionario(Funcionario funcionario) {
		log.info("[start] FuncionarioInfraRepository - deletaFuncionario");
		funcionarioSpringDataJPARepository.delete(funcionario);
		log.info("[finish] FuncionarioInfraRepository - deletaFuncionario");
		
	}

}
