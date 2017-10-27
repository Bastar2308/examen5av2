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
public class Entrada_SalidaPOJO {
    private int idEntrada_Salida;
    private String tipo;
    private Timestamp hora;
    private int Trabajador_idTrabajador;

    public int getIdEntrada_Salida() {
        return idEntrada_Salida;
    }

    public void setIdEntrada_Salida(int idEntrada_Salida) {
        this.idEntrada_Salida = idEntrada_Salida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Timestamp getHora() {
        return hora;
    }

    public void setHora(Timestamp hora) {
        this.hora = hora;
    }

    public int getTrabajador_idTrabajador() {
        return Trabajador_idTrabajador;
    }

    public void setTrabajador_idTrabajador(int Trabajador_idTrabajador) {
        this.Trabajador_idTrabajador = Trabajador_idTrabajador;
    }
}
