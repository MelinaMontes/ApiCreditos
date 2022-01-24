package ar.com.ada.api.apicreditos.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cancelacion")
public class Cancelacion {

    @Id
    @Column(name = "cancelacion_id")
    @GeneratedValue
    private int cancelacionId;

    @Column(name = "fecha_cancelacion")
    private Date fechaCancelacion;

    private BigDecimal importe;

    @Column(name = "cuota_pagada")
    private int cuota;

    public Cancelacion(Date fechaCancelacion, BigDecimal importe, int cuota) {
        this.fechaCancelacion = fechaCancelacion;
        this.importe = importe;
        this.cuota = cuota;
    }

    @ManyToOne
    @JoinColumn(name = "prestamo_id", referencedColumnName = "prestamo_id")
    Prestamo prestamo;

    public int getCancelacionId() {
        return cancelacionId;
    }

    public void setCancelacionId(int cancelacionId) {
        this.cancelacionId = cancelacionId;
    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

}
