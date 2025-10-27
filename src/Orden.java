import java.util.ArrayList;

public class Orden {
    private int id;
    ArrayList<Producto> productos;
    protected static int  nextId = 1;


    Orden(){
        productos= new ArrayList<>();
        id = nextId;
        nextId++;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public ArrayList<Producto> getProductos() { return productos;}

    public int getId() { return id; }

    public int getCantidadDeProductos() { return productos.size(); }

    public double getPrecioTotal(){
        double precioTotal = 0;
        for (Producto prod : productos){
            precioTotal+= prod.getPrecio();
        }
        return precioTotal;
    }
}
