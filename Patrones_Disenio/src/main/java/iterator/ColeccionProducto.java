/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iterator;

/**
 *
 * @author euclasio
 */
public interface ColeccionProducto {
    public void agregarProducto(Producto p);
    public void eliminarProducto(Producto p);
    public IteradorProducto crearCompradorWebIterador();
    public IteradorProducto crearVendedorTiendaIterador();
    public IteradorProducto crearProveedorIterador();
    public IteradorProducto crearMantenimientoIterador();
}
