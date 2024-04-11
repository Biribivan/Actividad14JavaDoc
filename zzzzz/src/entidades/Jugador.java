package entidades;
public class Jugador {
/**
 * Esta es una clase jugador, la cual tiene 3 atributos, que nos ayudan
 * a conocer su dorsal, el numero de amarillas, y el de rojas, ademas de
 * dos metodos los cuales recogen el dorsal que le quieras ingresar al jugador 
 * y si un jugador está exulsado o no.
 * @author Gabriel
 * @version v 1.1
 */
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
			 * Este metodo recoge el dorsal por parametro de entrada, si es mayor que cero y menor que 31, iguala
			 * el dato introducido por parametro de entrada a el atributo este dorsal de el jugador., sino se cumplen los requisitos se iguala este dorsal a -1.
			 * @param <b>dorsal<b>
			 */
			public void ponerDorsal(int dorsal) {

                            if(dorsal >= 1 && dorsal <= 30) {

                                          this.dorsal = dorsal;

                            }else {

                                          this.dorsal = -1;

                            }

              }

             
			/**
			 * Este metodo devuelve si un jugador esta expulsado o no, dependiendo del numero de tarjetas
			 * amarillas(2) o rojas (1).
			 * @return si está (true) cuando se cumple atributos numeroTarjetasAmarillas = 2
			 * o atributo numeroTarjetasRojas = 1, sino devuelve false (no está expulsado).
			 */
              public boolean estaExpulsado() {

                            boolean expulsado = false;                                                  

                            if(numeroTarjetasAmarillas == 2) {

                                          expulsado = true;

                            }                          

                            if(numeroTarjetasRojas == 1) {

                                          expulsado = true;

                            }                          

                            return expulsado;

              }            

}