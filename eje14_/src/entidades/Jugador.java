package entidades;

public class Jugador {

    private int dorsal;

    private int numeroTarjetasAmarillas;

    private int numeroTarjetasRojas;

                 

//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada


/**
 * 
 * @param dorsal
 */
    public void ponerDorsal(int dorsal) {

                  if(dorsal >= 1 && dorsal <= 30) {

                                this.dorsal = dorsal;

                  }else {

                                this.dorsal = -1;

                  }

    }

   /**
    * Este metodo sirve para comprobar si el jugador cumple con el numero
    *  de tarjetas para ser expulsado
    * @return Si el numero de tarjetas amarillas es igual a "2" retornará 
    * true y será expulsado 
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
}
