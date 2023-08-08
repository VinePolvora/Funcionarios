package br.com.santander.funcionarios.infra;

import br.com.santander.funcionarios.funcionarios.application.repository.FuncionarioRepository;
import br.com.santander.funcionarios.funcionarios.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {
    private final FuncionarioSpringDataJPARepository funcionarioSpringDataJPARepository;

    @Override
    public Funcionario salva(Funcionario funcionario) {
        log.info("[inicia] FuncionarioInfraRepository - salva");
        funcionarioSpringDataJPARepository.save(funcionario);
        log.info("[finaliza] FuncionarioInfraRepository - salva");
        return funcionario;
    }

    @Override
    public List<Funcionario> buscaTodosFuncionarios() {
        log.info("[inicia] FuncionarioInfraRepository - buscaTodosFuncionarios");
        List<Funcionario> todosFuncionarios = funcionarioSpringDataJPARepository.findAll();
        log.info("[finaliza] FuncionarioInfraRepository - buscaTodosFuncionarios");
        return todosFuncionarios;
    }
}
