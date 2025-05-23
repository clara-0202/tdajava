/*Estrategia 1: se utilizarán dos arreglos: elementos y prioridades. Los elementos de la posición i de cada arreglo corresponden al mismo registro.
 Por lo tanto, cuando un elemento ingresa y deben reacomodarse las prioridades, también deben reacomodarse en paralelo los valores.
 Una variable entera índice indicará la primera posición libre. Los elementos con la máxima prioridad quedarán en ambas estrategias en el máximo
 índice ocupado. Por lo tanto, para desacolar bastará con decrementar índice. Cuando un elemento ingresa a la cola,
  se lo debe acomodar en la posición que corresponde a su prioridad, desplazando hacia la derecha los de mayor prioridad.
 */

import java.util.Arrays;

public class ColaConPrioridad implements ColaConPrioridadTDA{
    int[] elementos;//los valores de la cola
    int[] prioridades;//
    int indice;

    public void  InicializarCola(){
        elementos=new int[100];
        prioridades=new int[100];
        indice=0;
    }

    // el 1 es mas prioritario que 10
    // como lo pienso si por ejemplo tengo [3,6,2] y entra 1 lo que hago es
    //2>1---[3 6 x 2]
    //6>1---[3 x 6 2]
    //3>1---[x,3 6 2]
    // j=0 sale del while y lo asigna en este caso porque es el mas priooritario


    public void AcolarConPrioridad(int x, int prioridad){
        int j=indice;
        while(j>0 && prioridades[j-1]>prioridad){
            elementos[j]=elementos[j-1];
            prioridades[j]=prioridades[j-1];
            j--;
        }
        elementos[j]=x;
        prioridades[j]=prioridad;
        indice++;
    }

    public void Desacolar(){
        indice--;
    }
    public boolean ColaVacia(){
        return (indice==0);
    }
    public int PrimerElemento(){
        return elementos[indice-1];
    }
    public int Prioridad(){
        return prioridades[indice-1];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColaConPrioridad: [");
        for (int i = 0; i < indice; i++) {
            sb.append("(valor=").append(elementos[i])
                    .append(", prioridad=").append(prioridades[i]).append(")");
            if (i < indice - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }

}


/*
//Estrategia 2: Igual a la primera, pero utilizando un único arreglo de objetos de tipo Elemento que tiene los atributos valor y prioridad.

public class Elemento{
    int valor;
    int prioridad;
}


public class ColaConPrioridad implements ColaConPrioridadTDA{
    paraparcial.Elemento[] elementos;
    int indice;

    public void IniciliazarCola(){
        elementos= new paraparcial.Elemento[100];
        indice=0;
    }
    public AcolarConPrioridad(int x,int prioridad){
        int j=indice;
        while(j>0 && elementos[j-1].prioridad>prioridad){
            elementos[j]=elementos[j-1];
            j--;
        }
        elementos[j]=new paraparcial.Elemento();
        elementos[j].valor=x;
        elementos[j].prioridad=prioridad;
        indice++;
    }

    public void Desacolar(){
        indice--;
    }
    public boolean ColaVacia(){
        return (indice==0);
    }
    public int PrimerElemento(){
        return elementos[indice-1].valor;
    }
    public int Prioridad(){
        return elementos[indice-1].prioridad;
    }
}*/
