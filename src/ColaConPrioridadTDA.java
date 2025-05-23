public interface ColaConPrioridadTDA{
    void AcolarConPrioridad(int x,int prioridad);       // agrega un elemento a una cola
    void Desacolar();                                   //elimina el primer elemento que ingreso a la cola
    void InicializarCola();                              //inicializa la estructura de la cola
    int PrimerElemento();                                //permite conocer el primer elemento que ingreso a la cola
    boolean ColaVacia();                                //esta vacia o no
    int Prioridad();                                    //prioridad del elemento mas prioritario
}
