abstract class Producto {
    private int id;
    private String nombre;
    private double precio;
    int stock;
    protected static int  nextId = 1;


    Producto(String nombre, double precio, int stock) {
        this.nombre=nombre;
        this.precio= precio;
        this.id = nextId;
        this.stock = stock;
        nextId++;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getStock() { return this.stock; }

    public double getPrecio() {return this.precio; }
}
