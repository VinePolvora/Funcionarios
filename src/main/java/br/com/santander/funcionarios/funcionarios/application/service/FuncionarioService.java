package br.com.santander.funcionarios.funcionarios.application.service;

import br.com.santander.funcionarios.funcionarios.application.api.FuncinarioRequest;
import br.com.santander.funcionarios.funcionarios.application.api.FuncionarioDetalhadoResponse;
import br.com.santander.funcionarios.funcionarios.application.api.FuncionarioListResponse;
import br.com.santander.funcionarios.funcionarios.application.api.FuncionarioResponse;

import java.util.List;
import java.util.UUID;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncinarioRequest funcinarioRequest);
    List<FuncionarioListResponse> buscaTodosFuncionarios();
    FuncionarioDetalhadoResponse buscaFuncionarioAtravesId(UUID idFuncionario);
}
