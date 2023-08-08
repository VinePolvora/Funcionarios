package br.com.santander.funcionarios.funcionarios.application.api;

import br.com.santander.funcionarios.funcionarios.domain.Designacao;
import br.com.santander.funcionarios.funcionarios.domain.EstadoCivil;
import br.com.santander.funcionarios.funcionarios.domain.Funcionario;
import br.com.santander.funcionarios.funcionarios.domain.Sexo;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;
@Value
public class FuncionarioDetalhadoResponse {
    private UUID idFuncionario;
    private String nomeCompleto;
    private String salario;
    private Designacao designacao;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private LocalDate dataNascimento;
    private Sexo sexo;
    private EstadoCivil estadoCivil;

    public FuncionarioDetalhadoResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
        this.nomeCompleto = funcionario.getNomeCompleto();
        this.cpf = funcionario.getCpf();
        this.email = funcionario.getEmail();
        this.salario = funcionario.getSalario();
        this.designacao = funcionario.getDesignacao();
        this.telefone = funcionario.getTelefone();
        this.endereco = funcionario.getEndereco();
        this.dataNascimento = funcionario.getDataNascimento();
        this.sexo = funcionario.getSexo();
        this.estadoCivil = funcionario.getEstadoCivil();
    }
}
