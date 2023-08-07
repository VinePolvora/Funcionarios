package br.com.santander.funcionarios.funcionarios.domain;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idFuncionario;
   @NotNull
    private String nomeCompleto;
   @CPF
    private String cpf;
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


    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataDaAlteracaoDoCadastro;

    public funcionario(@NotNull String nomeCompleto, String cpf, String email,
                       String telefone, String endereco, @NotNull LocalDate dataNascimento,
                       Sexo sexo, EstadoCivil estadoCivil) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
}
