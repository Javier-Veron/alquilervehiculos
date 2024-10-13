import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RodadosTest {

    Rodados r1 = new Rodados();
    Rodados r2 = new Rodados();

    Vehiculo bici1 = new Bicicleta(26);
    Vehiculo bici2 = new Bicicleta(29);
    Vehiculo moto1 = new Moto(60,true);
    Vehiculo moto2 = new Moto(150,false);
    Vehiculo auto1 = new Auto(2,200);
    Vehiculo auto2 = new Auto(4,100);

    @Test
    void vehiculosQueConsumenMenosDe() {

        r1.vehiculos.add(bici1);
        r1.vehiculos.add(bici2);
        r1.vehiculos.add(moto1);
        r1.vehiculos.add(moto2);
        r1.vehiculos.add(auto1);
        r1.vehiculos.add(auto2);

        r2.vehiculos.add(bici1);
        r2.vehiculos.add(bici2);
        r2.vehiculos.add(moto1);
        r2.vehiculos.add(auto1);

        assertEquals(r2.getVehiculos(), r1.vehiculosQueConsumenMenosDe(60));

    }

    @Test
    void vehiculoMasEficiente() {

        r1.vehiculos.add(bici1);
        r1.vehiculos.add(bici2);
        r1.vehiculos.add(moto1);
        r1.vehiculos.add(moto2);
        r1.vehiculos.add(auto1);
        r1.vehiculos.add(auto2);

        assertEquals(bici2,r1.vehiculoMasEficiente());

    }

    @Test
    void cantidadTotalPasajerosTransportablesA() {

        r1.vehiculos.add(bici1);//-
        r1.vehiculos.add(bici2);//-
        r1.vehiculos.add(moto1);//-
        r1.vehiculos.add(moto2);//2
        r1.vehiculos.add(auto1);//2
        r1.vehiculos.add(auto2);//4

        assertEquals(8,r1.cantidadTotalPasajerosTransportablesA(60));

    }

    @Test
    void vehiculosMasAccidentadosEn() {

        bici1.agregarAccidente(1,"abc",2024);
        bici1.agregarAccidente(2,"def",2024);

        moto1.agregarAccidente(3,"abc",2023);
        moto1.agregarAccidente(4,"def",2024);

        auto1.agregarAccidente(5,"abc",2020);

        auto2.agregarAccidente(6,"def",2024);
        auto2.agregarAccidente(7,"ghi",2024);
        auto2.agregarAccidente(8,"jkl",2024);

        r1.vehiculos.add(bici1);
        r1.vehiculos.add(bici2);
        r1.vehiculos.add(moto1);
        r1.vehiculos.add(moto2);
        r1.vehiculos.add(auto1);
        r1.vehiculos.add(auto2);

        r2.vehiculos.add(auto2);
        r2.vehiculos.add(bici1);
        r2.vehiculos.add(moto1);

        assertEquals(r2.vehiculos,r1.vehiculosMasAccidentadosEn(2024));

    }

    @Test
    void vehiculosConMayorKilometraje() {


        bici1.setCantidadKM(250);
        bici2.setCantidadKM(15);
        moto1.setCantidadKM(6000);
        moto2.setCantidadKM(10000);
        auto1.setCantidadKM(7000);
        auto2.setCantidadKM(25000);

        r1.vehiculos.add(bici1);
        r1.vehiculos.add(bici2);
        r1.vehiculos.add(moto1);
        r1.vehiculos.add(moto2);
        r1.vehiculos.add(auto1);
        r1.vehiculos.add(auto2);

        r2.vehiculos.add(auto2);
        r2.vehiculos.add(moto2);
        r2.vehiculos.add(auto1);
        r2.vehiculos.add(moto1);
        r2.vehiculos.add(bici1);
        r2.vehiculos.add(bici2);

        assertEquals(r2.vehiculos,r1.vehiculosConMayorKilometraje());
    }
}