
package boletin2.pkg3;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin23 {

    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);  
        double cambio, dolar, euro;
        System.out.println("Introducir cantidad: ");
           euro= sc.nextDouble();
        System.out.println("Introducir cambio: ");
           cambio= sc.nextDouble();
        dolar = euro*cambio;
        System.out.println(euro + " euros equivalen a " + dolar + " dolares.");
    
     
    }
    
}
