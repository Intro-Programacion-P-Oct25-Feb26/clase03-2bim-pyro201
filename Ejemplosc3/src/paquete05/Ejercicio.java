/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author A S U S
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[][] estaciones = new int[5][12];
        
        String[] nombres = new String[5];
        
        int[] produ = new int[5];
        
        String report = "";

        for (int fila = 0; fila < estaciones.length; fila++) {
            
            System.out.println("Ingrese el nombre de la estacion");
            nombres[fila]= entrada.nextLine();
            
            int suma= 0;
            for (int col = 0; col < estaciones[fila].length; col++) {
                System.out.printf("Ingrese la produccion del mes %s\n",col+1);
                int produccion = entrada.nextInt();
                entrada.nextLine();
                
                suma = suma + produccion;
                estaciones[fila][col]= produccion;  
            }
            produ[fila]=suma;
            report = String.format("%sEstacion de %s - Total Produccion : $%s\n"
                    ,report,nombres[fila],produ[fila]);
        }
        
            
        
        }
    }
