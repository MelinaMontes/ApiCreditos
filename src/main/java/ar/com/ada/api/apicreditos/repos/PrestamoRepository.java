package ar.com.ada.api.apicreditos.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.ada.api.apicreditos.entities.*;

public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {
    
}
