/*
5-. Un trabajador de la industria de la construcción gana $10 diarios en su jornada normal de trabajo. En ciertas ocasiones 
el empleado tiene que trabajar horas extras para cumplir con su trabajo. En el mes a acumulado 50 horas extras que se la 
pagan al 10% del valor del pago diario. ¿Cuánto ganara el trabajador al final de un mes de trabajo? 

Tomar en consideración que al trabajador le descontaran el 10% en concepto de renta.
 */
package EjerciciosDeAplicacion;

public class Ejercicio_5 {
    public static void main(String[] args) {
        
        int JornadaNormal = 10;
        int HorasExtras = 50;
        double ValorDelPagoDiario = 0.10;
        int MesTrabajo = 31;
        double Renta = 0.10;
        double DescuentoRenta;        
        double Salario;
        double SalarioTotal;
        
        Salario = JornadaNormal * HorasExtras * ValorDelPagoDiario * MesTrabajo;
        DescuentoRenta = Renta * Salario;
        SalarioTotal = Salario - DescuentoRenta;
        
        System.out.println("El trabajador gana $" + Salario + " al final del mes.");
        
        System.out.println("Al trabajador se le desconto del 10% en concepto de renta: $" + DescuentoRenta);
        
        System.out.println("EL salario total del mes es: $" + SalarioTotal);
    }
    
}
