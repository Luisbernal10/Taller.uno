package Taller.uno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creación de un Libro con entrada de usuario
        System.out.println("Ingrese los datos del libro:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine();  
        Libro libro = new Libro(titulo, autor, numeroPaginas);

        // Creación de una CuentaBancaria con entrada de usuario
        System.out.println("\nIngrese los datos de la cuenta bancaria:");
        System.out.print("Número de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();  
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);

        // Creación de un Estudiante con entrada de usuario
        System.out.println("\nIngrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        // Mostrar detalles de los objetos creados
        System.out.println("\n Datos del Libro:");
        System.out.println(libro);

        System.out.println("\n Datos de la Cuenta Bancaria:");
        System.out.println(cuentaBancaria);

        System.out.println("\n Datos del Estudiante:");
        System.out.println(estudiante);

        scanner.close();
    }
}
