import java.util.*;
/**
 * @author Javier Octavio y Axel Arath
 * Tiro Parabolico
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double aGrados = 45;
        double aRadianes = Math.toRadians(aGrados);

        System.out.println("La Velocidad Inicial");
        double rVelocidad;
        
        rVelocidad = input.nextDouble();
        double rAMax;
        double rDistancia;
        
        rAMax = rVelocidad * Math.sin(aRadianes) / (2 * 9.8);
        rDistancia = rVelocidad * ((Math.sin(aRadianes) * 2) / 9.8);
        System.out.println("La Altura Maxima es: "+rAMax+" metros");
        System.out.println("La Distancia es: "+rDistancia+" metros");
    }
}