import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    Vehiculo auto1 = new Auto(3,120);
    Vehiculo auto2 = new Auto(2,100);
    @Test
    void cantidadPasajeros() {

        assertEquals(3,auto1.cantidadPasajeros());
        assertEquals(2,auto2.cantidadPasajeros());
    }

    @Test
    void consumoCadaCienKM() {

        assertEquals(50,auto1.consumoCadaCienKM());
        assertEquals(40,auto2.consumoCadaCienKM());

    }

    @Test
    void velocidadMaxima() {

        assertEquals(120,auto1.velocidadMaxima());
        assertEquals(100,auto2.velocidadMaxima());

    }
}