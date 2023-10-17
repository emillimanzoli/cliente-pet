package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.domain.Sexo;
import lombok.Value;

import java.time.LocalDateTime;

public class ClienteDetalhadoResponse {
    @Value
    public class ClienteListResponse {
        private Long idCliente;
        private String nomeCompleto;
        private String cpf;
        private String email;
        private String celular;
        private String telefone;
        private Sexo sexo;
        private Boolean aceitaTermos;
        private LocalDateTime dataHoraDoCadastro;
    }
}
