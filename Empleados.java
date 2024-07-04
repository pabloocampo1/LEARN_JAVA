/*
 * Proyecto 1: Sistema de Gestión de Empleados
Descripción: Crea un sistema para gestionar empleados en una empresa.

Clases y Herencia:
Empleado: Clase base con atributos encapsulados como nombre, ID, y salario.
EmpleadoTiempoCompleto y EmpleadoTiempoParcial: Clases derivadas de Empleado con atributos adicionales específicos para empleados a tiempo completo y parcial.
Funciones:
Métodos para establecer y obtener los atributos de los empleados (usando getters y setters).
Métodos para calcular el salario basado en el tipo de empleado.
 * 
 * 
 */

import java.util.Scanner;


class Empleado {
    String nombre;
    int Id;

    public Empleado(String nombre, int Id) {
        this.nombre = nombre;
        this.Id = Id;
    };

    public void mostrarInfo(){
        System.out.println("id : "+this.Id);
        System.out.println("nombre : "+this.nombre);
    }

    
};

class EmpleadoTiempoCompleto extends Empleado{
    private double salario;
    private int diasTrabajados;
    private double totalSalario;
    public EmpleadoTiempoCompleto(String nombre, int Id, double salario){
        super(nombre, Id);
        this.salario = salario;
    }

    public void mostrarInfo(){
        System.out.println("Info empleado a tiempo completo");
        System.out.println("id : "+ Id);
        System.out.println("nombre : "+ nombre);
        System.out.println("salario : "+ salario);
        System.out.println("dias trabajados : "+ diasTrabajados);
    }
    public double CalcularSalario(){
        Scanner input = new Scanner(System.in);
        System.out.println("digite el numero de dias trabajo de: "+nombre);
        int numeroTotal = input.nextInt();
        diasTrabajados = numeroTotal;
        totalSalario = salario * diasTrabajados;
        input.close();
        return totalSalario;
    }

    

};

class empleadoTiempoParcial extends Empleado{
    private double salarioHoras;
    private int horasTrabajadas;
    private double totalSalario;
    public empleadoTiempoParcial(String nombre, int Id){
        super(nombre, Id);
    }

    public void mostrarInfo(){
        System.out.println("Info empleado a tiempo parcial");
        System.out.println("id : "+ Id);
        System.out.println("nombre : "+ nombre);
        System.out.println("salario por horas : "+ salarioHoras);
        System.out.println("horas trabajados : "+ horasTrabajadas);
    }
    public double CalcularSalario(){
        Scanner input = new Scanner(System.in);
        System.out.println("digite el pago por hora: ");
        int pagoXhora = input.nextInt();
        System.out.println("digite el numero de horas trabajo de: "+nombre);
        int horasTrabajadas = input.nextInt();

        totalSalario = pagoXhora * horasTrabajadas;
        input.close();
        System.out.println("el total de sueldo es: ");
        return totalSalario;
    }

}

public class Empleados {
    public static void main(String[] args) {
        empleadoTiempoParcial empleado1 = new empleadoTiempoParcial("juan pablo 2", 12);
        empleado1.mostrarInfo();
        double sueldoTotal = empleado1.CalcularSalario();
        System.out.println(sueldoTotal);
        
    }
}


