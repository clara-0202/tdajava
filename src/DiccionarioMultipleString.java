public class DiccionarioMultipleString implements DiccionarioMultipleStringTDA {

    private class Elemento {
        String clave;
        ConjuntoStringTDA valores;
    }

    private Elemento[] elementos;
    private int cantidad;

    public void InicializarDiccionario() {
        elementos = new Elemento[100];
        cantidad = 0;
    }

    public void Agregar(String clave, String valor) {
        int pos = Clave2Indice(clave);
        if (pos == -1) {
            Elemento nuevo = new Elemento();
            nuevo.clave = clave;
            nuevo.valores = new ConjuntoString();
            nuevo.valores.Inicializar();
            nuevo.valores.Agregar(valor);
            elementos[cantidad] = nuevo;
            cantidad++;
        } else {
            elementos[pos].valores.Agregar(valor);
        }
    }

    public void Eliminar(String clave) {
        int pos = Clave2Indice(clave);
        if (pos != -1) {
            elementos[pos] = elementos[cantidad - 1];
            cantidad--;
        }
    }

    public void EliminarValor(String clave, String valor) {
        int pos = Clave2Indice(clave);
        if (pos != -1) {
            elementos[pos].valores.Eliminar(valor);
            if (elementos[pos].valores.ConjuntoVacio()) {
                Eliminar(clave);
            }
        }
    }

    public ConjuntoStringTDA Recuperar(String clave) {
        int pos = Clave2Indice(clave);
        if (pos != -1) {
            return elementos[pos].valores;
        }
        return null;
    }

    public ConjuntoStringTDA Claves() {
        ConjuntoStringTDA conjuntoClaves = new ConjuntoString();
        conjuntoClaves.Inicializar();
        for (int i = 0; i < cantidad; i++) {
            conjuntoClaves.Agregar(elementos[i].clave);
        }
        return conjuntoClaves;
    }

    private int Clave2Indice(String clave) {
        for (int i = 0; i < cantidad; i++) {
            if (elementos[i].clave.equals(clave)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DiccionarioMultipleString:\n");

        for (int i = 0; i < cantidad; i++) {
            sb.append("  Clave ").append(elementos[i].clave).append(" → Valores: [");

            ConjuntoStringTDA valores = elementos[i].valores;
            ConjuntoStringTDA aux = new ConjuntoString();
            aux.Inicializar();

            boolean primero = true;
            while (!valores.ConjuntoVacio()) {
                String val = valores.Elegir();
                if (!primero) sb.append(", ");
                sb.append(val);
                primero = false;
                aux.Agregar(val);
                valores.Eliminar(val);
            }

            elementos[i].valores = aux;

            sb.append("]\n");
        }

        return sb.toString();
    }
}
