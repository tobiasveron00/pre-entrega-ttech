import java.util.ArrayList;
import java.util.Scanner;

// SISTEMA DE GESTION DE PEDIDOS COMIDA RAPIDA !!


public class Main {
    private static ArrayList<Producto> productosDB = getProductos(); // Ingresa los primeros productos del sistema
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // INICIALIZACION DE VARIABLES DE PARTE LOGICA
        boolean estadoPrograma = true;  // si esta true, corre el programa
        ArrayList<Producto> pedido = new ArrayList(); // Inicializo el listado de pedidos
        //INICIALIZACION DE VARIABLES PARA INPUT
        int inputUsuario;

        while (estadoPrograma){
            System.out.println("""
                Elija una opción:
                1) Agregar producto
                2) Listar productos
                3) Buscar/Actualizar producto
                4) Eliminar producto
                5) Crear un pedido
                6) Listar pedidos
                7) Salir
                """
            );

            inputUsuario = entrada.nextInt();
            inicioInput:
            switch (inputUsuario) {
                case 1 -> agregarproducto();
                case 2 -> listarProductos(productosDB);
//                case 3 -> buscarProductoPorNombre(productosDB);
//                case 4 -> editarProducto(productosDB);
//                case 5 -> borrarProducto(productosDB);
//                case 6 -> System.out.println("Funcionalida en progreso...");
                case 7 -> {
                    System.out.println("Gracias por usar la app!");
                    estadoPrograma=false;
                }
                default -> System.out.println("Opción incorrecta, intente de nuevo");
            }
        }

    }

   private static ArrayList<Producto> getProductos(){

        ArrayList<Producto> prods = new ArrayList<>();
       prods.add(new ProductoAlimenticio("Papas Fritas", 3499.99, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Pancho", 4200.50, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Pizza", 8999.00, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Nuggets de Pollo", 6550.75, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Aros de Cebolla", 4890.00, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Tacos", 7100.25, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Burrito", 7850.50, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Quesadilla", 6999.99, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Sándwich de Pollo", 7500.00, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Ensalada César", 6800.75, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Helado", 3200.00, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Malteada", 4500.50, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Gaseosa", 2500.00, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Agua Mineral", 2100.99, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Jugo de Naranja", 2800.25, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Café", 2300.00, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Alitas de Pollo", 9500.75, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Wrap", 7250.00, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Muffin", 3100.50, "Comida rapida"));
       prods.add(new ProductoAlimenticio("Dona", 2900.99, "Comida rapida"));
        return prods;
    }

    public static void agregarproducto(){
        Producto newProd;
        System.out.println("""
        Ingrese el nombre del nuevo producto: 
        1) Alimenticio
        2) Electronico
        3) Indumentaria
        4) Otros
        
        """);
        int opcionAgregarProd= entrada.nextInt();

        switch (opcionAgregarProd){
            case 1 -> {
                System.out.print("Ingrese el nombre : ");
                String nombre = entrada.next();
                System.out.print("Ingrese el precio : ");
                double precio = entrada.nextDouble();
                System.out.print("Ingrese que tipo de alimento es :  ");
                String tipoDeAlimento = entrada.next();
                ProductoAlimenticio nuevoProd = new ProductoAlimenticio(nombre, precio, tipoDeAlimento);
                productosDB.add(nuevoProd);

            }
            case 2 -> {
                System.out.print("Ingrese el nombre : ");
                String nombre = entrada.nextLine();
                System.out.print("Ingrese el precio :");
                double precio = entrada.nextDouble();
                System.out.print("Ingrese de que area es (Computacion, Electrodomestico, etc)");
                String categoria = entrada.nextLine();
                System.out.print("Ingrese las caracteristicas del producto:");
                String caracteristicas = entrada.nextLine();
                ProductoElectronico nuevoProd  = new ProductoElectronico(nombre, precio, categoria, caracteristicas);
                productosDB.add(nuevoProd);

            }
            default -> System.out.println("Opción incorrecta, intente de nuevo");

        }
        pausa();

    }

    public static void listarProductos(ArrayList<Producto> productos) {
        System.out.println("==========================================================");
        System.out.println("                  LISTA DE PRODUCTOS                      ");
        System.out.println("==========================================================");

        if (productos == null || productos.isEmpty()) {
            System.out.println("⚠️  No hay productos para mostrar.");
        } else {
            System.out.printf("| %-3s | %-35s | %-10s |%n",
                    "ID", "Nombre", "Precio");
            System.out.println("----------------------------------------------------------");

            for (Producto producto : productos) {
                System.out.printf("| %3d | %-35s | $%9.2f |%n",
                        producto.getId(),
                        producto.getNombre(),
                        producto.getPrecio());
            }
        }

        System.out.println("===========================================================");
        pausa();
    }
    public static void pausa() {
        System.out.println("Pulse ENTER para continuar...");
        entrada = new Scanner(System.in);
        entrada.nextLine();
        for (int i = 0; i < 20; ++i) {
            System.out.println();
        }
        // TODO: limpiar la pantalla de la consola
        System.out.print("\033[H\033[2J");
    }
}