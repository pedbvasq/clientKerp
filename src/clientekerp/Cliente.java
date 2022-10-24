/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientekerp;

/**
 *
 * @author Christian
 */
public class Cliente {

    private String nombre;
    private String cedulaRuc;
    private String correo;
    private String direccion;

    public Cliente(String nombre, String cedulaRuc, String correo, String direccion) {
        this.nombre = nombre;
        this.cedulaRuc = cedulaRuc;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedulaRuc() {
        return cedulaRuc;
    }

    public void setCedulaRuc(String cedulaRuc) {
        this.cedulaRuc = cedulaRuc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", cedulaRuc=" + cedulaRuc + ", correo=" + correo + ", direccion=" + direccion + '}';
    }

    
}
