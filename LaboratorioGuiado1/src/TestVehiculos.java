public class TestVehiculos {
    public static void main(String[] args) {
        Coche miCoche = new Coche(220);
        Motocicleta miMoto = new Motocicleta(180);

        // Pruebas de métodos sobrescritos y sobrecargados
        miCoche.mostrarTipo();               // Coche
        miCoche.mostrarTipo("eléctrico");    // Coche: eléctrico
        miMoto.mostrarTipo();                // Motocicleta

        // Pruebas de interfaz
        miCoche.encender();                  // El coche está encendido
        miCoche.apagar();                    // El coche está apagado
        miMoto.encender();                   // La motocicleta está encendida
        miMoto.apagar();                     // La motocicleta está apagada

        // Polimorfismo: Vehículo puede referenciar objetos de sus subclases
        Vehiculo v1 = new Coche(200);
        Vehiculo v2 = new Motocicleta(160);

        v1.mostrarTipo();                    // Coche
        v2.mostrarTipo();                    // Motocicleta

        // Polimorfismo con la interfaz
        Controlable c1 = new Coche(240);
        Controlable c2 = new Motocicleta(190);

        c1.encender();                       // El coche está encendido
        c2.encender();                       // La motocicleta está encendida
    }
}