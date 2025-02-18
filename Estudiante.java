public class Estudiante {
    String nombre;
    String edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    // Constructor por defecto que llama al constructor con parámetros
    public Estudiante() {
        this("Desconocido", 0); // Llama al constructor con parámetros

    }
    public void mostrarEstudiante() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void metodoEstatico() {
        System.out.println(this.valor); // Error
    }
}
