/*
Estrategia 1: se tienen un arreglo y una variable entera, que indica la cantidad de elementos de la pila.
Cuando se agrega un nuevo elemento, se lo coloca en la posición indicada por la variable y ésta se incrementa en uno;
cuando se lo elimina, se decrementa simplemente la variable en uno. El valor de la variable apunta a la primera posición libre del arreglo.
*/
    public class Pila implements PilaTDA {
        int[] array; // arreglo que contiene los valores
         int cantidad; // este es mi tope me marca la cantidad oque tengo en mi pila

        public void InicializarPila() {
            array= new int[100];
            cantidad=0;
        }
        public void Apilar(int x){
            array[cantidad]=x;
            cantidad++;
        }
        public void Desapilar(){
            cantidad--;
        }
        public boolean PilaVacia(){
            return (cantidad==0);
        }
        public int Tope(){
            return(array[cantidad-1]);
        }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pila: [");
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






/*Estrategia 2:Ahora el tope (variable entera) está al comienzo de la pila.
        Cuando apilo, debo desplazar todos los elementos.
*/
/*
public class Pila implements PilaTDA {
    int[] array; // arreglo que contiene los valores
    int cantidad; // este es mi tope me marca la cantidad oque tengo en mi pila

    public void InicializarPila() {
        array=new int[100];
        cantidad=0;
    }
    public void Apilar(int x){
        for (int i = 0; i <cantidad ; i++) {
            array[i+1]=array[i];
        }
        array[0]=x;
        cantidad++;
    }
    public void desapilar(){
        for (int i = 0; i <cantidad ; i++) {
            array[i]=array[i+1];
        }
        cantidad--;
    }
    public boolean PilaVacia(){
        return (cantidad==0);
    }
    public int Tope(){
        return(array[0]);
    }
}
*/
/*Estrategia 3:
El tope ahora es parte de la pila. En lo demás es igual a la estrategia 1.*/
/*
public class Pila implements PilaTDA {
    int[] array; // arreglo que contiene los valores


    public void InicializarPila() {
        array= new int[100];
        array[0]=0;
    }
    public void Apilar(int x){
        array[array[0]+1]=x;
        array[0]++;
    }
    public void desapilar(){
        array[0]--;
    }
    public boolean PilaVacia(){
        return (array[0]==0);
    }
    public int Tope(){
        return(array[array[0]]);
    }
}

*/