/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_practico_1_problema_5;
import java.util.Scanner;

/**
 *
 * @author Axel Tello Atondo
 */
public class Examen_Practico_1_Problema_5 {

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner spider = new Scanner (System.in);
   
        System.out.println("Introduzca la velocidad inicial angular");
        
        final double PI = 3.1416;
        double VelInAn;
        double VelFinAn;
        double time;
        double angulo;
        double radio;
        double ResAcc;
        double ResDistAn;
        double ResDistMet;
        double ResVelAn;
        double ResVelMs;
        double ResAcM2;
        double ResFreq; 
        
        VelInAn = spider.nextDouble();
        System.out.println("Introduzca la velocidad angular final(rad/s)");
        VelFinAn = spider.nextDouble();
        System.out.println("Introduzca el radio");
        radio = spider.nextDouble();
          System.out.println("Introduzca el ángulo");
        angulo = spider.nextDouble();
        System.out.println("Introduzca el tiempo");
        time = spider.nextDouble();
        
        ResDistAn = (angulo*PI);
        ResAcM2 = (VelFinAn-VelInAn)/time;
        ResVelAn = angulo/time;
        ResVelMs = VelInAn + (ResAcM2*time);
        ResDistMet = ResVelMs*time;
        ResAcc = ResVelAn/time;
        ResFreq = ResVelAn/(2*PI);
        
        System.out.println("Su aceleración en m/s es "+ResAcM2);
        System.out.println("Su distancia angular es "+ResDistAn);
        System.out.println("Su distancia en metros es "+ResDistMet);
        System.out.println("Su velocidad angular es "+ResVelAn);
        System.out.println("Su velocidad en m/s es "+ResVelMs);
        System.out.println("Su aceleración angular es "+ResAcc);
        System.out.println("Su frecuencia es "+ResFreq);
    }
    
}
