package br.com.rh.funcionario.empresa_funcionario.empresa.application.repository;

import br.com.rh.funcionario.empresa_funcionario.empresa.domain.Empresa;


public interface EmpresaRepository {

	Empresa salva(Empresa empresa);
}
