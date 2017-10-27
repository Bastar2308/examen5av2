/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.sun.org.apache.bcel.internal.generic.TABLESWITCH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pojo.TrabajadorPOJO;

public class TrabajadorDAO {

    private static final String SQL_TABLE="trabajador";
    private static final String SQL_INSERT="Insert into "+SQL_TABLE+
            " (nombre,direccion,usuario,contrasena,foto,telefono,sueldo_diario) "+
            " values (?,?,?,?,?,?,?)";    
    
    public TrabajadorPOJO inflaTrabajador(ResultSet rs) {
        TrabajadorPOJO pojo = new TrabajadorPOJO();
        try {
            ////Cuidar tipos de datos y los nombres son IDENTICOS a la BD
            pojo.setIdTrabajador(rs.getInt("idTrabajador"));
            pojo.setNombre(rs.getString("nombre"));
            pojo.setUsuario(rs.getString("usuario"));
            pojo.setTelefono(rs.getString("telefono"));
            pojo.setContrasena(rs.getString("contrasena"));
            pojo.setDireccion(rs.getString("direccion"));
            pojo.setFoto(rs.getBlob("foto"));
            pojo.setSueldo_diario(rs.getDouble("sueldo_diario"));

        } catch (Exception e) {
            System.out.println("Error al inflar el pojo " + e);
        }
        return pojo;
    }

    public TrabajadorPOJO iniciaSesion(String usuario, String contrasena) {
        TrabajadorPOJO pojo = new TrabajadorPOJO();
        Connection con = null;
        try {
            String consulta = "Select * from trabajador where usuario='"
                    + usuario + "' and contrasena ='" + contrasena + "' ";
            con = Conexion.getConnection();
            PreparedStatement st = con.prepareStatement(consulta);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                pojo = inflaTrabajador(rs);
            }
        } catch (Exception e) {
            System.out.println("Error en login " + e);
        }
        return pojo;
    }
    
    public int insertaTrabajador(TrabajadorPOJO pojo){
        Connection con=null;
        PreparedStatement st=null;
        int id=0;
        try {
            con=Conexion.getConnection();
            st=con.prepareStatement(SQL_INSERT,PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, pojo.getNombre());
            st.setString(2, pojo.getDireccion());
            st.setString(3, pojo.getUsuario());
            st.setString(4, pojo.getContrasena());
            st.setBlob(5, pojo.getFoto());
            st.setString(6, pojo.getTelefono());
            st.setDouble(7, pojo.getSueldo_diario());
            id=st.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar trabajador "+e);
        }finally{
               Conexion.close(con);
               Conexion.close(st);
        }
        return id;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
