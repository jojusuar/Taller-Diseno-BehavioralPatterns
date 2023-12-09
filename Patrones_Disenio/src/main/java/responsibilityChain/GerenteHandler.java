package responsibilityChain;

public class GerenteHandler extends ManejadorInconformidades{

	@Override
	public String manejarInconformidad(Producto p) {

		String estadoInconformidad="No se puede resolver la inconformidad";
		
		if(aprobarReposicion(p)) {
			System.out.println("Reposicion de producto aprobada");
			
			estadoInconformidad="Se pudo resolver la inconformidad";
		}
		
		else
			System.out.println("Reposicion de producto denegada");
		
		return estadoInconformidad;
	}

	
	public boolean aprobarReposicion(Producto p) {
		//logica para aprobar o denegar reposicion
		return true;
	}
}