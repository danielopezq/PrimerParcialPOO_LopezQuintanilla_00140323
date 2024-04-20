import ArticuloElectronico.ArticuloElectronico;
import ArticuloElectronico.Celular;
import ArticuloElectronico.Laptop;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static ArrayList<ArticuloElectronico> articuloElectronico = new ArrayList<ArticuloElectronico>();
    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        Scanner sn = new Scanner(System.in);
        int bucle = 0;
        do {
            System.out.println("Bienvenido al menu principal\n");
            System.out.println("Elija una opcion:\n");
            System.out.println("1. Crear un articulo electronico\n");
            System.out.println("2. Modificar un articulo electronico\n");
            System.out.println("3. Consultar informacion\n");
            System.out.println("4. Salir\n");
            System.out.print("Opcion > ");
            int opcion = sn.nextInt();
            sn.nextLine();
            switch (opcion) {
                case 1:
                    crearAE();
                    break;
                case 2:
                    //modificarAE();
                    break;
                case 3:
                    //consultarInfo();
                    break;
                case 4:
                    System.out.println("Hasta pronto...");
                    bucle++;
            }
        }while(bucle < 1);
    }

   /*
    private static void consultarInfo() {
        Scanner sn = new Scanner(System.in);
        if(articuloElectronico == null){
            System.out.println("No hay ningun articulo electronico registrado\n");
        } else {
            System.out.println("Digite el nombre del articulo a consultar:\n");
            String nombreBuscar = sn.nextLine();
            for(int i = 0; i < articuloElectronico.size(); i++){
                if(nombreBuscar == ArticuloElectronico.getNombre()){
                    System.out.println("nombre:");
                    System.out.println("modelo:");
                    System.out.println("descripcion:");
                    System.out.println("precio:");
                }
            }
        }

    }

    private static void modificarAE() {
        Scanner sn = new Scanner(System.in);
        if(articuloElectronico == null){
            System.out.println("No hay ningun articulo electronico registrado\n");
        } else {
            System.out.println("Ingrese el nombre del articulo a modificar:\n");
            String nombreBuscar = sn.nextLine();
            for(int i = 0; i < articuloElectronico.size(); i++){
                if(nombreBuscar == ArticuloElectronico.getNombre()){
                    System.out.println("nombre:");
                    System.out.println("modelo:");
                    System.out.println("descripcion:");
                    System.out.println("precio:");
                }
            }
        }

    }
*/
    private static void crearAE() {
        Scanner sn = new Scanner(System.in);

        System.out.println("Tipo de articulo:\n");
        System.out.println("1. Celular 2. Laptop\n");
        int opcion = sn.nextInt();
        sn.nextLine();
        if(opcion == 1){
            System.out.println("Digite el nombre del celular:\n");
            String nombre = sn.nextLine();
            System.out.println("Digite el modelo del celular:\n");
            String modelo = sn.nextLine();
            System.out.println("Digite la descripcion del celular:\n");
            String descripcion = sn.nextLine();
            System.out.println("Digite el precio del celular:\n");
            double precio = sn.nextDouble();
            sn.nextLine();
            System.out.println("Digite las dimensiones del celular (dimension1xdimension2):\n");
            String dimensiones = sn.nextLine();
            System.out.println("Digite el sistema operativo del celular:\n");
            String sistemaOperativo = sn.nextLine();

            Celular celular = new Celular(nombre, modelo, descripcion, precio, dimensiones, sistemaOperativo);
            articuloElectronico.add(celular);
            System.out.println("Celular agregado exitosamente\n");
        } else if(opcion == 2){
            System.out.println("Digite el nombre de la laptop:\n");
            String nombre = sn.nextLine();
            System.out.println("Digite el modelo de la laptop\n");
            String modelo = sn.nextLine();
            System.out.println("Digite la descripcion de la laptop:\n");
            String descripcion = sn.nextLine();
            System.out.println("Digite el precio de la laptop:\n");
            double precio = sn.nextDouble();
            sn.nextLine();
            System.out.println("Digite las dimensiones de la laptop (dimension1xdimension2):\n");
            String dimensiones = sn.nextLine();
            System.out.println("Digite el sistema operativo de la laptop\n");
            String sistemaOperativo = sn.nextLine();
            System.out.println("La laptop tendra RGB? (true/false)\n");
            boolean RGB = sn.nextBoolean();

            Laptop laptop = new Laptop(nombre, modelo, descripcion, precio, dimensiones, sistemaOperativo, RGB);
            articuloElectronico.add(laptop);
        }

    }
    
    
}