class Coche extends Vehiculo implements Controlable {
    public Coche(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Coche");
    }

    public void mostrarTipo(String mensaje) {
        System.out.println("Coche: " + mensaje);
    }

    @Override
    public void encender() {
        System.out.println("El coche esta encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El coche esta apagado");
    }
}