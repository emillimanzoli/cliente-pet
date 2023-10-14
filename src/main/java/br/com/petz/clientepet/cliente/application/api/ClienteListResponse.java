package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.domain.Sexo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public class ClienteListResponse {
    private Long idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;

}
