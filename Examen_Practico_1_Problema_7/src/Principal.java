import java.util.*;
/**
 * @author Javier Octavio y Axel Arath
 * Ecuación Canónica de la Hipérbola en Horizontal
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Las Cordenadas del Centro son:");
        double rH;
        rH = input.nextDouble();
        double rK;
        rK = input.nextDouble();
        System.out.println("Su Semi Eje Transverso");
        double rA;
        rA = input.nextDouble();
        System.out.println("Su Semi Eje Conjugado");
        double rB;
        rB = input.nextDouble();
        double rC;
        
        rC = Math.sqrt(Math.pow(rA, 2) + Math.pow(rB, 2));
        double rVertice;
        rVertice = rH + rA;
        double rVerticeP;
        rVerticeP = rH - rA;
        double rFoco;
        rFoco = rH + rC;
        double rFocoP;
        rFocoP = rH - rC;
        double rDistancia;
        rDistancia = rFoco - rH;
        
        System.out.println("La Distancia del Centro al Foco es: "+rDistancia);
        System.out.println("Los Vertices estan en "+rVerticeP+","+rK+" y "+rVertice+","+rK);
        System.out.println("Los Vertices estan en "+rFocoP+","+rK+" y "+rFoco+","+rK);
    }
}