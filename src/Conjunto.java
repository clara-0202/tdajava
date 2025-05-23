/*Estrategia para implementar conjuntos
Se definirá un arreglo a que contendrá los elementos del conjunto. Una variable entera indicará la cantidad de posiciones utilizadas en el arreglo,
que coincidirá con la cantidad de elementos del conjunto. La llamaremos cant. Como en un conjunto no puede haber repeticiones,
antes de agregar un nuevo elemento debemos asegurarnos de que no esté ya en él. Como no importa el orden, lo colocaremos en la primera
posición disponible (el índice al que apunta cant). Para determinar pertenencia de un elemento dado al conjunto es necesario recorrerlo
enteramente, pues el arreglo a está desordenado. Para eliminar un elemento, se lo sobreescribe con el último elemento
el arreglo (posición cant-1) y se decrementa posteriormente cant.
 */

public class Conjunto implements ConjuntoTDA{
     int[] elementos;
     int cantidad;

    public void InicializarConjunto(){
        elementos= new int[100];
        cantidad=0;
    }

   public void Agregar(int x){
        if ((!Pertenece(x))){
            elementos[cantidad]=x;
            cantidad++;
        }
    }

    //[2,3,4] cantidad 3 x=3
    public void Eliminar(int x){
        int i = 0;
        while (i < cantidad && elementos[i] != x) {
            i++;
        }
        if (i < cantidad) {
            elementos[i] = elementos[cantidad - 1];//Lo reemplaza con el último elemento del conjunto (en elementos[cantidad - 1]).
            cantidad--;
        }
    }

    public int Elegir(){
        return elementos[cantidad-1];
    }


    public boolean Pertenece(int x) {
        for (int i = 0; i < cantidad; i++) {
            if (elementos[i] == x) {
                return true;
            }
        }
        return false;
    }

    public boolean ConjuntoVacio(){
        return (cantidad==0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conjunto: {");
        for (int i = 0; i < cantidad; i++) {
            sb.append(elementos[i]);
            if (i < cantidad - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }


}

