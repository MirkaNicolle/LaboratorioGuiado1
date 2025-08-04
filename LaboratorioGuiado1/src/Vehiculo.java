// Clase abstracta Vehiculo
abstract class Vehiculo {
    // Atributo protegido que almacena la velocidad maxima
    protected int velocidadMaxima;

    // Constructor que inicializa la velocidad maxima
    public Vehiculo(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    // Metodo abstracto que se implementara en las subclases
    public abstract void mostrarTipo();
}