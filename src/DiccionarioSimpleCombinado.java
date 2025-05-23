public class DiccionarioSimpleCombinado implements DiccionarioSimpleCombinadoTDA{
    String[] claves;
    int[] valores;
    int cantidad;


    @Override
    public void InicializarDiccionario() {
        claves=new String[100];
        valores=new int[100];
        cantidad=0;
    }

    @Override
    public void Agregar(String clave, int valor) {
        int i = Clave2Indice(clave);

        if (i == -1) {
            claves[cantidad] = clave;
            valores[cantidad] = valor;
            cantidad++;
        } else {
            valores[i] = valor; // reemplaza valor existente
        }
    }

    @Override
    public void Eliminar(String clave) {
        int i = Clave2Indice(clave);
        if (i != -1) {
            claves[i] = claves[cantidad - 1];
            valores[i] = valores[cantidad - 1];
            cantidad--;
        }

    }

    @Override
    public int Recuperar(String clave) {
        int i = Clave2Indice(clave);
        if (i != -1) {
            return valores[i];
        }
        return 0;
    }


    @Override
    public boolean Claves(String clave) {
        return Clave2Indice(clave) != -1;
    }

    private int Clave2Indice(String clave) {
        for (int i = 0; i < cantidad; i++) {
            if (claves[i].equals(clave)) {
                return i;
            }
        }
        return -1;
    }
}
