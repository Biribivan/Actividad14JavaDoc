package Entidades;
/**
 * Esta Clase permite disparar al soldado y se ayuda de:
 * 		-Atributo estaMuerto
 * 		-Atributo numeroBalas
 * 
 * 		-Método puedeDisparar
 * 		-étodo disparar
 * 
 * 		-Getters & Setters
 * @author Biribivan :)
 * @version 1.0
 */
public class Soldado {
    private boolean estaMuerto;
    private int numeroBalas;

    public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

		
	/**
	 * Método que <b><u>devuelve</b></u> si un Soldado puede disparar o no.
	 * @return <b>'true'</b> si el valor del atributo <u>this.numeroBalas</u> es mayor a 0.
	 * Por lo contario devuelve <b>'false'</b>
	 * @author Biribivan :)
	 * @version 1.0
	 */
	public boolean puedeDisparar() {
    	if(this.numeroBalas > 0) {
           return true;
        }return false;
    }
	/**
	 * Método que <b><u>ejecuta la acción de disparar</b></u> a un soldado pasado por parametros.
	 * Cuando el valor del atributo numeroBalas decremente, dicho soldado muere.
	 * @param Objeto <b>'sol'</b> de soldado que va a ser disparado
	 * @author Biribivan :)
	 * @version 1.0
	 */
    public void disparar(Soldado sol) {
      this.numeroBalas--;
      sol.estaMuerto = true;
    }
}