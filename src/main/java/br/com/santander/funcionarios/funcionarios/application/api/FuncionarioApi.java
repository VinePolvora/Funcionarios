package br.com.santander.funcionarios.funcionarios.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/funcionarios")
public interface FuncionarioApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionarioResponse postFuncionario 
    (@Valid @RequestBody FuncinarioRequest funcinarioRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<FuncionarioListResponse> getTodosFuncionarios();

    @GetMapping(value = "/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.OK)
    FuncionarioDetalhadoResponse getFuncionarioAtravesId(@PathVariable UUID idFuncionario);

    @DeleteMapping(value = "/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaFuncionarioAtravesId(@PathVariable UUID idFuncionario);
    
    @PatchMapping(value = "/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void pathFuncionario 
    (@PathVariable UUID idFuncionario, @Valid @RequestBody FuncinarioAlteracaoRequest funcinarioAlteracaoRequest);
}
