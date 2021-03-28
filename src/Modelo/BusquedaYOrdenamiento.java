package Modelo;

import java.util.ArrayList;

public interface BusquedaYOrdenamiento {

    ArrayList busquedaPorLetra(String letra);

    ArrayList ordenamientoDeMayorAMenor(ArrayList lista);

    ArrayList ordenamientoDeMenorAMayor(ArrayList lista);

}
