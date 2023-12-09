package responsibilityChain;

public class Main {

	public static void main(String[] args) {
		
		InconformidadHandler h1=new AsistenteHandler();
		InconformidadHandler h2=new TecnicoHandler();
		InconformidadHandler h3=new InventarioHandler();
		InconformidadHandler h4=new GerenteHandler();
		
		h1.setSiguienteHandler(h2);
		h2.setSiguienteHandler(h3);
		h3.setSiguienteHandler(h4);
		
		Producto p=new Producto("Producto 1",1200.75f);
		
		String resultadoInconformidad=h1.manejarInconformidad(p);
		System.out.println(resultadoInconformidad);
		
	}

}