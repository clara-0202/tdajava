public interface ConjuntoStringTDA {
    void Inicializar();
    void Agregar(String x);
    void Eliminar(String x);
    boolean Pertenece(String x);
    boolean ConjuntoVacio();
    String Elegir();
}
