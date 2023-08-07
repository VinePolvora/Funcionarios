package br.com.santander.funcionarios.funcionarios.application.api;

import lombok.Value;

import java.util.UUID;
@Value
public class FuncionarioListResponse {
    private UUID idFuncionario;
    private String nomeCompleto;
    private String cpf;
    private String email;
}
