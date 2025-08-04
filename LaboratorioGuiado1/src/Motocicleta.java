class Motocicleta extends Vehiculo implements Controlable {
    public Motocicleta(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Motocicleta");
    }

    @Override
    public void encender() {
        System.out.println("La motocicleta esta encendida");
    }

    @Override
    public void apagar() {
        System.out.println("La motocicleta esta apagada");
    }
}