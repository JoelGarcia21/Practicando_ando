package ar.edu.unju.fi.listas;

import java.util.List;
import java.util.ArrayList;

import ar.edu.unju.fi.model.Comentario;

public class ContactenosLista {
	
	/*
	La lista ContactenosLista se declara como privada y estática 
	(private static) porque es una buena práctica encapsular los campos de 
	una clase y limitar el acceso directo a ellos desde fuera de la clase.

	Al declararla como privada, solo los métodos de la misma clase pueden 
	acceder directamente a la lista. Esto ayuda a controlar cómo se 
	manipula y accede a la lista, evitando cambios no deseados desde otras
	 partes del código.

	Además, al ser declarada como estática, la lista pertenece a la clase 
	en lugar de pertenecer a una instancia específica de la clase. Esto 
	significa que la lista es compartida por todas las instancias de la
 	clase ContactenosLista y se puede acceder a ella sin necesidad de 
	crear una instancia de la clase. Esto facilita el acceso y la 
	manipulación de la lista desde otros métodos estáticos, como el método
 	guardarComentario que mencionamos anteriormente.
	
	*/
	
	//private para que la lista solo pueda modificarse desde la misma clase, y static para que ContactenosLista sea solo utilizado por dicha clase?
	private static List<Comentario> ContactenosLista = new ArrayList<>();
    
    public static List<Comentario> getListaComentario() {
        return ContactenosLista;
    }
    
}