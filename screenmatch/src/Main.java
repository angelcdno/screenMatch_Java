//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Imersión en java !");
       
          
        // datos primitivos 
        int fechaDeLanzamiento = 1999;
        // Esto es una varibles con asignacion de string camel case
        double evaluacion = 4.5;
        // Esto es un float menor capacidad que es un punto decimal double mas capacidad
        boolean incluidoPlanBase = true;
        //false o true 
        String  nombre ="Matrix";
        String  sinopsis ="""
                 La mejor pelicula del fin del milenio
                """;

        // Es una clase que almacena texto 
        
        System.out.println("fecha de lanzamiento: " +fechaDeLanzamiento);
        System.out.println("Evaluación: "+ evaluacion);
        System.out.println("Imcluido en Plan Basico: "+incluidoPlanBase);
        System.out.println("Nombre de la pelicula: "+nombre);
        System.out.println("Sinopsis de la pelicula: "+sinopsis);

        double mediaEvaluacionPelicula = 0;


        double mediaEvaluacion = (4.5 + 4.2 + 3)/3;

        System.out.println("Media de la pelicula: "+mediaEvaluacion);
        if(fechaDeLanzamiento >= 2023){
            System.out.println("Pelcula mas populas de la temporada");
        }else{
            System.out.println("Pelicula Retro vale la pena ver");
        }

        // ciclo de repeticion int inicia en = 0, hasta que condicion se va a ejecutar,a cada ejacucion va a incrementar un numero 
        
        for (int i = 0; i < 3; i++) {
            //La Clase Scanner captura lo que el usuario ingresa en el teclado
            Scanner teclado = new Scanner(System.in);
            //Escribiendo mensaje para el usuario
            System.out.println("Ingresa Tu Nota a esta Pelicula");
            // Capturando en una varible el valor  double netregado por el usuario 
            double notaPelicula = teclado.nextDouble();
            mediaEvaluacionPelicula = mediaEvaluacionPelicula + notaPelicula;
            }
            System.out.println("La media de la pelicula" +
                                "Pelicula Calculada por el usuario es: " + mediaEvaluacionPelicula/3);
        }

}
