public class Main {
    public static void main(String[] args) {

        //Creo los productos.
        Producto prodLimpieza1 = new Producto("jabón en polvo", 40);
        Producto prodLimpieza2 = new Producto("esponjas", 10);
        Producto prodLimpieza3 = new Producto("chocolates", 100);

        //Creo a la persona con carrito y obtengo el carrito por separado.
        Persona Franco = new Persona("Franco");
        Carrito miCarrito  = Franco.getCarrito();

        //Le agrego al carrito que separé para manipular productos de limpieza.
        miCarrito.agregarProducto(prodLimpieza1.darNombre(), prodLimpieza1.darPrecio());
        miCarrito.agregarProducto(prodLimpieza2.darNombre(), prodLimpieza2.darPrecio());
        miCarrito.agregarProducto(prodLimpieza3.darNombre(), prodLimpieza3.darPrecio());

        //Imprimo el método que devuelve la suma de los productos del carrito de Franco
        System.out.println(miCarrito.precio());

    }
}