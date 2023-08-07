package br.com.santander.funcionarios.funcionarios.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/funcionario")
public interface FuncionarioApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionarioResponse postFuncionario (@Valid @RequestBody
                                         FuncinarioRequest funcinarioRequest);
}
