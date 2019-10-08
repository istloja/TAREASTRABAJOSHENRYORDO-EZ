package Ecepciones_2_LeerYEscribirArchivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*public class EscrituraArchivos {

    public static void main(String[] arg) {
        File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\Users\\dell\\Desktop\\Practica.txt");
         fr 
                 
                 
                 = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null)
            System.out.println(linea);
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }*/
    /*Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la direccion del archivo");
        String direccion = entrada.nextLine();
        System.out.println("Ingrese el texto a escribir en el archivo:");
        String texto = entrada.nextLine();
        EscrituraArchivos objeto = new EscrituraArchivos();
        objeto.Escribirarchivo(direccion, texto);
    }

    public Void Escribirarchivo(String direccion, String mensaje) {
        try {
            try (FileWriter archivo = new FileWriter(direccion)) {
                PrintWriter escribir = new PrintWriter(archivo);
                escribir.println(mensaje);
                archivo.close();
            }
        } catch (IOException e) {
            System.out.println(e);
    }*/


