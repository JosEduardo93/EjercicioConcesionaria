import Modelo.Auto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutoTest {

    @Test
    protected void Test01CargaYMuestraDedatos(){
        Auto auto = new Auto("Peugeot","206","4",200000);
        assertEquals(auto.imprimirDatos(),"Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00");
    }

}
