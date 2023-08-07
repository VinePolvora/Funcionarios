package br.com.santander.funcionarios.funcionarios.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class FuncionarioController implements FuncionarioApi {
    @Override
    public FuncionarioResponse postFuncionario(FuncinarioRequest funcinarioRequest) {
        log.info("[inicia] FuncionarioController - postFuncionario");
        log.info("[finaliza ] FuncionarioController - postFuncionario");
        return null;
    }
}
