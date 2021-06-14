package ar.com.ada.api.apicreditos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.apicreditos.entities.Cliente;
import ar.com.ada.api.apicreditos.entities.Prestamo;
import ar.com.ada.api.apicreditos.repos.ClienteRepository;
import ar.com.ada.api.apicreditos.repos.PrestamoRepository;

///Vamos a crear un service con la funcionalidad de traer todos los clientes y de grabar un cliente.

@Service
public class PrestamoService {

    @Autowired
    PrestamoRepository repository;

    public List<Prestamo> traerTodos(){
        return repository.findAll();
    }

    public void crearPrestamo(Prestamo prestamo){

        repository.save(prestamo);

    }
}
    

