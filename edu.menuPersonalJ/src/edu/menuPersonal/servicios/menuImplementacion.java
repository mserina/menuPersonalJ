package edu.menuPersonal.servicios;

import java.util.Scanner;

public class menuImplementacion implements menuInterfaz{
	
	/*
	public void mensajeBienvenida(){
		
		System.out.println("hola");
	}
	*/
	
	public int menuYSeleccion(Scanner tecla) {
		
		int numeroSeleccionado;
		
		System.out.println("#################");
		System.out.println("0 CERRAR");
		System.out.println("1 SALUDO");
		System.out.println("2 DESPEDIDA");
		System.out.println("3 NUMERO");
		System.out.println("#################");
		System.out.println("Elige Opcion");
		
		numeroSeleccionado = tecla.nextInt();
		
		return numeroSeleccionado;

	}
}