public interface DiccionarioSimpleStringTDA {
    void InicializarDiccionario();
    void Agregar(String clave, String valor);
    void Eliminar(String clave);
    String Recuperar(String clave);
    boolean Claves(String clave);
}