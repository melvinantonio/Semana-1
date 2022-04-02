/*
3-. Un docente universitario gana $8.00 la hora de clase y ha impartido 36 horas en un mes de clases. Debemos de
calcular el salario del docente sabiendo que le van a descontar el 10% de la renta. ¿Cuánto ganara el docente al final de
un mes de clases menos el descuento de la renta?
 */
package EjerciciosDeAplicacion;
public class Ejercicio_3 {
    public static void main(String[] args) {
        int horas = 36;
        int precio = 8;
        double salarioHoras = 0;
        double renta = 0.1;
        double salarioNeto = 0;
        
        salarioHoras = horas * precio;
        double descuento = salarioHoras * renta;
        salarioNeto = salarioHoras - descuento;
        
        
        System.out.println("El docente ganara $ " + salarioNeto + " al final del mes ");
        
    }
    
}
