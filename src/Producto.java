import java.time.LocalDate;

public class Producto {

    private String nombre;

    private double precio;


    public Producto(String nombre, double precioProd){
        this.nombre = nombre;
        this.precio = precioProd;
    }

    public String darNombre(){
        return this.nombre;
    }

    public double darPrecio(){
        return this.precio;
    }
}
