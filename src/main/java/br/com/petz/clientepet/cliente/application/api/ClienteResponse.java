package br.com.petz.clientepet.cliente.application.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ClienteResponse {
    private long idCliente;
}
