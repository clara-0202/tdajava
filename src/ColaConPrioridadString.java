public class ColaConPrioridadString implements ColaConPrioridadStringTDA {

    String[] elementos;
    int[] prioridades;
    int indice;



    @Override
    public void AcolarConPrioridad(String x, int prioridad) {
        int j=indice;
        while (j>0 && prioridades[j-1]>prioridad){
            elementos[j]=elementos[j-1];
            prioridades[j]=prioridades[j-1];
            j--;
        }
        elementos[j]=x;
        prioridades[j]=prioridad;
        indice++;

    }

    @Override
    public void Desacolar() {
        indice--;
    }

    @Override
    public void Inicializar() {
        elementos=new String[100];
        prioridades=new int[100];
        indice=0;
    }

    @Override
    public String PrimerElemento() {
        return elementos[indice-1];
    }

    @Override
    public int Prioridad() {
        return prioridades[indice-1];
    }

    @Override
    public boolean ColaVacia() {
        return indice==0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Cola con Prioridad: [");
        for (int i = 0; i < indice; i++) {
            sb.append(elementos[i]).append(" (").append(prioridades[i]).append(")");
            if (i > 0) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
