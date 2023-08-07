package br.com.santander.funcionarios.funcionarios.application.api;

import br.com.santander.funcionarios.funcionarios.domain.EstadoCivil;
import br.com.santander.funcionarios.funcionarios.domain.Sexo;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;
@Value
public class FuncinarioRequest {

    @NotNull
    private String nomeCompleto;
    @CPF
    private String cpf;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String telefone;
    @NotBlank
    private String endereco;
    @NotNull
    private LocalDate dataNascimento;
    private Sexo sexo;
    private EstadoCivil estadoCivil;
}
