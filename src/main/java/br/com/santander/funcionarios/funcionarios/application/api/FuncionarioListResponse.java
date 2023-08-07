package br.com.santander.funcionarios.funcionarios.application.api;

import br.com.santander.funcionarios.funcionarios.domain.Funcionario;
import lombok.Value;

import java.util.List;
import java.util.UUID;
@Value
public class FuncionarioListResponse {
    private UUID idFuncionario;
    private String nomeCompleto;
    private String cpf;
    private String email;

    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
        return null;
    }
}
