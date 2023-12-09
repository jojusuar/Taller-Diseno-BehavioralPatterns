package responsibilityChain;

public class InventarioHandler extends ManejadorInconformidades{

	@Override
	public String manejarInconformidad(Producto p) {

		String estadoInconformidad="No se puede resolver la inconformidad";
		
		if(existeEnBodega(p)) {
			System.out.println("Hay producto existente en la bodega");
			
			if(p.getPrecio()>1000) {
				System.out.println("Reposicion de producto debe ser aprobada por gerente");
				
				if(this.siguienteHandler!=null)
					estadoInconformidad=siguienteHandler.manejarInconformidad(p);
			}
			else
				estadoInconformidad="Se pudo resolver la inconformidad";
		}
		
		else
			System.out.println("No hay producto existente en la bodega");
		
		return estadoInconformidad;
	}

	public boolean existeEnBodega(Producto p) {
		//logica para verificar si existe en inventario
		return true;
	}
	
}