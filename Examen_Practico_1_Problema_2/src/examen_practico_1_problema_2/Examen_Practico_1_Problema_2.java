/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_practico_1_problema_2;
import java.util.Scanner;

/**
 *
 * @author Axel Tello Atondo
 */
public class Examen_Practico_1_Problema_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner spider = new Scanner (System.in);

      System.out.println("Introduzca el radio de la tubería");
      
      final double PI = 3.1416;
      double radio;
      double area;
      double FlujVel;
      double result;
      
      radio = spider.nextDouble();
      area = PI*(radio*radio);
      System.out.println("Introduzca la velocidad del flujo");
      FlujVel = spider.nextDouble();
    result = area*FlujVel;
      
      System.out.println(result);
             
    }
    
}
