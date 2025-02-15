package Taller.uno;
public class Estudiante {
    String nombre;
    int edad;
    String curso;

    public Estudiante(){
        nombre = "Desconocido";
        edad = 0;
        curso = "No asignado";

    }
    // Constructor que acepta nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }
     // Constructor que acepta todos los parámetros y usa this() para reutilizar otro constructor
        public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llamada al constructor de dos parámetros
        this.curso = curso;
    }
    public String toString() {
        return "Estudiante{" +"Nombre='" + nombre + '\'' +", Edad=" + edad +", Curso='" + curso + '\'' +'}';
    }

}
