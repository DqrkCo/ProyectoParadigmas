package co.edu.poli.proyecto.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Fertilizante implements Serializable{

    public Fertilizante(int idFertilizante, String nombre, String tipofertIlizante, int fechacompra, String proveedor) {
		super();
		this.idFertilizante = idFertilizante;
		this.nombre = nombre;
		this.tipofertIlizante = tipofertIlizante;
		this.fechacompra = fechacompra;
		this.proveedor = proveedor;
	}
    
	/**
     * 
     */
    private int idFertilizante;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String tipofertIlizante;

    /**
     * 
     */
    private int fechacompra;

    /**
     * 
     */
    private String proveedor;
    
    /**
     * @return
     */
    public void mostrarInformacion() {
        // TODO implement here
        return;
    }

}