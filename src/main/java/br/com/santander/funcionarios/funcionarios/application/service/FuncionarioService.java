package br.com.santander.funcionarios.funcionarios.application.service;

import br.com.santander.funcionarios.funcionarios.application.api.FuncinarioRequest;
import br.com.santander.funcionarios.funcionarios.application.api.FuncionarioListResponse;
import br.com.santander.funcionarios.funcionarios.application.api.FuncionarioResponse;

import java.util.List;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncinarioRequest funcinarioRequest);
    List<FuncionarioListResponse> buscaTodosFuncionarios();
}
