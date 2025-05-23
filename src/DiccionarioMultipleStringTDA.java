public interface DiccionarioMultipleStringTDA {
    void Agregar(String clave, String valor);
    void Eliminar(String clave);
    void InicializarDiccionario();
    void EliminarValor(String clave, String valor);
    ConjuntoStringTDA Recuperar(String clave);
    ConjuntoStringTDA Claves();
}
