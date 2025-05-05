package Caso1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
	    
	    System.out.print("¿Cuántos libros desea registrar? ");
	    int cantidadlibros=sc.nextInt();  
	    System.out.println();

	    

	    Libro[] libros= new Libro[cantidadlibros];
	    

	     

	    for(int i=0; i< cantidadlibros; i++){
	    	
		  System.out.println("Libro "+(i+1)+":");
	      System.out.print("Título: ");
	      String titulo=sc.next();
	       
	      System.out.print("Autor: ");
	      String autor=sc.next();
	      
	      System.out.print("Año de Publicación: ");
	      int año=sc.nextInt();

	       
        
	      System.out.println();
	      libros[i] = new Libro(titulo, autor, año);

	    }
	    
	    System.out.println("Libros publicados después del año 2015:");

	    for(Libro l:libros) {
	    	if(l.getAñoPublicacion() > 2015) {
	    		l.mostrar();
	    	}
	    }



	    sc.close();

	}

}