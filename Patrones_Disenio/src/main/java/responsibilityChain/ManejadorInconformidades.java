package responsibilityChain;

public abstract class ManejadorInconformidades implements InconformidadHandler{

	InconformidadHandler siguienteHandler;
	
	public void setSiguienteHandler(InconformidadHandler h) {
		this.siguienteHandler=h;
	}
	
}
