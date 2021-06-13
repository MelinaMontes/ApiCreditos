package ar.com.ada.api.apicreditos.excepciones;

import ar.com.ada.api.apicreditos.entities.*;

/**
 * ClienteInfoException
 */
public class ClienteInfoException extends Exception {

    private Cliente cliente;

    public ClienteInfoException(Cliente cliente, String mensaje) {

        super(cliente.getNombre() + ":" + mensaje);
        this.cliente = cliente;
    }
}
