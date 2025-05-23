public class SimuladorCPU {
    ColaString colaEntrante;
    PilaString pilaEjecucion;
    ColaConPrioridadString colaSuspendidas;

    public SimuladorCPU(){
        colaEntrante=new ColaString();
        colaEntrante.InicializarCola();

        pilaEjecucion=new PilaString();
        pilaEjecucion.InicializarPila();

        colaSuspendidas=new ColaConPrioridadString();
        colaSuspendidas.Inicializar();
    }

    public void agregarProceso(String proceso){
        colaEntrante.Acolar(proceso);
    }
    public void ejecutarProceso(){
        if (!colaEntrante.ColaVacia()) {
            String proceso = colaEntrante.PrimerElemento();
            colaEntrante.Desacolar();
            pilaEjecucion.Apilar(proceso);
        }
    }

    public void suspenderProceso(int prioridad){
        if (!pilaEjecucion.PilaVacia()) {
            String proceso = pilaEjecucion.Tope();
            pilaEjecucion.Desapilar();
            colaSuspendidas.AcolarConPrioridad(proceso, prioridad);
        }
    }
    public String listarProcesosEnEjecucion(){
        return pilaEjecucion.toString();
    }
	public String listarProcesosSuspendidos(){
        return colaSuspendidas.toString();
    }


}
