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
public class Compra_has_ProductoPOJO {
    private int Compra_idCompra;
    private int Producto_idProducto;
    private double cantidad;
    private double subtotal;

    public int getCompra_idCompra() {
        return Compra_idCompra;
    }

    public void setCompra_idCompra(int Compra_idCompra) {
        this.Compra_idCompra = Compra_idCompra;
    }

    public int getProducto_idProducto() {
        return Producto_idProducto;
    }

    public void setProducto_idProducto(int Producto_idProducto) {
        this.Producto_idProducto = Producto_idProducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
