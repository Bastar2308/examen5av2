/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.sql.Date;



/**
 *
 * @author foxfa
 */
public class MantenimientoPOJO {
    private int idMantenimiento;
    private Date fecha_programada;
    private Date fecha;
    private String descripcion;
    private double costo;
    private int Equipo_idEquipo;

    public int getIdMantenimiento() {
        return idMantenimiento;
    }

    public void setIdMantenimiento(int idMantenimiento) {
        this.idMantenimiento = idMantenimiento;
    }

    public Date getFecha_programada() {
        return fecha_programada;
    }

    public void setFecha_programada(Date fecha_programada) {
        this.fecha_programada = fecha_programada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getEquipo_idEquipo() {
        return Equipo_idEquipo;
    }

    public void setEquipo_idEquipo(int Equipo_idEquipo) {
        this.Equipo_idEquipo = Equipo_idEquipo;
    }
}
