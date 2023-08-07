package br.com.santander.funcionarios.funcionarios.application.service;

import br.com.santander.funcionarios.funcionarios.application.api.FuncinarioRequest;
import br.com.santander.funcionarios.funcionarios.application.api.FuncionarioResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class FuncionarioApplicationService extends FuncionarioService {

    public FuncionarioResponse criaFuncionario(FuncinarioRequest funcinarioRequest) {
        log.info("[inicia] FuncionarioApplicationService - criaFuncionario");
        log.info("[finaliza] FuncionarioApplicationService - criaFuncionario");
        return null;
    }
}
