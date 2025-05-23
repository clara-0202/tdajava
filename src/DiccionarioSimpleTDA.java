public interface DiccionarioSimpleTDA{
    void Agregar(int clave,int valor);          //dados un valor y una clave, agrega al diccionario el valor asociado a la clave.
                                                // Si ya existe la misma clave con otro valor, se sobreescribe el valor anterior con el nuevo.
    void Eliminar(int clave);                   //elimina una clave y su valor asociado. Si la clave no existe, la operación no tiene efecto.
    void InicializarDiccionario();              // inicializa la estrucutra del diccionario
    int Recuperar(int clave);                   //dada una clave definida en el diccionario, devuelve el valor asociado correspondiente.
    ConjuntoTDA Claves();                       //devuelve el conjunto de claves definidas en el diccionario.
}
