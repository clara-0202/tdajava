public interface ConjuntoTDA{
    void Agregar(int x);//agrega un elemento al conjunto
    void Eliminar(int x);// elimina un elemento del conjunto
    void InicializarConjunto();//inicializa la estructura del conjunto
    int Elegir(); //devuelve un elemento arbitrario de un conjunto no vacio
    boolean Pertenece(int x);// nos dice si un elemento pertenece al conjunto
    boolean ConjuntoVacio();// si esta vacio o no
}
