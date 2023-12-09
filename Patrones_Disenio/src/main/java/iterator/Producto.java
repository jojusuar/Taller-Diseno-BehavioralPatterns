/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator;

/**
 *
 * @author euclasio
 */
public class Producto {
    
    private String id;
    private String desc;
    private int precio;
    private EstadoProducto estado;

    public Producto(String id, String desc, int precio, EstadoProducto estado) {
        this.id = id;
        this.desc = desc;
        this.precio = precio;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getPrecio() {
        return precio;
    }

    public EstadoProducto getEstado() {
        return estado;
    }
}
