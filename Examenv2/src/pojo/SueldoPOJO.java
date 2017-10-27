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
public class SueldoPOJO {
    private int id_pago_trabajador;
    private int dias_trabajados;
    private double subtotal;
    private double pago_extra;
    private double total;
    private Date fecha;
    private String notas;
    private int Trabajador_idTrabajador;

    public int getId_pago_trabajador() {
        return id_pago_trabajador;
    }

    public void setId_pago_trabajador(int id_pago_trabajador) {
        this.id_pago_trabajador = id_pago_trabajador;
    }

    public int getDias_trabajados() {
        return dias_trabajados;
    }

    public void setDias_trabajados(int dias_trabajados) {
        this.dias_trabajados = dias_trabajados;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getPago_extra() {
        return pago_extra;
    }

    public void setPago_extra(double pago_extra) {
        this.pago_extra = pago_extra;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public int getTrabajador_idTrabajador() {
        return Trabajador_idTrabajador;
    }

    public void setTrabajador_idTrabajador(int Trabajador_idTrabajador) {
        this.Trabajador_idTrabajador = Trabajador_idTrabajador;
    }
}
