public interface DiccionarioMultipleTDA{
    void Agregar(int clave,int valor);      //permite agregar un elemento a la colección de una clave.
    void Eliminar(int clave);               //permite eliminar una clave y todos sus valores
    void InicializarDiccionario();          // inicializa la estrucutra del diccionario
    void EliminarValor(int clave,int valor);    //permite eliminar un valor individual de la colección de una clave.
                                                // En este último caso debe verificarse que la clave no haya quedado con una colección vacía. Si esto sucede, debe eliminarla.
    ConjuntoTDA Recuperar(int clave);           //devuelve el conjunto de valores de una clave.
    ConjuntoTDA Claves();                   //devuelve el conjunto de claves del diccionario
}

