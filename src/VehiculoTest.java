import static org.junit.jupiter.api.Assertions.*;

class VehiculoTest {
    Vehiculo bici1 = new Bicicleta(26);
    Vehiculo bici2 = new Bicicleta(29);
    Vehiculo moto1 = new Moto(60);
    Vehiculo moto2 = new Moto(150);
    Vehiculo auto1 = new Auto(2,200);
    Vehiculo auto2 = new Auto(4,100);

    @org.junit.jupiter.api.Test
    void cantidadAccidentesPorAnio() {

        bici1.agregarAccidente(1,"abc",2024);
        bici1.agregarAccidente(2,"def",2024);
        moto1.agregarAccidente(3,"abc",2023);
        moto1.agregarAccidente(4,"def",2024);
        auto1.agregarAccidente(5,"abc",2020);
        auto2.agregarAccidente(6,"def",2024);

        assertEquals(2,bici1.cantidadAccidentesPorAnio(2024));
        assertEquals(0,bici2.cantidadAccidentesPorAnio(2024));
        assertEquals(1,moto1.cantidadAccidentesPorAnio(2024));
        assertEquals(0,auto1.cantidadAccidentesPorAnio(2024));
        assertEquals(1,auto2.cantidadAccidentesPorAnio(2024));

    }

    @org.junit.jupiter.api.Test
    void eficiencia() {
        assertEquals(31,Math.round(bici1.eficiencia()));
        assertEquals(35,Math.round(bici2.eficiencia()));
        assertEquals(1,Math.round(moto1.eficiencia()));
        assertEquals(2,Math.round(moto2.eficiencia()));
        assertEquals(10,Math.round(auto1.eficiencia()));
        assertEquals(7,Math.round(auto2.eficiencia()));
    }

    @org.junit.jupiter.api.Test
    void cantidadPasajeros() {
        assertEquals(1,bici1.cantidadPasajeros());
        assertEquals(1,bici2.cantidadPasajeros());
        assertEquals(1,moto1.cantidadPasajeros());
        assertEquals(2,moto2.cantidadPasajeros());
        assertEquals(2,auto1.cantidadPasajeros());
        assertEquals(4,auto2.cantidadPasajeros());
    }

    @org.junit.jupiter.api.Test
    void consumoCadaCienKM() {
        assertEquals(1,bici1.consumoCadaCienKM());
        assertEquals(1,bici2.consumoCadaCienKM());
        assertEquals(56,moto1.consumoCadaCienKM());
        assertEquals(65,moto2.consumoCadaCienKM());
        assertEquals(40,auto1.consumoCadaCienKM());
        assertEquals(60,auto2.consumoCadaCienKM());
    }

    @org.junit.jupiter.api.Test
    void velocidadMaxima() {
        assertEquals(31.2,bici1.velocidadMaxima());
        assertEquals(34.8,bici2.velocidadMaxima());
        assertEquals(30,moto1.velocidadMaxima());
        assertEquals(75,moto2.velocidadMaxima());
        assertEquals(200,auto1.velocidadMaxima());
        assertEquals(100,auto2.velocidadMaxima());
    }
}