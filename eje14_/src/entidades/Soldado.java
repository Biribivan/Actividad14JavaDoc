package entidades;

public class Soldado {

    private boolean estaMuerto;

    private int numeroBalas;

   

    //Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada

   
    /**
     *Metodo que comprueba si un soldado puede disparar o no 
     * @return true si tiene balas, y false si no tiene
     * @author Reyson
     */
    public boolean puedeDisparar() {

                  if(this.numeroBalas > 0) {

                                return true;

                  }                          

                  return false;

    }

   

    public void disparar(Soldado sol) {

                  this.numeroBalas--;

                  sol.estaMuerto = true;

    }

}

//Requerimiento 2

//Documentar la siguiente clase

