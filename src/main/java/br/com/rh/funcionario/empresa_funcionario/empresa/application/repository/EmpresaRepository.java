package br.com.rh.funcionario.empresa_funcionario.empresa.application.repository;

import java.util.List;

import br.com.rh.funcionario.empresa_funcionario.empresa.application.api.EmpresaListResponse;
import br.com.rh.funcionario.empresa_funcionario.empresa.domain.Empresa;


public interface EmpresaRepository {
	Empresa salva(Empresa empresa);
	List<Empresa> buscaTodasEmpresas();
	
}
