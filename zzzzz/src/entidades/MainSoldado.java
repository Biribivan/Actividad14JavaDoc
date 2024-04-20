package entidades;

public class MainSoldado {

	public static void main(String[] args) {

		
		//Pruebas del metodo puedeDisparar.
		
		//Prueba 1
		//numeroBalas pasadas por parámetro = 2
		//Metodo Disparar, resultado esperado = true
		
				
		//Prueba 2
		//numeroBalas = 0
		//Metodo Disparar, resultado esperado = false
				
		//Prueba 3
		//numeroBalas = -3
		//Metodo Disparar, resultado esperado = false
		
		//Ejecutamos prueba 1
		Soldado s1 = new Soldado();
		int numeroBalas = 2;
		boolean resultadoEsperado = true;
		s1.setNumeroBalas(numeroBalas);
		boolean resultadoObtenido = s1.puedeDisparar();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("Está bien.");
		}else {
			System.out.println("Está mal");
		}
		
		
		//Ejecutamos prueba 2
		Soldado s2 = new Soldado();
		numeroBalas = 0;
		resultadoEsperado = false;
		s2.setNumeroBalas(numeroBalas);
		resultadoObtenido = s2.puedeDisparar();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("Está bien.");
		}else {
			System.out.println("Está mal");
		}
		
		//Ejecutamos prueba 3
		Soldado s3 = new Soldado();
		numeroBalas = -3;
		resultadoEsperado = false;
		s3.setNumeroBalas(numeroBalas);
		resultadoObtenido = s3.puedeDisparar();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("Está bien.");
		}else {
			System.out.println("Está mal");
		}
		
		//Pruebas del metodo disparar.
		
		
		//Prueba 1
		//numeroBalas pasadas por parámetro = 1
		//numeroBalas que se espera tener = 0
		//EstaMuerto que se espera obtener = true
		
		//Prueba 2
		//numeroBalas pasadas por parámetro = 0
		//numeroBalas que se espera tener = -1
		//EstaMuerto que se espera obtener = false
		
		
		//Ejecutamos prueba 1
		Soldado s4 = new Soldado();
		
		numeroBalas = 1;
		boolean resultadoEsperadoVida = true;
		int resultadoEsperadoBalas = 0;
		s4.setNumeroBalas(numeroBalas);
		s4.disparar(s3);
		boolean resultadoObtenidoVida = s3.isEstaMuerto();
		int resultadoObtenidoBalas = s4.getNumeroBalas();
		if(resultadoEsperadoVida == resultadoObtenidoVida) {
			System.out.println("Está bien.");
		}else {
			System.out.println("Está mal");
		}
		if(resultadoEsperadoBalas == resultadoObtenidoBalas) {
			System.out.println("Está bien.");
		}else {
			System.out.println("Está mal");
		}
		
		//Ejecutamos prueba 2
		Soldado s5 = new Soldado();
		
		numeroBalas = 0;
		resultadoEsperadoVida = false;
		resultadoEsperadoBalas = 0;
		s5.setNumeroBalas(numeroBalas);
		s5.disparar(s4);
		resultadoObtenidoVida = s4.isEstaMuerto();
		resultadoObtenidoBalas = s5.getNumeroBalas();
		if(resultadoEsperadoVida == resultadoObtenidoVida) {
			System.out.println("Está bien.");
		}else {
			System.out.println("Está mal");
		}
		if(resultadoEsperadoBalas == resultadoObtenidoBalas) {
			System.out.println("Está bien.");
		}else {
			System.out.println("Está mal");
		}
		/*
		 * El metodo está mal hecho y aunque no tenga balas el soldado siempre dispara y resta una bala al cargador, pasando a números negativos.
		 */
		
		
	}

}
