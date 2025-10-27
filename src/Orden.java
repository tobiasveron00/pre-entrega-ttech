import java.util.ArrayList;

public class Orden {
    ArrayList<Producto> productos;
    int cantidadDeProductos;

    Orden(){
        productos= new ArrayList<>();
        cantidadDeProductos = 0;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
        cantidadDeProductos++;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public double getPrecioTotal(){
        double precioTotal = 0;
        for (Producto prod : productos){
            precioTotal+= prod.getPrecio();
        }
        return precioTotal;
    }
}
