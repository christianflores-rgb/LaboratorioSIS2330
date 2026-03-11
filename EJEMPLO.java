/**
 * @(#)EJEMPLO.java
 *
 * EJEMPLO application
 *
 * @author 
 * @version 1.00 2026/3/11
 */
import java.util.*;

public class EJEMPLO {

    static boolean EsPrimo(int n) {
        for (int i=2; i<n; i++) {
            if (n%i ==0)
              return false;
        }
        return true;
    }
    static void nPrimo(int n) {
    	int p= 2;
    	System.out.print("LOS NUMERO PRIMOS SON: ");
    	while(n>0){
    	    if(EsPrimo(p)){
    	    
    	    	System.out.print(p+", ");
    	    	n--;
    	    }	
    	    	p++;
    	}
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("INGRESE NUMERO: ");
        n = in.nextInt();
        nPrimo(n);
       /* if (EsPrimo(n))
            System.out.println("Es Primo");
        else
            System.out.println("No es Primo");*/ 
    }
}
