package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.fi.listas.ContactenosLista;
import ar.edu.unju.fi.model.Comentario;

@Controller
public class ContactenosController {
	
	//En resumen, la función getContactenosPage inicializa un nuevo objeto 
	//Comentario, lo agrega al modelo con el nombre "comentario" y devuelve 
	//la vista "contactenos".
	@GetMapping("/contactenos")
	public String getContactenosPage(Model model) {
		model.addAttribute("comentario", new Comentario());
		return "contactenos";
	}
	
	//postmapping no funciona con href
	//
	@PostMapping("/guardar")
	//la funcion guardarComentario utiliza el objeto Comentario comentario
	//La anotación @ModelAttribute en el parámetro del método guardarComentario()
	//indica que el objeto Comentario debe ser vinculado automáticamente a los 
	//datos enviados en la solicitud. 
	
	//entra en la clase ContactenoLista y utiliza el metodo estatico
	//getListaComentario() para que la lista no sea publica.
	//luego se usa el metodo add(comentario) para agregar
	//ese objeto a esa lista ContactenosLista. creada en ContactenosLista.
	public String guardarComentario(@ModelAttribute Comentario comentario) {
		ContactenosLista.getListaComentario().add(comentario);
		return "redirect:/contactenos";
	}
	
	@GetMapping("/comentarios")
	 public String mostrarComentarios(Model model) {
	        model.addAttribute("comentarios", ContactenosLista.getListaComentario());
	        return "contactosGuardados";
	    }
	
}