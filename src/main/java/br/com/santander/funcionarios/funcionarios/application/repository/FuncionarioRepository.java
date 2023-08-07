package br.com.santander.funcionarios.funcionarios.application.repository;

import br.com.santander.funcionarios.funcionarios.domain.Funcionario;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);
}
