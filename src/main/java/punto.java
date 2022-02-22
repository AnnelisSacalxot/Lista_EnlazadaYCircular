/* Esta clase nos va ayudar con el nodo de las listas*/

public class punto {

    int dato;
   punto siguiente;
   punto anterior;

   //creando nuestros metodos setters and getters

    public punto getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(punto siguiente){
            this.siguiente = siguiente;
    }

    public punto getAnterior(){
        return anterior;
    }

    public void setAnterior(Object o){
        this.anterior = anterior;
    }

    public int getDato(){
        return dato;
    }

    public void setDato(){
        this.dato = dato;
    }
}
