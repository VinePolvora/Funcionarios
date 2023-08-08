package br.com.santander.funcionarios.funcionarios.domain;

import br.com.santander.funcionarios.funcionarios.application.api.FuncinarioRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idFuncionario", updatable = false, unique = true, nullable = false)
	private UUID idFuncionario;
	@NotBlank
	private String nomeCompleto;
	@NotNull
	private String salario;
	@NotNull
	private Designacao designacao;
	@CPF
	@Column(unique = true)
	private String cpf;
	@Email
	@NotNull
	@Column(unique = true)
	private String email;
	@NotBlank
	private String telefone;
	@NotBlank
	private String endereco;
	@NotNull
	private LocalDate dataNascimento;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataDaAlteracaoDoCadastro;

	public Funcionario(FuncinarioRequest funcinarioRequest) {
		this.nomeCompleto = funcinarioRequest.getNomeCompleto();
		this.salario = funcinarioRequest.getSalario();
		this.designacao = funcinarioRequest.getDesignacao();
		this.cpf = funcinarioRequest.getCpf();
		this.email = funcinarioRequest.getEmail();
		this.telefone = funcinarioRequest.getTelefone();
		this.endereco = funcinarioRequest.getEndereco();
		this.dataNascimento = funcinarioRequest.getDataNascimento();
		this.sexo = funcinarioRequest.getSexo();
		this.estadoCivil = funcinarioRequest.getEstadoCivil();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
}
