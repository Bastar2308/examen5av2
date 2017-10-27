/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import dao.TrabajadorDAO;
import pojo.TrabajadorPOJO;


public class InsertaTrabajador {
    public static void main(String[] args) {
        TrabajadorDAO dao = new TrabajadorDAO();
        TrabajadorPOJO pojo = new TrabajadorPOJO();
        pojo.setNombre("Ramiro Bastar Gonzalez");
        pojo.setUsuario("bastar23");
        pojo.setContrasena("12345");
        pojo.setDireccion("casa");
        if (dao.insertaTrabajador(pojo)!=0) {
            System.out.println("Éxito, profe revise");
        }else{
            System.out.println("Aún no me voy =(");
        }
    }
}
