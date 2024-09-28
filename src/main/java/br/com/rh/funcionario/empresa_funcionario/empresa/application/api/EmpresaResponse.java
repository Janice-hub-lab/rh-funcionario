package br.com.rh.funcionario.empresa_funcionario.empresa.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class EmpresaResponse {
	private UUID idEmpresa;

}
