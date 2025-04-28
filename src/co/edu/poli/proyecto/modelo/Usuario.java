package co.edu.poli.proyecto.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Usuario implements Serializable{

    public Usuario(int idusuario, String nombre, String correo, String contraseña) {
		super();
		this.idUsuario = idusuario;
		this.nombre = nombre;
		this.correo = correo;
		this.contraseña = contraseña;
	}
    
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", correo=" + correo + ", contraseña="
				+ contraseña + "]";
	}



	public int getIdusuario() {
		return idUsuario;
	}

	public void setIdusuario(int idusuario) {
		this.idUsuario = idusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	/**
     * 
     */
    private int idUsuario;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String correo;

    /**
     * 
     */
    private String contraseña ;

    /**
     * @return
     */
    public void iniciarSesion() {
        // TODO implement here
        return;
    }

    /**
     * @return
     */
    public void cerrarSesion() {
        // TODO implement here
        return;
    }

}