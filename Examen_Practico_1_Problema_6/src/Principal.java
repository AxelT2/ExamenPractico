    import java.util.*;

/**
 *
 * @author Javier Octavio y Axel Tello
 * Pendiente
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la Ubicación del Punto A");
        double rX1;
        
        rX1 = input.nextDouble();
        double rY1;
        
        rY1 = Math.pow(rX1, 2);
        System.out.println("Introduce la Ubicación del Punto B");
        double rX2;
        
        rX2 = input.nextDouble();
        double rY2;
        
        rY2 = Math.pow(rX2, 2);
        double rPendiente;
        
        rPendiente = (rY2 - rY1) / (rX2 - rX1);
        double rRectangulo;
        
        rRectangulo = (rX2 - rX1) * rY1;
        double rTriangulo;
        
        rTriangulo = (rY2 - rY1) * (rX2 - rX1) / 2;
        double rArea;
        
        rArea = rRectangulo + rTriangulo;
        System.out.println("La Pendiente de la Recta es: "+rPendiente);
        System.out.println("El Area entre los Puntos es: "+rArea);
    }
}