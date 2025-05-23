public class ProcesadorDeTareas {

        private ColaConPrioridadString colaPendientes;
        private PilaString pilaEnProgreso;


        public ProcesadorDeTareas() {
            colaPendientes = new ColaConPrioridadString();
            colaPendientes.Inicializar();

            pilaEnProgreso = new PilaString();
            pilaEnProgreso.InicializarPila();

        }

        public void agregarTarea(String tarea,int prioridad){
            colaPendientes.AcolarConPrioridad(tarea, prioridad);
        }

        public void comenzarTarea(){
            if (!colaPendientes.ColaVacia()){
                String tarea=colaPendientes.PrimerElemento();
                colaPendientes.Desacolar();
                pilaEnProgreso.Apilar(tarea);
            }

        }
        public void completarTarea(){
            if (!pilaEnProgreso.PilaVacia()){
                pilaEnProgreso.Desapilar();
            }
        }


        // Muestra tareas en progreso usando toString()
        public String listarTareasEnProgreso() {
            return pilaEnProgreso.toString();
        }

        // Muestra tareas pendientes con prioridad usando toString()
        public String listarTareasPendientes() {
           return colaPendientes.toString();

        }
    }


