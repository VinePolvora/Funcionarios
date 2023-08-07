package br.com.santander.funcionarios.funcionarios.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/funcionarios")
public interface FuncionarioApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionarioResponse postFuncionario (@Valid @RequestBody
                                         FuncinarioRequest funcinarioRequest);
}
