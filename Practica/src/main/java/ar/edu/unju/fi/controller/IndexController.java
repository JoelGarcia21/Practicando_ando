package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/index")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping("/consejos")
	public String getConsejos() {
		return "consejos";
	}
	
	@GetMapping("/productos")
	public String getProductos() {
		return "productos";
	}
	
	@GetMapping("/paseos")
	public String getPaseos() {
		return "paseos";
	}
	
	@GetMapping("/contactenos")
		public String getContactenos() {
			return "contactenos";
		}
}
