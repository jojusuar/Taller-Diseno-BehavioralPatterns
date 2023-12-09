package responsibilityChain;

public class TecnicoHandler extends ManejadorInconformidades{

	@Override
	public String manejarInconformidad(Producto p) {
		
		String estadoInconformidad="No se puede resolver la inconformidad";
		
		if(cubiertoPorGarantia(p)) {
			System.out.println("El producto esta cubierto por la garantia");
			if(this.siguienteHandler!=null)
				estadoInconformidad=siguienteHandler.manejarInconformidad(p);
		}
		
		else
			System.out.println("El producto no esta cubierto por la garantia");
		
		return estadoInconformidad;
	}
	
	public boolean cubiertoPorGarantia(Producto p) {
		//logica para comprobar la garantia
		return true;
	}

}
