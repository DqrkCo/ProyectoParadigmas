package co.edu.poli.proyecto.vista;

import java.io.*;
import java.util.*;

import co.edu.poli.proyecto.modelo.Publicacion;
import co.edu.poli.proyecto.modelo.Usuario;
import co.edu.poli.proyecto.servicios.ImplementacionCRUD;


/**
 * 
 */
public class Principal {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ImplementacionCRUD servicio = new ImplementacionCRUD();
		int opcion;
		do {
			System.out.println("\n--- MENÚ ---");
            System.out.println("1. Crear publicacion");
            System.out.println("2. Ver publicacion por serial");
            System.out.println("3. Ver todos las publicaciones");
            System.out.println("4. Actualizar publicacion");
            System.out.println("5. Eliminar publicacion");
            System.out.println("6. Guardar publicaciones en archivo");
            System.out.println("7. Cargar publicaciones desde archivo");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            String path = ""; 
            String file = "TextBinary.bin";

            switch (opcion) {
                case 1 -> {
                	System.out.print("Ingrese el ID de la publicación: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Ingrese el contenido de la publicación: ");
                    String contenido = sc.nextLine();
                    
                    System.out.print("Ingrese la fecha de publicación (YYYY/MM/DD): ");
                    int fecha = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Ingrese el datos del autor: ");
                    Usuario autor = crearUsuarioDesdeConsola(sc);
                    
                    Publicacion nuevaPub = new Publicacion(id, contenido, fecha, autor);
                    servicio.create(nuevaPub);
                    System.out.println("Publicación creada exitosamente.");
                }
                
                case 2 -> {
                	System.out.print("Ingrese el ID de la publicación que desea ver: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    Publicacion pub = servicio.read(id);
                    if (pub != null) {
                        System.out.println("Publicación encontrada: " + pub.getContenido());
                    } else {
                        System.out.println("No se encontró la publicación.");
                    }

                }
                
                case 3 -> {
                	Publicacion[] publicaciones = servicio.readAll();
                    for (Publicacion pub1 : publicaciones) {
                        if (pub1 != null)
                            System.out.println(pub1);
                    }
                }

                case 4 -> {
                    System.out.print("Ingrese el ID de la publicación que desea actualizar: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Ingrese el ID actualizado: ");
                    int idNueva = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Ingrese el nuevo contenido de la publicación: ");
                    String contNuevo = sc.nextLine();

                    System.out.print("Ingrese la fecha de la nueva publicación (YYYY/MM/DD): ");
                    int fecNueva = sc.nextInt();
                    sc.nextLine();

                    Publicacion pubExistente = servicio.read(id);

                    if (pubExistente != null) {
                        Publicacion nuevaPub = new Publicacion(idNueva, contNuevo, fecNueva, pubExistente.getAutor());
                        
                        String resultado = servicio.update(id, nuevaPub);
                        System.out.println(resultado);
                    } else {
                        System.out.println("Error: No se encontró la publicación con el ID especificado.");
                    }
                }
                case 5 -> {
                    System.out.print("Ingrese el ID de la publicación que desea eliminar: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    servicio.delete(id);
                    System.out.println("Publicación eliminada.");
                }
                case 6 -> {
                    System.out.println(servicio.serializar(servicio.readAll(), path, file));
                }
                case 7 -> {
                	Publicacion[] cargados = servicio.deserializar(path, file);
                    servicio.setPublicacion(cargados);
                    System.out.println("Publicaciones cargadas desde archivo.");
                }
                case 8 -> {
                    System.out.println("Saliendo del programa...");
                }
                default -> {
                    System.out.println("Opción no válida.");
                }
            }
        }while (opcion != 8);
	}
    public static Usuario crearUsuarioDesdeConsola(Scanner sc) {
        System.out.println("ID: ");
        int idUs = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre: ");
        String nomUs = sc.nextLine();
        System.out.println("Correo: ");
        String corrUs = sc.nextLine();
        System.out.println("Contraseña: ");
        String conUs = sc.nextLine();

        return new Usuario(idUs, nomUs, corrUs, conUs);
    }
    
}