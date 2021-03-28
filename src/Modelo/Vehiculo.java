package Modelo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Vehiculo implements ImpresionDeDatos{

    protected String marcaVehiculo;
    protected String modeloVehiculo;
    protected double precioVehiculo;

    public Vehiculo(String marca, String modelo,double precio){
        this.marcaVehiculo = marca;
        this.modeloVehiculo = modelo;
        this.precioVehiculo = precio;
    }

    public void setMarcaVehiculo(String marca){
        this.marcaVehiculo = marca;
    }

    public void setModeloVehiculo(String modelo){
        this.modeloVehiculo = modelo;
    }

    public void setPrecioVehiculo(float precio){
        this.precioVehiculo = precio;
    }

    public String getMarcaVehiculo(){
        return this.marcaVehiculo;
    }

    public String getModeloVehiculo(){
        return this.modeloVehiculo;
    }

    public double getPrecioVehiculo() {
        return precioVehiculo;
    }

    public abstract String imprimirDatos();

    protected String formatoDeNumero(double numeroACambiarformato){
        Locale locale = new Locale ("es", "ES");
        NumberFormat objNF2 = NumberFormat.getInstance (locale);
        String precio = objNF2.format(this.precioVehiculo);
        DecimalFormat formaeador = new DecimalFormat("###,###.00");
        return formaeador.format(numeroACambiarformato);
    }

    @Override
    public String imprimirMarcaModelo(){
        return getMarcaVehiculo()+" "+getModeloVehiculo();
    }

    @Override
    public String imprimirMarcaModeloYPrecio(){
      return getMarcaVehiculo()+" "+getModeloVehiculo()+" "+formatoDeNumero(getPrecioVehiculo());
    }

}
