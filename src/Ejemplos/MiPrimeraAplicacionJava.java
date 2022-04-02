package Ejemplos;

public class MiPrimeraAplicacionJava {

    public static void main(String[] args) {
       String nombreCompleto, direccion, estadoCivil;
       int edad;
       double gastosDiarios;
       char genero;
       boolean poseeVeiculo;
       
       nombreCompleto = "Melvin Antonio Angel Lopez";
       direccion = "Canton Ulapa Arriba";
       estadoCivil = "Soltero";
       edad = 19;
       gastosDiarios = 32.2;
       genero = 'M';
       poseeVeiculo = false;
       
        System.out.println("Nombre Completo es: " + nombreCompleto);
        System.out.println("Direcion es       : " + direccion);
        System.out.println("Estado Civil es   : " + estadoCivil);
        System.out.println("Edad es           : " + edad);
        System.out.println("Gastos Diarios    : " + gastosDiarios);
        System.out.println("Genero es         : " + genero);
        System.out.println("Posee Veiculo     : " + poseeVeiculo);
    }
    
}
