package br.com.santander.funcionarios.funcionarios.application.repository;

import br.com.santander.funcionarios.funcionarios.domain.Funcionario;

import java.util.List;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);
    List<Funcionario> buscaTodosFuncionarios();
}
