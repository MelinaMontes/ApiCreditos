package ar.com.ada.api.apicreditos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.apicreditos.entities.Cliente;
import ar.com.ada.api.apicreditos.entities.Prestamo;
import ar.com.ada.api.apicreditos.models.GenericResponse;
import ar.com.ada.api.apicreditos.services.ClienteService;
import ar.com.ada.api.apicreditos.services.PrestamoService;

@RestController

public class PrestamoController {
    @Autowired
    PrestamoService service;
    @GetMapping("/prestamos")
    public ResponseEntity<List<Prestamo>> traerTodos() {
        return ResponseEntity.ok(service.traerTodos());

    }


}
