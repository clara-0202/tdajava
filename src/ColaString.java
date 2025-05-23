public class ColaString implements ColaStringTDA {
    private String[] array;
    private int cantidad;

    public void InicializarCola(){
        array= new String[100];
        cantidad=0;

    }

    public void Acolar(String x){
        for (int i = cantidad-1; i >=0 ; i--) {
            array[i+1]=array[i];

        }
        array[0]=x;
        cantidad++;
    }

    public void Desacolar(){
        cantidad--;

    }

    public String PrimerElemento(){
        return array[cantidad-1];

    }

    public boolean ColaVacia(){
        return(cantidad==0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ColaString: [");
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
