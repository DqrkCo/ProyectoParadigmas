package co.edu.poli.proyecto.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class FertilizanteOrganico extends Fertilizante implements Serializable{

    public FertilizanteOrganico(int idFertilizante, String nombre, String tipofertIlizante, int fechacompra,
			String proveedor, String tipoorganico) {
		super(idFertilizante, nombre, tipofertIlizante, fechacompra, proveedor);
		this.tipoorganico = tipoorganico;
	}
    
	@Override
	public String toString() {
		return "FertilizanteOrganico [tipoorganico=" + tipoorganico + super.toString() + "]";
	}

	public String getTipoorganico() {
		return tipoorganico;
	}

	public void setTipoorganico(String tipoorganico) {
		this.tipoorganico = tipoorganico;
	}


	/**
     * 
     */
    private String tipoorganico;

    /**
     * @return
     */
    public void mostrarInformacion() {
        // TODO implement here
        return;
    }

}