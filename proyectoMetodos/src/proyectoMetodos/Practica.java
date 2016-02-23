package proyectoMetodos;

import java.util.*;
public class Practica {

	
	 public static void main(String[] args) { 
	        int pos;  
	        int ent= 100;
	        Scanner sc = new Scanner (System.in); 
	        //length()    Contar los caracteres de un string 
	         
	        String miPalabra ="Ordenador"; 
	        System.out.println("El nœmero de caracteres de la palabra " + miPalabra + " es " + miPalabra.length()); 
	        System.out.println("--------------------------------");

	        //charArt()    Devuelve el caracter de la posicion indicada 
	        System.out.println("Dime la posicion de miPalabra que quieres devolver"); 
	        pos=sc.nextInt(); 
	        System.out.println(miPalabra.charAt(pos)); 
	        System.out.println("--------------------------------");

	        //replace() Reemplazar un caracter determinado 
	        System.out.println(miPalabra.replace("r", "z")); 
	        System.out.println("--------------------------------");

	        //indexOf() texto a buscar un caracter  
	        System.out.println("la letra r imprimir‡;"); 
	        System.out.println(miPalabra.indexOf("o")); 
	        System.out.println("--------------------------------");

	        //lastindexOf() texto a buscar un caracter desde atras 
	        System.out.println("la letra r imprimir‡;"); 
	        System.out.println(miPalabra.lastIndexOf("r")); 
	        System.out.println("--------------------------------");

	        //compareTo() compara dos strings (devuelve 0 si son iguales, y otro numero dependiendo de
	        //cuantos caracteres le faltan o en el primer caracter que encuentra diferente
	        //cuantas posiciones utf tiene que avanzar para igualar el caracter
	         
	        System.out.println("Devuelve: "+ miPalabra.compareTo("Ordenados")); 
	        System.out.println("--------------------------------");

	        //substring() crea un substring a partir de las posiciones indicadas 
	        System.out.println("Introduce donde quieres que empiece el string:");
	        int ini=sc.nextInt();
	        System.out.println("Introduce donde quieres que acabe el string:");
	        int fin=sc.nextInt();
	        System.out.println(miPalabra.substring(ini, fin));
	        System.out.println("--------------------------------");
	        //split() divide un string utilizando el caracter indicado
	        //guardamos las partes en un Array (el caracter separador se pierde)
	        String[] parts= miPalabra.split("r");
	        System.out.print(parts[0]);
	        System.out.println(parts[1]);
	        System.out.println("--------------------------------");
	        
	        //String.valueOf() conveirte a tipo string
	        System.out.println(String.valueOf(ent)+100);
	        System.out.println("--------------------------------");

	        //Integer.parseInt() convierte a integer un String (el contrario que string valueOf)
	        String dos="200";
	        System.out.println(Integer.parseInt(dos)+200);
	    } 

}
