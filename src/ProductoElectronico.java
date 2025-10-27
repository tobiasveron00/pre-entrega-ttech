public class ProductoElectronico extends Producto{
    private String categoria;
    private String caracteristicas;

    ProductoElectronico(String nombre, double precio, int stock,String categoria, String caracteristicas){
        super(nombre, precio, stock);
        this.categoria = categoria;
        this.caracteristicas = caracteristicas;
    }
}
