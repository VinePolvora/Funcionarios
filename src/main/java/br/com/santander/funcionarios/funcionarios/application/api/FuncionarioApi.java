package br.com.santander.funcionarios.funcionarios.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/funcionarios")
public interface FuncionarioApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionarioResponse postFuncionario (@Valid @RequestBody
                                         FuncinarioRequest funcinarioRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<FuncionarioListResponse> getTodosFuncionarios();

    @GetMapping(value = "/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.OK)
    FuncionarioDetalhadoResponse getFuncionarioAtravesId(@PathVariable UUID idFuncionario);

    @DeleteMapping(value = "/(idFuncionario)")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaFuncionarioAtravesId(@PathVariable UUID idFuncionario);
}
