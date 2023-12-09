/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator;

import java.util.List;

/**
 *
 * @author euclasio
 */
class BodegaProducto implements ColeccionProducto{
    private List<Producto> inventario;

    @Override
    public void agregarProducto(Producto p) {
        inventario.add(p);
    }

    @Override
    public void eliminarProducto(Producto p) {
        inventario.remove(p);
    }


    @Override
    public IteradorProducto crearCompradorWebIterador() {
        IteradorProducto itr = new CompradorWebIterador(inventario);
        return itr;
    }

    @Override
    public IteradorProducto crearVendedorTiendaIterador() {
        IteradorProducto itr = new VendedorTiendaIterador(inventario);
        return itr;
    }

    @Override
    public IteradorProducto crearProveedorIterador() {
        IteradorProducto itr = new ProveedorIterador(inventario);
        return itr;
    }

    @Override
    public IteradorProducto crearMantenimientoIterador() {
        IteradorProducto itr = new MantenimientoIterador(inventario);
        return itr;
    }
}
