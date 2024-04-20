package entidades;

public class MainJugador {

	public static void main(String[] args) {

		//Pruebas metodo ponerDorsal.
		
		//Prueba 1
		//Dorsal pasado por parametro 10
		//dorsal esperado 10
		 
		//Prueba 2
		////Dorsal pasado por parametro -11
		//dorsal esperado -1
		
		
		//Ejecutamos prueba 1
		Jugador j1 = new Jugador ();
		int dorsal1 = 10;
		int resultadoEsperado = 10;
		j1.ponerDorsal(dorsal1);
		if(resultadoEsperado == j1.getDorsal()) {
			System.out.println("Está bien.");
		}else {
			System.out.println("Está mal");
		}
		
		
		//Ejecutamos prueba 2
		Jugador j2 = new Jugador ();
		int dorsal2 = -11;
		resultadoEsperado = -1;
		//j2.setDorsal(dorsal2);
		j2.ponerDorsal(dorsal2);
		if(resultadoEsperado == j2.getDorsal()) {
			System.out.println("Está bien.");
		}else {
			System.out.println("Está mal");
		}
		
		
		//Pruebas metodo estaExpulsado.
		
		//Prueba 1
		//numeroTarjetasAmarillas pasado por parametro = 2
		//numeroTarjetasRojas pasado por parametro = 1
		//Resultado esperado (estaExpulsado) = true
			
		//Prueba 2
		//numeroTarjetasAmarillas pasado por parametro = 0
		//numeroTarjetasRojas pasado por parametro = 0
		//Resultado esperado (estaExpulsado) = false
		
				
		//Prueba 3
		//numeroTarjetasAmarillas pasado por parametro = 3
		//numeroTarjetasRojas pasado por parametro = 4
		//Resultado esperado (estaExpulsado) = false
				
		//Ejecutamos prueba 1
		
		Jugador j3 = new Jugador ();
		int numeroTarjetasAmarillas1 = 2;
		int numeroTarjetasRojas1 = 1;
		boolean resultadoEsperado2 = true;
		j3.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas1);
		j3.setNumeroTarjetasRojas(numeroTarjetasRojas1);
		boolean resultadoObtenido2 = j3.estaExpulsado();
		if(resultadoEsperado2 == resultadoObtenido2) {
			System.out.println("Está bien.");
		}else {
			System.out.println("Está mal");
		}
		
		//Ejecutamos prueba 2
		
		Jugador j4 = new Jugador ();
		numeroTarjetasAmarillas1 = 0;
		numeroTarjetasRojas1 = 0;
		resultadoEsperado2 = false;
		j4.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas1);
		j4.setNumeroTarjetasRojas(numeroTarjetasRojas1);
		resultadoObtenido2 = j4.estaExpulsado();
		if(resultadoEsperado2 == resultadoObtenido2) {
			System.out.println("Está bien.");
		}else {
			System.out.println("Está mal");
		}
		
		//Ejecutamos prueba 3
		
		Jugador j5 = new Jugador ();
		numeroTarjetasAmarillas1 = 3;
		numeroTarjetasRojas1 = 4;
		resultadoEsperado2 = false;
		j5.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas1);
		j5.setNumeroTarjetasRojas(numeroTarjetasRojas1);
		resultadoObtenido2 = j5.estaExpulsado();
		if(resultadoEsperado2 == resultadoObtenido2) {
			System.out.println("Está bien.");
		}else {
			System.out.println("Está mal");
		}
		
		 /*
		  * El metodo está mal hecho y en vez de reiniciarse para que no pase de 2 tarjetasAmarillas y de 1 tarjetaRoja
		  * solo acepta los valores 2 amarillas y 1 roja, por eso en el metodo 3 debería dar true si estuviese bien ;)
		  */
		
		
		
	}

}
