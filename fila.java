package engenharia3;

public class fila {

	
	private static fila instanciaUnica;
	
	 
	
		    private fila() {
		        
		    }
	 
		    
		    public static fila getInstancia() {
		        if (instanciaUnica == null) {
		            
		            synchronized (fila.class) {
		                if (instanciaUnica == null) {
		                    instanciaUnica = new fila();
		                }
		            }
		        }
		        return instanciaUnica;
		    }
	 
		    
		    public void adicionarDocumento(String documento) {
		        
		    }
	 
		    public void processarDocumentos() {
		        
		    }
		}

