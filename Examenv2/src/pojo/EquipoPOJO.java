/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author foxfa
 */
public class EquipoPOJO {
    private int idEquipo;
    private String nombre;
    private int Tipo_Equipo_idTipo_Equipo;

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo_Equipo_idTipo_Equipo() {
        return Tipo_Equipo_idTipo_Equipo;
    }

    public void setTipo_Equipo_idTipo_Equipo(int Tipo_Equipo_idTipo_Equipo) {
        this.Tipo_Equipo_idTipo_Equipo = Tipo_Equipo_idTipo_Equipo;
    }
}
