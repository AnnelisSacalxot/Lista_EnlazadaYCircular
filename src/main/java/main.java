import java.util.Scanner;

public class main {

    public static void main(String[] args){

    //llamando mi clase metodo
    metodos met = new metodos();
    Scanner leer = new Scanner(System.in);
    int opcion= 0;
        //creando menu de las opciones
            do {
                System.out.println("Lista doblemente enlaza y circular");
                System.out.println("1. Buscar");
                System.out.println("2. Eliminar");
                System.out.println("3. Agregar dato al inicio");
                System.out.println("4. Agregar dato al final");
                System.out.println("5. Imprimir de inicio al final");
                System.out.println("6. Imprimir del final al inicio");
                System.out.println("Eliga la opción: ");
                opcion = Integer.parseInt(leer.nextLine());

                //entrando a los metodos
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese el dato a buscar: ");
                        String dato = leer.nextLine();
                        met.buscar(dato);
                        break;
                    case 2:
                        System.out.println("Ingrese el dato a eliminar: ");
                        dato = leer.nextLine();
                        met.eliminar(dato);
                        break;
                    case 3:
                        System.out.println("Ingrese el dato que desea que vaya al inicio");
                        dato = leer.nextLine();
                        met.agregarInicio(dato);
                        break;
                    case 4:
                        System.out.println("Ingrese el dato que desea que vaya al final");
                        dato = leer.nextLine();
                        met.agregarFinal(dato);
                        break;
                    case 5:
                        System.out.println("Lista:");
                        met.imprimirAscendente();
                        break;
                    case 6:
                        System.out.println("Lista:");
                        met.imrpimirDescentente();
                        break;
                    case 0:
                        break;
                }
            } while(opcion != 0);
    }
}
