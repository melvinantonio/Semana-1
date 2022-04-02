/* 
1-. Se tienen 4 resistencias en paralelo R1 = 5.1 ohm, R2 = 68 ohm, R3 = 75 ohm y R4 = 82 ohm; obtener la resistencia
equivalente.
 Req = _____________1______________
        _1_   +   _1_   +   _1_   +   _1_
        R1        R2        R3        R4
*/ 
package EjerciciosDeAplicacion;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ejercicio_1 {
    public static void main(String[] args) {
        double R1, R2, R3, R4, Req, Rdeno;
        NumberFormat formato = new DecimalFormat("0.00");
        
        R1 = 5.1;
        R2 = 68;
        R3 = 75;
        R4 = 82;
        
        Rdeno = ((1/R1) + (1/R2) + (1/R3) + (1/R4));
        
        Req = 1 / Rdeno;
        
        System.out.println("La resistencia equivale a : " + formato.format(Req));
    }
    
}
