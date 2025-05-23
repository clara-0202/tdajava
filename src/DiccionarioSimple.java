


public class DiccionarioSimple implements DiccionarioSimpleTDA {
    private int[] claves;
    private int[] valores;
    private int cantidad;

    @Override
    public void InicializarDiccionario() {
        claves = new int[100];
        valores = new int[100];
        cantidad = 0;
    }

    @Override
    public void Agregar(int clave, int valor) {
        int i = Clave2Indice(clave);

        if (i == -1) {
            claves[cantidad] = clave;
            valores[cantidad] = valor;
            cantidad++;
        } else {
            valores[i] = valor; // Reemplaza valor existente
        }
    }

    @Override
    public void Eliminar(int clave) {
        int i = Clave2Indice(clave);

        if (i != -1) {
            claves[i] = claves[cantidad - 1];     // reemplaza por el último
            valores[i] = valores[cantidad - 1];   // reemplaza por el último
            cantidad--;
        }
    }

    @Override
    public int Recuperar(int clave) {
        int i = Clave2Indice(clave);
        if (i != -1) {
            return valores[i];
        } else {
            throw new RuntimeException("La clave no existe en el diccionario");
        }
    }

    @Override
    public ConjuntoTDA Claves() {
        ConjuntoTDA c = new Conjunto();
        c.InicializarConjunto();
        for (int i = 0; i < cantidad; i++) {
            c.Agregar(claves[i]);
        }
        return c;
    }

    //Metodo auxiliar para buscar el índice de una clave
    private int Clave2Indice(int clave) {
        int i = 0;
        while (i < cantidad && claves[i] != clave) {
            i++;
        }
        return (i < cantidad) ? i : -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DiccionarioSimple: {\n");
        for (int i = 0; i < cantidad; i++) {
            sb.append("  ").append(claves[i]).append(" : ").append(valores[i]).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
