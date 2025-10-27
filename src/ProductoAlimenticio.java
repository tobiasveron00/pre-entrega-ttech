public class ProductoAlimenticio extends Producto{
    private String tipoDeAlimento;

    ProductoAlimenticio(String nombre, double precio,int stock, String tipoDeAlimento) {
       super(nombre, precio, stock);
       this.tipoDeAlimento = tipoDeAlimento;
    }



}
