public class ReservasVuelos {
    private ColaStringTDA solicitudes;
    private DiccionarioSimpleStringTDA reservas;

    public ReservasVuelos() {
        solicitudes = new ColaString();
        solicitudes.InicializarCola();

        reservas = new DiccionarioSimpleString();
        reservas.InicializarDiccionario();
    }

    public void solicitarReserva(String vuelo, int asiento) {
        String solicitud = vuelo + "-" + asiento;
        solicitudes.Acolar(solicitud);
    }

    public void confirmarReserva(String vuelo, int asiento) {
        String clave = vuelo;
        String asientoStr = String.valueOf(asiento);

        if (reservas.Claves(clave)) {
            String actuales = reservas.Recuperar(clave);
            if (!estaAsientoIncluido(actuales, asientoStr)) {
                reservas.Agregar(clave, actuales + "," + asientoStr);
            }
        } else {
            reservas.Agregar(clave, asientoStr);
        }
    }

    public String[] listarReservasActivas(String vuelo) {
        if (!reservas.Claves(vuelo)){
            return new String[0];
        }
        String datos = reservas.Recuperar(vuelo);
        return datos.split(",");
    }

    // Auxiliar para evitar asientos duplicados
    private boolean estaAsientoIncluido(String lista, String asiento) {
        String[] asientos = lista.split(",");
        for (String a : asientos) {
            if (a.equals(asiento)) return true;
        }
        return false;
    }

    public String listarSolicitudes() {
        return solicitudes.toString();
    }

    public String listarReservas() {
        return reservas.toString();
    }
}
