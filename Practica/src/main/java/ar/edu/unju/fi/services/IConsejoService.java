package ar.edu.unju.fi.services;

import java.util.List;

import ar.edu.unju.fi.entity.Consejos;

public interface IConsejoService {

	List<Consejos> listarConsejos();
    void guardarConsejo(Consejos consejo);
    void modificarConsejo(int indice, Consejos nuevoConsejo);
    void eliminarConsejo(int indice);
}
