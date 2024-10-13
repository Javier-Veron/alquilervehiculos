import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {

    Vehiculo bici1 = new Bicicleta(20);
    Vehiculo bici2 = new Bicicleta(30);

    @Test
    void cantidadPasajeros() {

        assertEquals(1,bici1.cantidadPasajeros());
        assertEquals(1,bici2.cantidadPasajeros());
    }

    @Test
    void consumoCadaCienKM() {

        assertEquals(1,bici1.consumoCadaCienKM());
        assertEquals(1,bici2.consumoCadaCienKM());
    }

    @Test
    void velocidadMaxima() {

        assertEquals(24,bici1.velocidadMaxima());
        assertEquals(36,bici2.velocidadMaxima());

    }
}