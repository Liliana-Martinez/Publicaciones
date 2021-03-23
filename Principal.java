package publicacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

   static Scanner leer = new Scanner(System.in);
   static Object publicaciones[];
   static int ctrlpub;
   static Libro lb = new Libro();
   static Revista rv = new Revista();
   static Periodico pd = new Periodico();
    
    public static void main(String[] args) {
        int opc = 0, tp, numero=0, anio=0;
        String ISBN = "", edicion = "", autor = "", ISSN = "", fecha = "", creditos="";
      
        do{
            System.out.println("1. AGREGAR PUBLICACION");
            System.out.println("2. MOSTRAR PUBLICACIONES");
            System.out.println("3. SALIR");
            System.out.print("Digite la opcion que desea realizar: ");
            opc = leer.nextInt();
            leer.nextLine();
            
            switch(opc){
               case 1:
               ctrlpub++;
               publicaciones = new Object[ctrlpub];
                  System.out.println("QUE TIPO DE PUBLICACION?: ");
                  System.out.println("1 LIBRO");
                  System.out.println("2 REVISTA");
                  System.out.println("3 PERIODICO");
                  System.out.print("Digitite la opcion que desea: ");
                  tp = leer.nextInt();
                  leer.nextLine();
                  
                  if(tp == 1){
                     agregarLibro(ISBN, edicion, autor, publicaciones);
                  }
                  else if(tp == 2){
                     agregarRevista(ISSN, numero, anio);
                  }
                  else{
                     agregarPeriodico(fecha, creditos);
                  }
               break;
               case 2:
                  mostrarPublicaciones();
               break;
               case 3:
               break;
            }
        }while(opc!=3);
     }
     
     
     public static void agregarLibro(String ISBN, String edicion, String autor, Object publicaciones[]){
      //for(int i=1;i<=ctrlpub ;i++){
         System.out.print("ISBN: ");
         ISBN = leer.nextLine();
         System.out.print("EDICION: ");
         edicion = leer.nextLine();
         System.out.print("AUTOR: ");
         autor = leer.nextLine();
         
         lb.setISBN(ISBN);
         lb.setEdicion(edicion);
         lb.setAutor(autor);
         publicaciones[ctrlpub-1] = lb;
      // }  
      }
      public static void agregarRevista(String ISSN, int numero, int anio){
      //for(int i=0;i<ctrlpub ;i++){
         System.out.print("ISSN: ");
         ISSN = leer.nextLine();
         System.out.print("NUMERO: ");
         numero = leer.nextInt();
         System.out.print("AÑO: ");
         anio = leer.nextInt();
         
         rv.setISSN(ISSN);
         rv.setNumero(numero);
         rv.setAnio(anio);
         publicaciones[ctrlpub-1] = rv;
       //}
     }
     
     public static void agregarPeriodico(String fecha, String creditos){
      //for(int i=0;i<ctrlpub ;i++){
         System.out.print("FECHA: ");
         fecha = leer.nextLine();
         System.out.print("CREDITOS: ");
         creditos = leer.nextLine();
         
         pd.setFecha(fecha);
         pd.setCreditos(creditos);
         publicaciones[ctrlpub-1] = pd;
       //} 
     }
     public static void mostrarPublicaciones(){
      for(int i=0; i<ctrlpub; i++){//
      System.out.println(" " + publicaciones[i].getClass());
      if(publicaciones[i] instanceof Revista){
         Revista rv = new Revista();
         rv = (Revista)publicaciones[i];
         System.out.println("---REVISTA---");
         System.out.println("ISSN " + rv.getISSN());
         System.out.println("NUMERO " + rv.getNumero());
         System.out.println("AÑO " + rv.getAnio());
      }
      else if(publicaciones[i] instanceof Libro){
         Libro lb = new Libro();
         lb = (Libro)publicaciones[i];
         System.out.println("---LIBRO---");
         System.out.println("ISBN " + lb.getISBN());
         System.out.println("EDICION " + lb.getEdicion());
         System.out.println("AUTOR " + lb.getAutor());
      }
      else if(publicaciones[i] instanceof Periodico){
         Periodico pd = new Periodico();
         pd = (Periodico)publicaciones[i];
         System.out.println("---PERIODICO---");
         System.out.println("FECHA " + pd.getFecha());
         System.out.println("CREDITOS " + pd.getCreditos());
      }         //System.out.println(publicaciones[i]);//
      }//
     }
  }
     
     
     /*public static void mostrarPublicaciones(){
     
     }*/
   //}