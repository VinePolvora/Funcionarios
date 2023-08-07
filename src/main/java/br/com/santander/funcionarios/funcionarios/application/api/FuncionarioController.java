package br.com.santander.funcionarios.funcionarios.application.api;

import br.com.santander.funcionarios.funcionarios.application.service.FuncionarioApplicationService;
import br.com.santander.funcionarios.funcionarios.application.service.FuncionarioService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@AllArgsConstructor
public class FuncionarioController implements FuncionarioApi {
    private final FuncionarioApplicationService funcionarioApplicationService;

    @Override
    public FuncionarioResponse postFuncionario(FuncinarioRequest funcinarioRequest) {
        log.info("[inicia] FuncionarioController - postFuncionario");
        FuncionarioResponse funcionarioCriado = funcionarioApplicationService.criaFuncionario(funcinarioRequest);
        log.info("[finaliza ] FuncionarioController - postFuncionario");
        return null;
    }
}
