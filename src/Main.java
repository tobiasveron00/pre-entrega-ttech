import java.util.ArrayList;
import java.util.Scanner;

// SISTEMA DE GESTION DE PEDIDOS COMIDA RAPIDA !!


public class Main {

    public static void main(String[] args) {
        // INICIALIZACION DE VARIABLES DE PARTE LOGICA
        boolean estadoPrograma = true;  // si esta true, corre el programa
        ArrayList<Producto> pedido = new ArrayList(); // Inicializo el listado de pedidos
        ArrayList<Producto> productos = getProductosAlimentarios(); // Ingresa los primeros productos del sistema

        //INICIALIZACION DE VARIABLES PARA INPUT
        int inputUsuario;
        Scanner entrada = new Scanner(System.in);

        while (estadoPrograma){
            System.out.println("""Elija una opción:
                1) Agregar producto
                2) Listar productos
                3) Buscar/Actualizar producto
                4) Eliminar producto
                5) Crear un pedido
                6) Listar pedidos
                7) Salir"""
            );

            inputUsuario = entrada.nextInt();
            inicioInput:
            switch (inputUsuario) {
                case 1 -> //agregarproducto()
                case 2 -> //listarProductos(productosDB);
                case 3 -> //buscarProductoPorNombre(productosDB);
                case 4 -> //editarProducto(productosDB);
                case 5 -> //borrarProducto(productosDB);
                case 6 -> //System.out.println("Funcionalida en progreso...");
                case 7 -> {
                    System.out.println("Gracias por usar la app!");
                    estadoPrograma=false;
                }
                default -> System.out.println("Opción incorrecta, intente de nuevo");
            }
        }

    }

   static ArrayList<Producto> getProductosAlimentarios(){
        ArrayList<Producto> prods = new ArrayList<>();
        prods.add(new Producto("Papas Fritas", 3499.99));
        prods.add(new Producto("Pancho", 4200.50));
        prods.add(new Producto("Pizza", 8999.00));
        prods.add(new Producto("Nuggets de Pollo", 6550.75));
        prods.add(new Producto("Aros de Cebolla", 4890.00));
        prods.add(new Producto("Tacos", 7100.25));
        prods.add(new Producto("Burrito", 7850.50));
        prods.add(new Producto("Quesadilla", 6999.99));
        prods.add(new Producto("Sándwich de Pollo", 7500.00));
        prods.add(new Producto("Ensalada César", 6800.75));
        prods.add(new Producto("Helado", 3200.00));
        prods.add(new Producto("Malteada", 4500.50));
        prods.add(new Producto("Gaseosa", 2500.00));
        prods.add(new Producto("Agua Mineral", 2100.99));
        prods.add(new Producto("Jugo de Naranja", 2800.25));
        prods.add(new Producto("Café", 2300.00));
        prods.add(new Producto("Alitas de Pollo", 9500.75));
        prods.add(new Producto("Wrap", 7250.00));
        prods.add(new Producto("Muffin", 3100.50));
        prods.add(new Producto("Dona", 2900.99));
        return prods;
    }
}