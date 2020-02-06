  package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.logic.Modelo;
import view.View;

public class Controller <T extends Comparable<T>>{

	private Modelo modelo;
	
	private View view;
	
	private int i = (int) Math.random();
	
	private String dato = "";
	
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}
	
	 public void run() throws InputMismatchException {

	        try {

	            Scanner reader = new Scanner(System.in);

	            boolean end = false;



	            while (!end) {

	                view.printMenu();

	                int option = reader.nextInt();

	                switch (option) {



	                    case 0:
	              
	                    	modelo = new Modelo();
	                    	view.printMessage("Se ha creado la Lista Enlazada");
	                    	break;
	                    	
	                    case 1: 
	                    	
	                    	dato = reader.next();
	                    	modelo.agregar(dato);
	                    	view.printMessage("Se ha agregado un dato nuevo");
	                    	break;
	                    	
	                    case 2:
	                    
	                    	if(modelo.buscar(i) != null )
	                    	{
	                    		
	                    		view.printMessage("El dato ha sido encontrado");
	                    		
	                    	}
	                    	
	                    	else{
	                    		view.printMessage("El dato no ha sido encontrado");
	                    	}
	                    	
	                    case 3:
	                    	
	                    	if(modelo.eliminar(i) != null)
	                    	{
	                    		view.printMessage("El dato ha sido eliminado");
	                    	}
	                    	else
	                    	{
	                    		view.printMessage("Dato no encontrado");
	                    	}
	                }
	            }
	        }
	                    	
	                    		           
	         catch (InputMismatchException e) {

	            run();
	            
	         }
	 }
}
	         
	         

