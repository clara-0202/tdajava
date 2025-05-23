public class PilaString implements PilaStringTDA{
    private String[] array;
    int cantidad;

    public void InicializarPila(){
        array=new String[100];
        cantidad=0;
    }

    public void Apilar(String x){
        array[cantidad]=x;
        cantidad++;
    }

    public void Desapilar(){
        cantidad--;
    }
    public String Tope(){
        return array[cantidad-1];
    }

    public boolean PilaVacia(){
        return (cantidad==0);
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
