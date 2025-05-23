public class DiccionarioSimpleString implements DiccionarioSimpleStringTDA {
    String[] claves;
    String[] valores;
    int cantidad;

    public void InicializarDiccionario() {
        claves = new String[100];
        valores = new String[100];
        cantidad = 0;
    }

    public void Agregar(String clave, String valor) {
        int i = Clave2Indice(clave);

        if (i == -1) {
            claves[cantidad] = clave;
            valores[cantidad] = valor;
            cantidad++;
        } else {
            valores[i] = valor; // reemplaza valor existente
        }
    }

    public void Eliminar(String clave) {
        int i = Clave2Indice(clave);

        if (i != -1) {
            claves[i] = claves[cantidad - 1];
            valores[i] = valores[cantidad - 1];
            cantidad--;
        }
    }

    public String Recuperar(String clave) {
        int i = Clave2Indice(clave);
        if (i != -1) {
            return valores[i];
        }
        return null;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (int i = 0; i < cantidad; i++) {
            sb.append("  ").append(claves[i]).append(": ").append(valores[i]).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
