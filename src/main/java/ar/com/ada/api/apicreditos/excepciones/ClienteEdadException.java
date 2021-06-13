package ar.com.ada.api.apicreditos.excepciones;

import ar.com.ada.api.apicreditos.entities.*;

/**
 * ClienteEdadException
 */
public class ClienteEdadException extends ClienteInfoException {

    public ClienteEdadException(Cliente cliente, String mensaje) {
        super(cliente, mensaje);
    }

}
