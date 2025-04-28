package co.edu.poli.proyecto.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Administrador extends Usuario implements Serializable {
	
	private Fertilizante[ ] fertilizante;
 
	public Administrador(int idusuario, String nombre, String correo, String contraseña, Fertilizante[] fertilizante) {
		super(idusuario, nombre, correo, contraseña);
		this.fertilizante = fertilizante;
	}

	
	@Override
	public String toString() {
		return "Administrador [fertilizante=" + Arrays.toString(fertilizante) + ", toString()=" + super.toString();
	}


	public Fertilizante[] getFertilizante() {
		return fertilizante;
	}

	public void setFertilizante(Fertilizante[] fertilizante) {
		this.fertilizante = fertilizante;
	}

	/**
     * 
     */
    public void gestionarPublicaciones() {
        // TODO implement here
    }

    /**
     * 
     */
    public void gestionarFertilizante() {
        // TODO implement here
    }

}