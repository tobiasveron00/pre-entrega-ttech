public class ProductoElectronico extends Producto{
    private String categoria;
    private String caracteristicas;

    ProductoElectronico(String nombre, double precio, String categoria, String caracteristicas){
        super(nombre, precio);
        this.categoria = categoria;
        this.caracteristicas = caracteristicas;
    }
}
