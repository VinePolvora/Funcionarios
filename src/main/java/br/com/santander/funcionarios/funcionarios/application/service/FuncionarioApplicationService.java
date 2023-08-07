package br.com.santander.funcionarios.funcionarios.application.service;

import br.com.santander.funcionarios.funcionarios.application.api.FuncinarioRequest;
import br.com.santander.funcionarios.funcionarios.application.api.FuncionarioResponse;
import br.com.santander.funcionarios.funcionarios.application.repository.FuncionarioRepository;
import br.com.santander.funcionarios.funcionarios.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService extends FuncionarioService {

    private final FuncionarioRepository funncionarioRepository;

    public FuncionarioResponse criaFuncionario(FuncinarioRequest funcinarioRequest) {
        log.info("[inicia] FuncionarioApplicationService - criaFuncionario");
        Funcionario funcionario = funncionarioRepository.salva(new Funcionario(funcinarioRequest));
        log.info("[finaliza] FuncionarioApplicationService - criaFuncionario");
        return FuncionarioResponse.builder()
                .idFuncionario(funcionario.getIdFuncionario())
                .build();
    }
}
