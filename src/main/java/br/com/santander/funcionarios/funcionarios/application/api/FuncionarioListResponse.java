package br.com.santander.funcionarios.funcionarios.application.api;

import br.com.santander.funcionarios.funcionarios.domain.Funcionario;
import lombok.Getter;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
@Getter
public class FuncionarioListResponse {
    private UUID idFuncionario;
    private String nomeCompleto;
    private String cpf;
    private String email;

    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
        return funcionarios.stream().map(FuncionarioListResponse::new)
                .collect(Collectors.toList());
    }

    public FuncionarioListResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
        this.nomeCompleto = funcionario.getNomeCompleto();
        this.cpf = funcionario.getCpf();
        this.email = funcionario.getEmail();
    }
}
