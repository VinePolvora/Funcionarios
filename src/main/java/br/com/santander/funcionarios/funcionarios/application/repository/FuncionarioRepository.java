package br.com.santander.funcionarios.funcionarios.application.repository;

import br.com.santander.funcionarios.funcionarios.domain.Funcionario;

import java.util.List;
import java.util.UUID;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);
    List<Funcionario> buscaTodosFuncionarios();
    Funcionario buscaFuncionarioAtravesId(UUID idFuncionario);
	void deletaFuncionarioAtravesId(Funcionario funcionario);
}
