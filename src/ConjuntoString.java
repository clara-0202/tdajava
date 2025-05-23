public class ConjuntoString implements ConjuntoStringTDA {
    String[] elementos;
    int cantidad;

    public void Inicializar() {
        elementos = new String[100];
        cantidad = 0;
    }

    public void Agregar(String x) {
        if (!Pertenece(x)) {
            elementos[cantidad] = x;
            cantidad++;
        }
    }

    public void Eliminar(String x) {
        for (int i = 0; i < cantidad; i++) {
            if (elementos[i].equals(x)) {
                elementos[i] = elementos[cantidad - 1];
                cantidad--;
                break;
            }
        }
    }

    public boolean Pertenece(String x) {
        for (int i = 0; i < cantidad; i++) {
            if (elementos[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    public boolean ConjuntoVacio() {
        return cantidad == 0;
    }

    public String Elegir() {
        if (cantidad > 0) {
            return elementos[0]; // Puede ser cualquier elemento
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
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
