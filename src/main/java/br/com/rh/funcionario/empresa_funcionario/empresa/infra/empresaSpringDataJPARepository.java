package br.com.rh.funcionario.empresa_funcionario.empresa.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rh.funcionario.empresa_funcionario.empresa.domain.Empresa;

public interface empresaSpringDataJPARepository extends JpaRepository<Empresa, UUID>  {

}
