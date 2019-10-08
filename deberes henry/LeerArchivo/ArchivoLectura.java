/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeerArchivo;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ArchivoLectura {

    public static void main(String[] args) {
        FileWriter archivo = null; //Escribimos variables de tipo FileWrite con el ombre del archivo
        PrintWriter escritor = null;// Es la escritora que nos permite dar texto al bloc de notas
        try {
            archivo = new FileWriter("C:\\Users\\dell\\Desktop\\P.txt");
            escritor = new PrintWriter(archivo); //Enviar el archivo
            escritor.println("Meta #1: Ser feliz");
            escritor.println("Meta #2: Tener una profesion");
            archivo.close();
        } catch (Exception e) {
            System.out.println("Error i" + e.getMessage());   
        }
    }
}
