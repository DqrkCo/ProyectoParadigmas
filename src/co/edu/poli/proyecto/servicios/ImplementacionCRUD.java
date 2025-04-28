package co.edu.poli.proyecto.servicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import co.edu.poli.proyecto.modelo.Publicacion;
import co.edu.poli.proyecto.modelo.Usuario;

/**
 * 
 */
public class ImplementacionCRUD implements CRUD, OperacionArchivo {
	
	private Publicacion[] publicaciones;
    private int size;

    public ImplementacionCRUD() {
        this.publicaciones = new Publicacion[10];
        this.size = 0;
    }
    
    public void setPublicacion(Publicacion[] publicaciones) {
		this.publicaciones = publicaciones;
	}
    
    @Override
    public String create(Publicacion pub1) {
    	for (int i=0; i<publicaciones.length; i++) {
			if (publicaciones[i] == null) {
				publicaciones[i] = pub1;
				size++;
				return "Se guardó con éxito " + pub1.getIdpublicacion();
			}
		}
		Publicacion[] nuevoArreglo = new Publicacion[publicaciones.length*2];
		System.arraycopy(publicaciones, 0, nuevoArreglo, 0, publicaciones.length);
		publicaciones = nuevoArreglo;
		publicaciones[size++] = pub1;
    	
        return "Se guardó con éxito el usuario " + pub1.getIdpublicacion();
    }
    
    @Override
    public Publicacion read(int idPub) {
    	for(Publicacion pub1 : publicaciones) {
			if (pub1 != null && pub1.getIdpublicacion() == idPub){
				return pub1;
			}
		}
        return null;
    }

    @Override
    public Publicacion[] readAll() {
    	
        return publicaciones;
    }

    @Override
    public String update(int idPub, Publicacion modificador) {
    	for(int i = 0; i<publicaciones.length; i++) {
			if (publicaciones[i].getIdpublicacion() == idPub) {
				publicaciones[i] = modificador;
				return "Usuario actualizado con éxito";
			}
		}
        return "Usuario no encontrado";
    }

    @Override
    public Publicacion delete(int id) {
    	for(int i = 0; i<publicaciones.length;i++) {
			if ((publicaciones[i] != null) && (publicaciones[i].getIdpublicacion()==id)) {
				Publicacion eliminado = publicaciones[i];
				publicaciones[i] = null; 
				size--;
				return eliminado;
			}
		}
        return null;
    }

    @Override
    public String serializar(Publicacion[] publicaciones, String path, String name) {
    	try {
			FileOutputStream fos = new FileOutputStream(path + name);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(publicaciones);
			oos.close();
			fos.close();
			return "Archivo creado.";
		} catch (IOException ioe) {
			return "Error file " + ioe.getMessage();
		}
	}	

    @Override
    public Publicacion[] deserializar(String path, String name) {
    	Publicacion[] a = null;
		try {
		FileInputStream fis = new FileInputStream(path + name);
		ObjectInputStream ois = new ObjectInputStream(fis);
		a = (Publicacion[]) ois.readObject();
		ois.close();
		fis.close();
		} catch (IOException ioe) {
		ioe.printStackTrace();
		} catch (ClassNotFoundException c) {
		c.printStackTrace();
		}
		return a;
	}
}