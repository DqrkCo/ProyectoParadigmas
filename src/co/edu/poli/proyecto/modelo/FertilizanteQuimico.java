package co.edu.poli.proyecto.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class FertilizanteQuimico extends Fertilizante implements Serializable{

    
    public FertilizanteQuimico(int idFertilizante, String nombre, String tipofertIlizante, int fechacompra,
			String proveedor, int porcentajequimico) {
		super(idFertilizante, nombre, tipofertIlizante, fechacompra, proveedor);
		this.porcentajequimico = porcentajequimico;
	}
    
	@Override
	public String toString() {
		return "FertilizanteQuimico [porcentajequimico=" + porcentajequimico + super.toString() + "]";
	}

	public int getPorcentajequimico() {
		return porcentajequimico;
	}

	public void setPorcentajequimico(int porcentajequimico) {
		this.porcentajequimico = porcentajequimico;
	}

	/**
     * 
     */
    private int porcentajequimico;

    /**
     * @return
     */
    public void mostrarInformacion() {
        // TODO implement here
        return;
    }

}