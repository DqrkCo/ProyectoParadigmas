package co.edu.poli.proyecto.servicios;

import co.edu.poli.proyecto.modelo.Publicacion;
import co.edu.poli.proyecto.modelo.Usuario;

import java.io.*;
import java.util.*;

/**
 * 
 */
public interface CRUD {

    public String create(Publicacion pub1);

    public Publicacion read(int idPub);

    public Publicacion[] readAll();

    public String update(int idPub, Publicacion modificador);
    
    public Publicacion delete(int idPub);

}