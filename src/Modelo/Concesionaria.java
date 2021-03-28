package Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Concesionaria implements BusquedaYOrdenamiento{

    private ArrayList<Vehiculo> listaDeVehiculos;

    public Concesionaria(){
        this.listaDeVehiculos = new ArrayList<>();
    }

    private void imprimirListaDeVehiculos(){
        for (Vehiculo listaDeVehiculo : this.listaDeVehiculos) {
            System.out.println(listaDeVehiculo.imprimirDatos());
        }
    }

    @Override
    public ArrayList ordenamientoDeMayorAMenor(ArrayList lista){
        lista.sort(Comparator.comparing(Vehiculo::getPrecioVehiculo));
        Collections.reverse(lista);
        return lista;
    }

    @Override
    public ArrayList ordenamientoDeMenorAMayor(ArrayList lista){
       lista.sort(Comparator.comparing(Vehiculo::getPrecioVehiculo));
       return lista;
    }

    @Override
    public ArrayList busquedaPorLetra(String letra){
        ArrayList<Vehiculo> listaDeCoincidencias = new ArrayList<>();
        this.listaDeVehiculos.forEach(vehiculo -> {
            if(vehiculo.getModeloVehiculo().contains(letra)){
                listaDeCoincidencias.add(vehiculo);
            }
        });
        return listaDeCoincidencias;
    }

    private void imprimirLista(ArrayList<Vehiculo> lista){
        for (Vehiculo vehiculo : lista) {
            System.out.println(vehiculo.imprimirMarcaModeloYPrecio());
        }
    }

    private void imprimirDatosParticulares(){
        ArrayList<Vehiculo> listaAuxiliar = this.listaDeVehiculos;
        ordenamientoDeMayorAMenor(listaAuxiliar);
        System.out.println("Vehiculo más caro: "+listaAuxiliar.get(0).imprimirMarcaModelo());
        ordenamientoDeMenorAMayor(listaAuxiliar);
        System.out.println("Vehiculo más barato: "+listaAuxiliar.get(0).imprimirMarcaModelo());
        listaAuxiliar = this.busquedaPorLetra("Y");//Asigno la letra a buscar para usarla por default;
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’:");
        imprimirLista(listaAuxiliar);
    }

    private void imprimirListaDeMayorAMenorPrecio(){
        ArrayList<Vehiculo> listaAuxiliar = this.listaDeVehiculos;
        ordenamientoDeMayorAMenor(listaAuxiliar);
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        for (Vehiculo vehiculo : listaAuxiliar) {
            System.out.println(vehiculo.imprimirMarcaModelo());
        }
    }

    public void imprimirDatos(){
        this.imprimirListaDeVehiculos();
        System.out.println("=============================================");
        this.imprimirDatosParticulares();
        System.out.println("=============================================");
        this.imprimirListaDeMayorAMenorPrecio();
    }

    //Este metodo fue creado para la automatizacion de ingreso de los datos
    public void cargarDatos(){
        Auto auto = new Auto("Peugeot","206","4",200000);
        listaDeVehiculos.add(auto);
        Moto moto = new Moto("Honda","Titan","125c",60000);
        listaDeVehiculos.add(moto);
        Auto auto1 = new Auto("Peugeot","208","5",250000);
        listaDeVehiculos.add(auto1);
        Moto moto1 = new Moto("Yamaha","YBR","160c", 80500.50);
        listaDeVehiculos.add(moto1);
    }
}
