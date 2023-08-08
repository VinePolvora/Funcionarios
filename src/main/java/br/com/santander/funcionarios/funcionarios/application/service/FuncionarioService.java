package br.com.santander.funcionarios.funcionarios.application.service;

import java.util.List;
import java.util.UUID;

import br.com.santander.funcionarios.funcionarios.application.api.FuncinarioAlteracaoRequest;
import br.com.santander.funcionarios.funcionarios.application.api.FuncinarioRequest;
import br.com.santander.funcionarios.funcionarios.application.api.FuncionarioDetalhadoResponse;
import br.com.santander.funcionarios.funcionarios.application.api.FuncionarioListResponse;
import br.com.santander.funcionarios.funcionarios.application.api.FuncionarioResponse;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncinarioRequest funcinarioRequest);
    List<FuncionarioListResponse> buscaTodosFuncionarios();
    FuncionarioDetalhadoResponse buscaFuncionarioAtravesId(UUID idFuncionario);
	void deletaFuncionarioAtravesId(UUID idFuncionario);
	void alteraFuncionarioAtravesId(UUID idFuncionario,FuncinarioAlteracaoRequest funcinarioAlteracaoRequest);
}
