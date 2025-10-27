import java.util.ArrayList;
import java.util.Scanner;

// SISTEMA DE GESTION DE PEDIDOS COMIDA RAPIDA !!


public class Main {
    private static ArrayList<Producto> productosDB = getProductos(); // Ingresa los primeros productos del sistema
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // INICIALIZACION DE VARIABLES DE PARTE LOGICA
        boolean estadoPrograma = true;  // si esta true, corre el programa
        ArrayList<Orden> ordenesDB= new ArrayList(); // Inicializo el listado de pedidos
        //INICIALIZACION DE VARIABLES PARA INPUT
        int inputUsuario;

        while (estadoPrograma){
            System.out.println("""
                Elija una opción:
                1) Agregar producto
                2) Listar productos
                3) Buscar producto
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
                case 3 -> buscarProductoPorNombre(productosDB);
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
        prods.add(new ProductoAlimenticio("Papas Fritas", 3899.50, 45, "Comida rapida"));
        prods.add(new ProductoAlimenticio("Pancho", 4150.75, 52, "Comida rapida"));
        prods.add(new ProductoAlimenticio("Pizza", 9125.00, 18, "Comida rapida"));
        prods.add(new ProductoAlimenticio("Nuggets de Pollo", 6780.25, 33, "Comida rapida"));
        prods.add(new ProductoAlimenticio("Aros de Cebolla", 5010.99, 61, "Comida rapida"));
        prods.add(new ProductoAlimenticio("Tacos", 7350.50, 27, "Comida rapida"));
        prods.add(new ProductoAlimenticio("Burrito", 8100.00, 22, "Comida rapida"));
        prods.add(new ProductoAlimenticio("Quesadilla", 7050.25, 38, "Comida rapida"));
        prods.add(new ProductoAlimenticio("Sándwich de Pollo", 7790.90, 41, "Comida rapida"));
        prods.add(new ProductoAlimenticio("Ensalada César", 6920.00, 15, "Saludable/Plato Principal"));
        prods.add(new ProductoAlimenticio("Helado", 3550.00, 78, "Postre"));
        prods.add(new ProductoAlimenticio("Malteada", 4780.25, 65, "Bebida/Postre"));
        prods.add(new ProductoAlimenticio("Gaseosa", 2690.99, 110, "Bebida"));
        prods.add(new ProductoAlimenticio("Agua Mineral", 2310.50, 95, "Bebida"));
        prods.add(new ProductoAlimenticio("Jugo de Naranja", 2950.00, 80, "Bebida"));
        prods.add(new ProductoAlimenticio("Café", 2440.75, 70, "Bebida Caliente"));
        prods.add(new ProductoAlimenticio("Alitas de Pollo", 9899.99, 12, "Comida rapida"));
        prods.add(new ProductoAlimenticio("Wrap", 7500.25, 29, "Comida rapida"));
        prods.add(new ProductoAlimenticio("Muffin", 3300.50, 48, "Desayuno/Merienda"));
        prods.add(new ProductoAlimenticio("Dona", 3110.00, 55, "Postre/Merienda"));
        prods.add(new ProductoElectronico("Monitor", 25450.00, 6, "Computacion", "240hz, QHD, IPS, LG"));
        prods.add(new ProductoElectronico("Teclado Mecánico", 11200.99, 15, "Perifericos", "Layout US, Switches Red, RGB"));
        prods.add(new ProductoElectronico("Mouse Inalámbrico", 7599.50, 22, "Perifericos", "16000 DPI, Ergonómico, Logitech"));
        prods.add(new ProductoElectronico("Auriculares BT", 15800.75, 18, "Audio", "Cancelación de Ruido, 30h Batería, Sony"));
        prods.add(new ProductoElectronico("Disco SSD 1TB", 19999.00, 30, "Almacenamiento", "NVMe, 3500 MB/s Lectura, Kingston"));
        prods.add(new ProductoElectronico("Smartphone", 85500.00, 10, "Moviles", "6.7 Pulgadas, 128GB, Cámara 50MP, Samsung"));
        prods.add(new ProductoElectronico("Tablet 10", 32150.25, 14, "Moviles", "4GB RAM, 64GB Almacenamiento, Android"));
        prods.add(new ProductoElectronico("Webcam FHD", 6500.45, 25, "Perifericos", "1080p, 30 FPS, Micrófono Estéreo"));
        prods.add(new ProductoElectronico("Router Wi-Fi 6", 18700.80, 11, "Redes", "Doble Banda, 1800 Mbps, 4 Antenas"));
        prods.add(new ProductoElectronico("Smart TV 55", 115999.99, 4, "Televisores", "4K UHD, HDR10+, Sistema Operativo Android"));
       return prods;
    }

    public static void agregarproducto(){
        Producto newProd;
        System.out.println("""
        Ingrese el nombre del nuevo producto: 
        1) Alimenticio
        2) Electronico
        
