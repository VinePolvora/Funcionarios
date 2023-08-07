package br.com.santander.funcionarios.funcionarios.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UUID;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idFuncionario;
   @NotNull
    private String nomeCliente;
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

    public funcionario(@NotNull String nomeCliente, String cpf, String email,
                       String telefone, String endereco, @NotNull LocalDate dataNascimento,
                       Sexo sexo, EstadoCivil estadoCivil) {
        this.nomeCliente = nomeCliente;
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
