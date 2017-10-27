/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.sql.Timestamp;

/**
 *
 * @author foxfa
 */
public class CompraPOJO {
    private int idCompra;
    private Timestamp hora;
    private double total;
    private int Trabajador_idTrabajador;
    private int Cliente_idCliente;

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Timestamp getHora() {
        return hora;
    }

    public void setHora(Timestamp hora) {
        this.hora = hora;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getTrabajador_idTrabajador() {
        return Trabajador_idTrabajador;
    }

    public void setTrabajador_idTrabajador(int Trabajador_idTrabajador) {
        this.Trabajador_idTrabajador = Trabajador_idTrabajador;
    }

    public int getCliente_idCliente() {
        return Cliente_idCliente;
    }

    public void setCliente_idCliente(int Cliente_idCliente) {
        this.Cliente_idCliente = Cliente_idCliente;
    }
}
