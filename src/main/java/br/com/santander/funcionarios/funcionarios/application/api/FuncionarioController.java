package br.com.santander.funcionarios.funcionarios.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.santander.funcionarios.funcionarios.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioApi {
    private final FuncionarioService funcionarioService;

    @Override
    public FuncionarioResponse postFuncionario(FuncinarioRequest funcinarioRequest) {
        log.info("[inicia] FuncionarioController - postFuncionario");
        FuncionarioResponse funcionarioCriado = funcionarioService.criaFuncionario(funcinarioRequest);
        log.info("[finaliza ] FuncionarioController - postFuncionario");
        return funcionarioCriado;
    }

    @Override
    public List<FuncionarioListResponse> getTodosFuncionarios() {
        log.info("[inicia] FuncionarioController - getTodosFuncionarios");
        List<FuncionarioListResponse> funcionarios = funcionarioService.buscaTodosFuncionarios();
        log.info("[finaliza] FuncionarioController - getTodosFuncionarios");
        return funcionarios;
    }

    @Override
    public FuncionarioDetalhadoResponse getFuncionarioAtravesId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioController - getFuncionarioAtravesId");
        log.info("[idFuncionario] {}", idFuncionario);
        FuncionarioDetalhadoResponse funcionarioDetalhado = funcionarioService.buscaFuncionarioAtravesId(idFuncionario);
        log.info("[finaliza] FuncionarioController - getFuncionarioAtravesId");
        return funcionarioDetalhado;
    }

    @Override
    public void deletaFuncionarioAtravesId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioController - deletaFuncionarioAtravesId");
        log.info("[idFuncionario] {}", idFuncionario);
        funcionarioService.deletaFuncionarioAtravesId(idFuncionario);
        log.info("[finaliza] FuncionarioController - deletaFuncionarioAtravesId");
    }

	@Override
	public FuncionarioResponse pathFuncionario(UUID idFuncionario,
			@Valid FuncinarioAlteracaoRequest funcinarioAlteracaoRequest) {
		 log.info("[inicia] FuncionarioController - dpathFuncionario");
	     log.info("[idFuncionario] {}", idFuncionario);
	     log.info("[finaliza] FuncionarioController - dpathFuncionario");
		return null;
	}

}
