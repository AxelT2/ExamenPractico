import java.util.*;
/**
 * @author Javier Octavio y Axel Arath
 * Formulas de Temperatura
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la temperatura en Grados Fahrenheit");
        double rFahren;
        
        rFahren = input.nextDouble();
        double rCelsius;
        
        rCelsius = (rFahren - 32) / 1.8;
        double rKelvin;
        
        rKelvin = rCelsius + 273.15;
        System.out.println("Hace: ");
        System.out.println(rFahren+"°F");
        System.out.println(rCelsius+"°C");
        System.out.println(rKelvin+"K");
    }
}
