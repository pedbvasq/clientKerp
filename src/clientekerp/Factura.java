/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientekerp;

/**
 *
 * @author Christian
 */
public class Factura {

    private String subtotal;
    private String iva;
    private String descuento;

    @Override
    public String toString() {
        return "Factura{" + "subtotal=" + subtotal + ", iva=" + iva + ", descuento=" + descuento + ", total=" + total + '}';
    }

    public Factura(String subtotal, String iva, String descuento, String total) {
        this.subtotal = subtotal;
        this.iva = iva;
        this.descuento = descuento;
        this.total = total;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    private String total;
}
