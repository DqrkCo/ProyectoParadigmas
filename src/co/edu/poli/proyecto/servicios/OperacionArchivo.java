package co.edu.poli.proyecto.servicios;

import java.io.*;
import java.util.*;

import co.edu.poli.proyecto.modelo.Publicacion;
import co.edu.poli.proyecto.modelo.Usuario;

/**
 * 
 */
public interface OperacionArchivo {

    public String serializar(Publicacion[] publicaciones, String path, String name);

    public Publicacion[] deserializar(String path, String name);

}