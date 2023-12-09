package responsibilityChain;

public class AsistenteHandler extends ManejadorInconformidades{

	@Override
	public String manejarInconformidad(Producto p) {
		
		String estadoInconformidad="No se puede resolver la inconformidad";
		
		if(verificarGarantia(p)) {
			System.out.println("Garantia verificada exitosamente");
			if(this.siguienteHandler!=null)
				estadoInconformidad=siguienteHandler.manejarInconformidad(p);
		}
		
		else 
			System.out.println("No se pudo verificar la garantia");
		
		return estadoInconformidad;
	}

	public boolean verificarGarantia(Producto p) {
		//logica para verificar la garantia
		return true;
	}
	
}
