/*Estrategia 1: Se tienen un arreglo y una variable entera, que indica la cantidad de elementos de la cola. Cuando se agrega un nuevo elemento,
 se lo coloca en la posición inicial del arreglo después de haber desplazado los restantes elementos hacia la derecha. Luego de esto, la variable
  y se incrementa en uno; cuando se elimina un elemento, se decrementa la variable en uno.
 */

public class Cola implements ColaTDA {
    int[] array;
    int cantidad;

    public void IniciliazarCola() {
        array = new int[100];
        cantidad = 0;
    }

    public void Acolar(int x) {
        for (int i = cantidad - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = x;
        cantidad++;
    }

    public void Desacolar() {
        cantidad--;
    }

    public boolean ColaVacia() {
        return (cantidad == 0);
    }

    public int PrimerElemento() {
        return array[cantidad - 1];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cola: [");
        for (int i = 0; i < cantidad; i++) {
            sb.append(array[i]);
            if (i != cantidad - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }



}





// Estrategia 2: ahora el primer elemento está al principio de la cola y no al final.
/*
public class Cola implements ColaTDA {
    int[] array;
    int cantidad;

    public void InicializarCola() {
        array = new int[100];
        cantidad = 0;
    }

    public void Acolar(int x) {
        array[cantidad] = x;
        cantidad++;
    }

    public void Desacolar() {
        for (int i = 0; i <cantidad-1 ; i++) {
            array[i]=array[i+1];
        }
        cantidad--;
    }

    public boolean ColaVacia() {
        return (cantidad == 0);
    }

    public int Primero() {
        return array[0];
    }
}

//Estrategia 3: el puntero ahora está adentro del array. El resto es igual a la estrategia 1.

public class Cola implements ColaTDA {
    int[] array;


    public void InicializarCola() {
        array = new int[100];
        array[0]= 0;
    }

    public void Acolar(int x) {
        for (int i = array[0]; i >0 ; i--) {
            array[i+1]=array[i];
        }
        array[1]=x;
        array[0]++;
    }

    public void Desacolar() {
        array[0]--;
    }

    public boolean ColaVacia() {
        return (array[0] == 0);
    }

    public int Primero() {
        return array[array[0]];
    }
}
*/