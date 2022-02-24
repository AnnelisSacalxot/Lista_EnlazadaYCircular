public class metodos {

    private punto primero;
    private punto ultimo;

    //constructor
    public metodos(){
    primero = null;
    ultimo = null;
    }

    //metodos para la manipulacion de los datos

    public void buscar(String dato){
        punto actual = new punto();
        actual = ultimo;
        boolean encontrado = false;

        do {
            if (actual.getDato() == dato){
                encontrado = true;
            }

            actual = actual.anterior;
        } while (actual != ultimo);

        //mostrar resultado
        if (encontrado == true){
            System.out.println("Dato encontrado");
        } else {
            System.out.println("Dato no encontrado");
        }
    }

    public void eliminar(String dato){
        punto actual = null;
        punto tmp = null;

        //recursividad en el ciclo doblemente enlazado
        do {
            //si eliminamos el primero
            if (actual.getDato() == dato){
                if(actual == primero){
                    //eliminando el primero valor
                    actual = primero;
                    primero = actual.getSiguiente();
                    ultimo.siguiente = primero;
                    if (primero == null){
                        //por si la lista solo tiene un valor
                        ultimo = null;
                    } else{
                        primero.setAnterior(null);
                    }
                } else if (ultimo.getDato() == dato){
                    //si queremos eliminar el ultimo
                    actual = ultimo;
                    ultimo = actual.getAnterior();
                    ultimo.setSiguiente(null);
                } else{ //eliminando un numero de en medio
                    tmp = primero;
                    actual = primero.getSiguiente();

                    while (actual != null){
                        if (actual.getDato() == dato){
                            tmp.setSiguiente(actual.getSiguiente());
                            actual.getSiguiente().setAnterior(tmp);
                            break;
                        }
                        tmp = actual;
                        actual = actual.getSiguiente();
                    }
                }
            }
        } while(actual != primero);
    }

    public void agregarInicio(String dato){
        punto nuevo = new punto();
        nuevo.dato = dato;

        try {
            //verificamos los datos
            if (primero == null) {
                primero = nuevo;
                primero.siguiente = primero;
                nuevo.anterior = ultimo;
                ultimo = nuevo;
            } else {
                ultimo.siguiente = nuevo;
                nuevo.siguiente = primero;
                nuevo.anterior = ultimo;
                ultimo = nuevo;
                primero.anterior = ultimo;

            }
        } catch (Exception e){
            System.out.println("Manejando los errores de manera correcta");
        }
    }

    public void agregarFinal(String dato){
        punto nuevo = new punto();
        nuevo.dato = dato;

        try {
            //verificamos los datos
            if (ultimo == null) {
                ultimo = nuevo;
                ultimo.anterior = ultimo;
                nuevo.siguiente = primero;
                primero = nuevo;
            } else {
                primero.anterior = nuevo;
                nuevo.anterior = ultimo;
                nuevo.siguiente = primero;
                primero = nuevo;
                ultimo.siguiente = primero;

            }
        } catch (Exception e){
            System.out.println("Manejando los errores de manera correcta");
        }
    }

    public void imprimirAscendente(){
        punto actual = new punto();
        actual = primero;

        do {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        } while (actual != primero);
    }

    public void imrpimirDescentente(){
        punto actual = new punto();
        actual = ultimo;

        do {
            System.out.println(actual.dato);
            actual = actual.anterior;
        } while (actual != ultimo);

    }
}
