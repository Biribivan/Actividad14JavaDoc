package Entidades;
/**
 * Clase Jugador que sirve para saber si está expulsado y para asignarle un dorsal a este.
 * 
 * Cuenta con: 
 * 		-Atributo dorsal
 * 		-Atributo numeroTarjetasAmarillas
 * 		-Atributo numeroTarjetasRojas
 * 
 * 		-Getters & Setters
 * 
 * 		-Método ponerDorsal
 * 		-Método estaExpulsado
 * 		@author Biribivan :)
 *	 	@version 1.0
 */
public class Jugador {

    private int dorsal;
    private int numeroTarjetasAmarillas;
    private int numeroTarjetasRojas;

    public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

		/**
		 * Método que <b>asigna</b> un valor comprendido entre 1 y 30 al dorsal pasado por parametro.
		 *
		 * si no es así se le restará una unidad al valor del atributo dorsal
		 * @param Parametro al cual se le asignará el valor
		 * @author Biribivan :)
		 * @version 1.0
		 */
	public void ponerDorsal(int dorsal) {
        if(dorsal >= 1 && dorsal <= 30) {
          this.dorsal = dorsal;
        }else {
          this.dorsal = -1;
        }
    }
	
	/**
	 * Método que devuelve si el Jugador esta expulsado o no
	 * @return <b>true</b> en caso de que el valor del atributo numeroTarjetasAmarillas sea igual a 2 o 
	 * que el valor del atributo numeroTarjetasRojas sea igual a 1.
	 * <b>false</b> si no se cumple ninguna de las anteriores
	 * @author Biribivan :)
	 * @version 1.0
	 */
    public boolean estaExpulsado() {
       boolean expulsado = false;                                                  
       if(numeroTarjetasAmarillas == 2) {
         expulsado = true;
         }                          
       if(numeroTarjetasRojas == 1) {
         expulsado = true;
         }return expulsado;                   
    }            
}
