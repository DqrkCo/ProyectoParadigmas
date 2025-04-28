package co.edu.poli.proyecto.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Publicacion implements Serializable{

    public Publicacion(int idpublicacion, String contenido, int fechapublicacion, Usuario autor) {
		super();
		this.idpublicacion = idpublicacion;
		this.contenido = contenido;
		this.fechapublicacion = fechapublicacion;
		this.autor = autor;
	}
    

	@Override
	public String toString() {
		return "Publicacion [idPublicacion=" + idpublicacion + ", contenido=" + contenido + ", fechaPublicacion="
				+ fechapublicacion + ", autor=" + autor + super.toString() + "]";
	}
	
	public int getIdpublicacion() {
		return idpublicacion;
	}

	public void setIdpublicacion(int idpublicacion) {
		this.idpublicacion = idpublicacion;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getFechapublicacion() {
		return fechapublicacion;
	}

	public void setFechapublicacion(int fechapublicacion) {
		this.fechapublicacion = fechapublicacion;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}


	/**
     * 
     */
    private int idpublicacion;

    /**
     * 
     */
    private String contenido;

    /**
     * 
     */
    private int fechapublicacion;

    /**
     * 
     */
    private Usuario autor;


    /**
     * @return
     */
    public String publicar() {
        // TODO implement here
        return "Publicación realizada";
    }

    /**
     * @return
     */
    public String comentar() {
        // TODO implement here
        return "Comentario enviado";
    }

}