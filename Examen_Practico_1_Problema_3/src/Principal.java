    import java.util.*;
/**
 * @author Javier Octavio y Axel Arath
 * Circuito Electrico en Paralelo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Valor de la Primera Resistencia");
        double rRes1;
        
        rRes1 = input.nextDouble();
        System.out.println("Valor de la Segunda Resistencia");
        double rRes2;
        
        rRes2 = input.nextDouble();
        System.out.println("Valor de la Tercera Resistencia");
        double rRes3;
        
        rRes3 = input.nextDouble();
        System.out.println("Valor de la Cuarta Resistencia");
        double rRes4;
        
        rRes4 = input.nextDouble();
        System.out.println("Valor de la Quinta Resistencia");
        double rRes5;
        
        rRes5 = input.nextDouble();
        System.out.println("Valor del Voltaje");
        double rVoltaje;
        
        rVoltaje = input.nextDouble();
        double rResEq;
        
        rResEq = (double) 1 / ((double) 1 / rRes1 + (double) 1 / rRes2 +
                 (double) 1 / rRes3 + (double) 1 / rRes4 + (double) 1 / rRes5);
        double rInt1;
        
        rInt1 = rVoltaje / rRes1;
        double rInt2;
        
        rInt2 = rVoltaje / rRes2;
        double rInt3;
        
        rInt3 = rVoltaje / rRes3;
        double rInt4;
        
        rInt4 = rVoltaje / rRes4;
        double rInt5;
        
        rInt5 = rVoltaje / rRes5;
        double rIntTotal;
        
        rIntTotal = rInt1 + rInt2 + rInt3 + rInt4 + rInt5;
        System.out.println("La Resistencia Equivalente es: "+rResEq+"Ω");
        System.out.println("La Intensidad Total es: "+rIntTotal+"A");
        System.out.println("La Intensidad de la Primera Resistencia es: "+rInt1+"A");
        System.out.println("La Intensidad de la Segunda Resistencia es: "+rInt2+"A");
        System.out.println("La Intensidad de la Tercera Resistencia es: "+rInt3+"A");
        System.out.println("La Intensidad de la Cuarta Resistencia es: "+rInt4+"A");
        System.out.println("La Intensidad de la Quinta Resistencia es: "+rInt5+"A");
    }
}