        """);
        int opcionAgregarProd= entrada.nextInt();

        switch (opcionAgregarProd){
            case 1 -> {
                System.out.print("Ingrese el nombre : ");
                String nombre = entrada.next();
                System.out.print("Ingrese el precio : ");
                double precio = entrada.nextDouble();
                System.out.print("Ingrese el stock: ");
                int cantStock = entrada.nextInt();
                System.out.print("Ingrese que tipo de alimento es : ");
                String tipoDeAlimento = entrada.next();
                ProductoAlimenticio nuevoProd = new ProductoAlimenticio(nombre, precio,cantStock, tipoDeAlimento);
                productosDB.add(nuevoProd);

            }
            case 2 -> {
                System.out.print("Ingrese el nombre : ");
                String nombre = entrada.nextLine();
                System.out.print("Ingrese el precio :");
                double precio = entrada.nextDouble();
                System.out.print("Ingrese el stock: ");
                int cantStock = entrada.nextInt();
                System.out.print("Ingrese de que area es (Computacion, Electrodomestico, etc)");
                String categoria = entrada.nextLine();
                System.out.print("Ingrese las caracteristicas del producto:");
                String caracteristicas = entrada.nextLine();
                ProductoElectronico nuevoProd  = new ProductoElectronico(nombre, precio,cantStock, categoria, caracteristicas);
                productosDB.add(nuevoProd);

            }
            default -> System.out.println("Opción incorrecta, intente de nuevo");

        }
        pausa();

    }

    public static void listarProductos(ArrayList<Producto> productos) {
        System.out.println("=======================================================================");
        System.out.println("                         LISTA DE PRODUCTOS                            ");
        System.out.println("=======================================================================");

        if (productos == null || productos.isEmpty()) {
            System.out.println("⚠️  No hay productos para mostrar.");
        } else {
            System.out.printf("| %-3s | %-35s | %-10s | %-10s | %n",
                    "ID", "Nombre", "Precio", "Stock");
            System.out.println("-----------------------------------------------------------------------");

            for (Producto producto : productos) {
                System.out.printf("| %3d | %-35s | $%9.2f | %-10s | %n",
                        producto.getId(),
                        producto.getNombre(),
                        producto.getPrecio(),
                        producto.getStock());

            }
        }

        System.out.println("=======================================================================");
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

    public static void buscarProductoPorNombre(ArrayList<Producto> productos){
        ArrayList<Producto> productosEncontrados = new ArrayList<>();

        System.out.println("Ingrese el producto que le gustaria buscar: ");

        String prodBusqueda= entrada.next();

        for (Producto producto : productos){
            if (EstaIncluido(producto, prodBusqueda)){
                productosEncontrados.add(producto);
            };
        }

         if (productosEncontrados.isEmpty())
             System.out.println("No se encontraron productos con este nombre");
         else
             listarProductos(productosEncontrados);
    }

    private static boolean EstaIncluido(Producto prod, String busqueda){
        String busquedaFormateada = busqueda.toLowerCase();
        String prodNombreFormateado = prod.getNombre().toLowerCase();

        return prodNombreFormateado.equals(busquedaFormateada);

    }
}