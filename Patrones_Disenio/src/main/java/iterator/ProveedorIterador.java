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
public class ProveedorIterador implements IteradorProducto {

    private List<Producto> coleccion;
    private int index;
    
    public ProveedorIterador(List<Producto> coleccion){
        for(Producto p: coleccion){
            if(p.getEstado()==EstadoProducto.FALLA_GARANTIA){
                this.coleccion.add(p);
            }
        }
    }
    
    @Override
    public boolean hasNext() {
       return index < coleccion.size();
    }

    @Override
    public Producto next() {
        if(hasNext()){
            Producto producto = coleccion.get(index);
            index++;
            return producto;
        }
        return null;
    }    
}
