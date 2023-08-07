package br.com.santander.funcionarios.infra;

import br.com.santander.funcionarios.funcionarios.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FuncionarioSpringDataJPARepository extends JpaRepository<Funcionario, UUID> {
}
