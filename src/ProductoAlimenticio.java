public class ProductoAlimenticio extends Producto{
    private String tipoDeAlimento;

    ProductoAlimenticio(String nombre, double precio, String tipoDeAlimento) {
       super(nombre, precio);
       this.tipoDeAlimento = tipoDeAlimento;
    }



}
