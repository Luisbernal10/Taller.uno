package Taller.uno;
public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    // Constructor por defecto con valores predeterminados
    public Libro() {
        titulo = "Desconocido";
        autor = "Anónimo";
        numeroPaginas = 0;
    }

    // Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para mostrar los detalles del libro
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
    public String toString() {
        return "Libro{" +"Título='" + titulo + '\'' +", Autor='" + autor + '\'' +", Número de páginas=" + numeroPaginas +'}';
    }
}
