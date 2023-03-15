public class Carrito {
    private String prods[] = new String[3];
    private double precios[] = new double[3];
    private int cont = 0;

    public Carrito(){
    }

    public void agregarProducto(String producto, double precioUnit){
        this.precios[cont] = precioUnit;
        this.prods[cont]   = producto;
        cont = cont + 1;
    }
    public double precio(){

        return (precios[0] + precios[1] + precios[2]);
    }

}
