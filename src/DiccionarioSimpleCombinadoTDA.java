public interface DiccionarioSimpleCombinadoTDA {
    void InicializarDiccionario();
    void Agregar(String clave, int valor);
    void Eliminar(String clave);
    int Recuperar(String clave);
    boolean Claves(String clave);
}
