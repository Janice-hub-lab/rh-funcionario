package br.com.rh.funcionario.empresa_funcionario.funcionario.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rh.funcionario.empresa_funcionario.funcionario.domain.Funcionario;
import java.util.List;


public interface FuncionarioSpringDataJPARepository extends JpaRepository<Funcionario, UUID> {
	List<Funcionario> findByIdEmpresa(UUID idEmpresa);

}
