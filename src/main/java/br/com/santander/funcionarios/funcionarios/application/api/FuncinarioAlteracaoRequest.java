package br.com.santander.funcionarios.funcionarios.application.api;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.santander.funcionarios.funcionarios.domain.Designacao;
import br.com.santander.funcionarios.funcionarios.domain.EstadoCivil;
import br.com.santander.funcionarios.funcionarios.domain.Sexo;
import lombok.Value;
@Value
public class FuncinarioAlteracaoRequest {
	 @NotNull
	    private String nomeCompleto;
	    @NotNull
	    private String salario;
	    @NotNull
	    private Designacao designacao;
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
