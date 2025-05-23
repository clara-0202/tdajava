public class GestorAsistencia {
    private DiccionarioMultipleStringTDA asistencia;
    private ConjuntoStringTDA destacados;
    private ConjuntoStringTDA incompletos;

    public GestorAsistencia() {
        asistencia = new DiccionarioMultipleString();
        asistencia.InicializarDiccionario();

        destacados = new ConjuntoString();
        destacados.Inicializar();

        incompletos = new ConjuntoString();
        incompletos.Inicializar();
    }

    // Registra una fecha de asistencia para un estudiante
    public void registrarAsistencia(String estudiante, String fecha) {
        asistencia.Agregar(estudiante, fecha);
    }

    // Marca un estudiante como destacado
    public void marcarEstudianteDestacado(String estudiante) {
        destacados.Agregar(estudiante);
    }

    // Lista todos los estudiantes destacados
    // Marca un estudiante como con asistencia incompleta
    public void marcarEstudianteIncompleto(String estudiante) {
        incompletos.Agregar(estudiante);
    }

    public String listarEstudiantesDestacados() {
        return destacados.toString();
    }

    // Lista los estudiantes con asistencia incompleta
    public String listarEstudiantesIncompletos() {
        return incompletos.toString();
    }


}
