/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carloshibernate;

import java.util.Scanner;
import model.*;

/**
 *
 * @author carlo
 */
public class CarlosHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         ManejaExperto maneja = new ManejaExperto();
    
         //Guardar Experto
        System.out.println("Guardar un experto");
        Experto ex = new Experto("999", "Carlos", "España", "Informatico");
        maneja.guardaExperto(ex);
        System.out.println("Fin guardar experto");
      
        //Modificar Experto
        System.out.println("Modifica un experto");
        Experto ex1 = new Experto("999", "DarioGomez", "España", "Informatico");
        maneja.actualizaExperto(ex1);
        System.out.println("Fin modificar experto");
        
        //Eliminar Experto
        System.out.println("Eliminar un experto");
        maneja.eliminaExperto(ex1);
        System.out.println("Fin eliminar experto");
       
        //Buscar Experto
        System.out.println("Busca un experto");
        String id;Scanner scan = new Scanner(System.in);
        System.out.println("Indica id a buscar: ");
        id = scan.nextLine();
        
        //Obtener Experto
        Experto e = maneja.obtenExperto(id);
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Codigo: "+ e.getCodexperto());
        System.out.println("Especialidad: " + e.getEspecialidad());
        System.out.println("Pais: " + e.getPais());
        System.out.println("Fin buscar experto");
        
        
    }
    
}
