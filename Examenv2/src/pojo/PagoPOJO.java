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
public class PagoPOJO {
    private int idPago;
    private Date fecha;
    private double monto;
    private String descripcion;
    private int Concepto_idConcepto;

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getConcepto_idConcepto() {
        return Concepto_idConcepto;
    }

    public void setConcepto_idConcepto(int Concepto_idConcepto) {
        this.Concepto_idConcepto = Concepto_idConcepto;
    }
}
