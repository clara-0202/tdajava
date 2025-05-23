
// si quiero un string en vez de un entero lo planteo como [[]]


public class DiccionarioMultiple implements DiccionarioMultipleTDA {

    //clase que uso como entrada de diccionario
    private class Elemento {
        int clave;
        ConjuntoTDA valores;
    }

    private Elemento[] elementos;
    private int cantidad;

    public void InicializarDiccionario() {
        elementos = new Elemento[100];
        cantidad = 0;
    }

    public void Agregar(int clave, int valor) {
        int pos = Clave2Indice(clave); //Busca la posición de la clave en el arreglo elementos. Si no existe, devuelve -1.
        if (pos == -1) {
            Elemento nuevo = new Elemento();
            nuevo.clave = clave;
            nuevo.valores = new Conjunto();
            nuevo.valores.InicializarConjunto();
            nuevo.valores.Agregar(valor);
            elementos[cantidad] = nuevo; //Guarda ese nuevo elemento en la posición cantidad del arreglo elementos.
            cantidad++;
        } else {
            elementos[pos].valores.Agregar(valor);
        }
    }

    public void Eliminar(int clave) {
        int pos = Clave2Indice(clave);
        if (pos != -1) {
            elementos[pos] = elementos[cantidad - 1];//Sobrescribe el elemento a eliminar con el último elemento del array para evitar corrimientos.
            cantidad--;
        }
    }

    public void EliminarValor(int clave, int valor) {
        int pos = Clave2Indice(clave);
        if (pos != -1) {
            elementos[pos].valores.Eliminar(valor);//Elimina ese valor del conjunto de valores de la clave.
            if (elementos[pos].valores.ConjuntoVacio()) {
                Eliminar(clave);
            }
        }
    }

    public ConjuntoTDA Recuperar(int clave) {
        int pos = Clave2Indice(clave);
        if (pos != -1) {
            return elementos[pos].valores;
        } else {
            return null;
        }
    }

    public ConjuntoTDA Claves() {
        ConjuntoTDA conjuntoClaves = new Conjunto();//Crea un nuevo conjunto para guardar las claves.
        conjuntoClaves.InicializarConjunto();
        for (int i = 0; i < cantidad; i++) {
            conjuntoClaves.Agregar(elementos[i].clave);//Agrega cada clave al conjunto.
        }
        return conjuntoClaves;
    }
    //Metodo privado que busca una clave en el arreglo y devuelve su posición.
   private int Clave2Indice(int clave) {
        for (int i = 0; i < cantidad; i++) {
            if (elementos[i].clave == clave) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiccionarioMultiple:\n");

        for (int i = 0; i < cantidad; i++) {
            sb.append("  Clave ").append(elementos[i].clave).append(" → Valores: [");

            // Recorrer conjunto sin perder datos
            ConjuntoTDA valores = elementos[i].valores;
            ConjuntoTDA aux = new Conjunto();
            aux.InicializarConjunto();

            boolean primero = true;
            while (!valores.ConjuntoVacio()) {
                int val = valores.Elegir();
                if (!primero) {
                    sb.append(", ");
                }
                sb.append(val);
                primero = false;

                aux.Agregar(val); // guardamos el valor en el auxiliar
                valores.Eliminar(val); // lo sacamos del original
            }

            // restauramos el conjunto original
            elementos[i].valores = aux;

            sb.append("]\n");
        }

        return sb.toString();
    }

}
