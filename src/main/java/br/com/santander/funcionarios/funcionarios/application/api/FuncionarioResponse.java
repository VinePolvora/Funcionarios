package br.com.santander.funcionarios.funcionarios.application.api;

import lombok.Builder;
import lombok.Value;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;
@Value
@Builder
public class FuncionarioResponse {
    private UUID idFuncionario;
}
