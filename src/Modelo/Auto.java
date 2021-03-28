package Modelo;

public class Auto extends Vehiculo{

    private String cantidadDePuertas;

    public Auto(String marca, String modelo,String puertas,float precio){
        super(marca,modelo,precio);
        this.cantidadDePuertas = puertas;
    }

    public void setCantidadDePuertas(String cantidad){
        this.cantidadDePuertas = cantidad;
    }

    private String getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    private String mostrarDatosDelAuto(){
        return "Marca: "+getMarcaVehiculo()+" // Modelo: "+getModeloVehiculo()+
                " // Puertas: "+getCantidadDePuertas()+" // Precio: $"+formatoDeNumero(getPrecioVehiculo());
    }

    @Override
    public String imprimirDatos(){
        return  mostrarDatosDelAuto();
    }

}
