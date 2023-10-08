package edu.menuPersonalJ.controladores;

import java.util.Scanner;

import edu.menuPersonal.servicios.menuImplementacion;
import edu.menuPersonal.servicios.menuInterfaz;

public class Inicio {
	
	public static void main (String[] args) {
		
		// Declaracion de variables
		
		menuInterfaz mi = new menuImplementacion();
		int Opcion;
		boolean cerrarMenu = false;
		Scanner tecla = new Scanner(System.in);
	
		
		
		//Procedimiento (while y switch)
		
		while(!cerrarMenu) {
			
			Opcion = mi.menuYSeleccion(tecla);
			
			switch(Opcion) {
			
			case 0:
				System.out.println("[INFO] SE EJECUTA OPCION 0");
				cerrarMenu = true;
				break;
				
			case 1:
				System.out.println("[INFO] SE EJECUTA OPCION 1");
				break;
				
			case 2:
				System.out.println("[INFO] SE EJECUTA OPCION 2");
				break;
				
			case 3:
				System.out.println("[INFO] SE EJECUTA OPCION 3");
				break;
			default:
				System.out.println("No existe esa opcion");
				break;
				
				
			}
		}
		
	}
	
}