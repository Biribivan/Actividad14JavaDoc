package entidades;
public class Soldado {

	/**
	 * Clase jugador, contiene dos atributos(estaMuerto y numeroBalas), ydos
	 * metodos (puedeDisparar y disparar)
	 * @author Gabriel
	 * @version v 1.1
	 */
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
			 * El método puedeDisparar, es un metodo booleano, que devuelve cuando puede disparar y 
			 * cuando no el soldado
			 * @return cuando atributo numeroBalas > 1 (true), puede disparar, sino (false), no puede
			 */

			public boolean puedeDisparar() {

                            if(this.numeroBalas > 0) {

                                          return true;

                            }                          

                            return false;

              }

             /**
              * El método disparar, recoge un soldado cualquiera (a escoger) al que disparamos,
              * se nos resta una bala del atributo numeroBalas e iguala el atributo estaMuerto del soldado 
              * pasado por parametro a true.
              * @param recoge un objeto soldado
              */

              public void disparar(Soldado sol) {

                            this.numeroBalas--;

                            sol.estaMuerto = true;

              }

}