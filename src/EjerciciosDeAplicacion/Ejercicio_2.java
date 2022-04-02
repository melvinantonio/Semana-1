/*
2-. Nos piden hacer un programa que calcule el valor de la moneda para los siguientes países: Europa, Reino Unido,
Australia y Canadá. El programa tiene declarada una variable con el valor $100.00 de tipo double y tenemos que
realizar la conversión de dólares a las monedas solicitadas. A continuación se muestra los valores de conversión:

1 USD 0.70 Europa 0.61 Reino Unido 0.95 Australia 0.97 Canadá
 */
package EjerciciosDeAplicacion;


public class Ejercicio_2 {
    public static void main(String[] args) {
        double valor = 100.00;
        
        double Europa = 0.91, ReinoUnido = 0.61, Australia = 0.95, Canada = 0.97;
      
        double convercion1 = valor * Europa;
        double convercion2 = valor * ReinoUnido;
        double convercion3 = valor * Australia;
        double convercion4 = valor * Canada;
        
        System.out.println(valor + " Dolares " + " son " + convercion1 + " Euros ");
        System.out.println(valor + " dolares " + " son " + convercion2 + " Libra esterlina ");
        System.out.println(valor + " dolares " + " son " + convercion3 + " Dólar australiano");
        System.out.println(valor + " dolares " + " son " + convercion4 + " Dólar canadiense");
        
    }
    
}
