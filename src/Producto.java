abstract class Producto {
    private int id;
    private String nombre;
    private double precio;
    protected static int  nextId = 1;


    Producto(String nombre, double precio) {
        nextId++;
        this.nombre=nombre;
        this.precio= precio;
        this.id = nextId;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
