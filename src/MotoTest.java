import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    Vehiculo moto1 = new Moto(60,true);
    Vehiculo moto2 = new Moto(150,false);

    @Test
    void cantidadPasajeros() {

        assertEquals(1,moto1.cantidadPasajeros());
        assertEquals(2,moto2.cantidadPasajeros());
    }

    @Test
    void consumoCadaCienKM() {

        assertEquals(56,moto1.consumoCadaCienKM());
        assertEquals(65,moto2.consumoCadaCienKM());

    }

    @Test
    void velocidadMaxima() {

        assertEquals(30,moto1.velocidadMaxima());
        assertEquals(75,moto2.velocidadMaxima());
    }
}