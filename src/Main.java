import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        // =========================
        //         COLA
        // =========================

        Cola cola = new Cola();
        cola.IniciliazarCola();
        System.out.println("Cola inicializada:");
        System.out.println("  Está vacía? " + cola.ColaVacia());
        cola.Acolar(4);
        cola.Acolar(2);
        cola.Acolar(8);
        System.out.println("  Después de acolar 4, 2, 8:");
        System.out.println("  Primer Elemento : " + cola.PrimerElemento());
        System.out.println("  Cantidad: " + cola.cantidad);
        System.out.println(cola);
        cola.Desacolar();
        System.out.println("  Después de desacolar:");
        System.out.println("  Primer " +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "Elemento: " + cola.PrimerElemento());
        System.out.println("  Cantidad: " + cola.cantidad);
        System.out.println(cola);

        // =========================
        //         PILA
        // =========================
        Pila pila = new Pila();
        pila.InicializarPila();
        System.out.println("\nPila inicializada:");
        System.out.println("  Está vacía? " + pila.PilaVacia());
        pila.Apilar(4);
        pila.Apilar(5);
        pila.Apilar(7);
        pila.Apilar(12);
        System.out.println("  Después de apilar 4, 5, 7, 12:");
        System.out.println("  Tope: " + pila.Tope());
        System.out.println("  Cantidad: " + pila.cantidad);
        System.out.println(pila);
        pila.Desapilar();
        System.out.println("  Después de desapilar:");
        System.out.println("  Nuevo tope: " + pila.Tope());
        System.out.println("  Cantidad: " + pila.cantidad);
        System.out.println(pila);

        // =========================
        //   COLA CON PRIORIDAD
        // =========================
        ColaConPrioridad ccp = new ColaConPrioridad();
        ccp.InicializarCola();
        System.out.println("\nCola con prioridad inicializada:");
        System.out.println("  Está vacía? " + ccp.ColaVacia());
        ccp.AcolarConPrioridad(8, 2);
        ccp.AcolarConPrioridad(5, 3);
        ccp.AcolarConPrioridad(6, 1);
        System.out.println("  Después de acolar con prioridad (8,2), (5,3), (6,1):");
        System.out.println("  Elemento con mayor prioridad: " + ccp.PrimerElemento());
        System.out.println("  Prioridad: " + ccp.Prioridad());
        System.out.println(ccp);
        ccp.Desacolar();
        System.out.println("  Después de desacolar:");
        System.out.println("  Nuevo primer elemento: " + ccp.PrimerElemento());
        System.out.println(ccp);

        // =========================
        //        CONJUNTO
        // =========================
        Conjunto conjunto = new Conjunto();
        conjunto.InicializarConjunto();
        System.out.println("\nConjunto inicializado:");
        System.out.println("  Está vacío? " + conjunto.ConjuntoVacio());
        conjunto.Agregar(4);
        conjunto.Agregar(6);
        conjunto.Agregar(7);
        conjunto.Agregar(8);
        System.out.println("  Después de agregar 4, 6, 7, 8:");
        System.out.println(conjunto);
        System.out.println("  Pertenece 4? " + conjunto.Pertenece(4));
        System.out.println("  Pertenece 3? " + conjunto.Pertenece(3));
        conjunto.Eliminar(7);
        conjunto.Eliminar(3); // no hace nada
        System.out.println("  Después de eliminar 7 y 3:");
        System.out.println(conjunto);
        System.out.println("  Cantidad: " + conjunto.cantidad);

        // =========================
        //   DICCIONARIO SIMPLE
        // =========================
        DiccionarioSimple dicSimple = new DiccionarioSimple();
        dicSimple.InicializarDiccionario();
        dicSimple.Agregar(3, 8);
        dicSimple.Agregar(5, 4);
        dicSimple.Agregar(1, 7);
        dicSimple.Agregar(8, 5);
        System.out.println("\nDiccionario simple después de agregar (3→8), (5→4), (1→7), (8→5):");
        System.out.println(dicSimple);
        dicSimple.Eliminar(5);
        System.out.println("  Después de eliminar clave 5:");
        System.out.println(dicSimple);
        System.out.println("  Claves actuales:");
        System.out.println(dicSimple.Claves());
        System.out.println("  Valor asociado a clave 8: " + dicSimple.Recuperar(8));

        // =========================
        //  DICCIONARIO MÚLTIPLE
        // =========================
        DiccionarioMultipleTDA dicMultiple = new DiccionarioMultiple();
        dicMultiple.InicializarDiccionario();

        dicMultiple.Agregar(1, 10);
        dicMultiple.Agregar(1, 20);
        dicMultiple.Agregar(1, 30);
        dicMultiple.Agregar(2, 100);
        dicMultiple.Agregar(2, 200);
        dicMultiple.Agregar(3, 999);

        System.out.println("\nDiccionario múltiple después de agregar valores:");
        System.out.println(dicMultiple);

        dicMultiple.EliminarValor(1, 20);
        System.out.println("  Después de eliminar valor 20 de clave 1:");
        System.out.println(dicMultiple);

        dicMultiple.Eliminar(3);
        System.out.println("  Después de eliminar clave 3:");
        System.out.println(dicMultiple);

        dicMultiple.EliminarValor(1, 10);
        dicMultiple.EliminarValor(1, 30);
        System.out.println("  Después de eliminar todos los valores de clave 1:");
        System.out.println(dicMultiple);

        // =========================
        //  gestor de biblioteca
        // =========================

        GestorBiobloteca biblioteca= new GestorBiobloteca();
        System.out.println(biblioteca.listaLibrosPordevolver());
        System.out.println(biblioteca.listaLibrosPrestados());
        
        biblioteca.prestarLibro("maravilla");
        biblioteca.prestarLibro("cenicienta");
        biblioteca.prestarLibro("pastores");
        System.out.println(biblioteca.listaLibrosPrestados());
        biblioteca.devolverLibro();
        biblioteca.devolverLibro();

        System.out.println(biblioteca.listaLibrosPordevolver());
        System.out.println(biblioteca.listaLibrosPrestados());

        // =========================
        //  procesador de tareas
        // =========================

        ProcesadorDeTareas procesador = new ProcesadorDeTareas();
        procesador.agregarTarea(3); // tarea 1
        procesador.agregarTarea(5); // tarea 2
        procesador.agregarTarea(2); // tarea 3

        procesador.listarTareasPendientes();

        procesador.comenzarTarea(); // tarea 2
        procesador.comenzarTarea(); // tarea 1

        procesador.listarTareasEnProgreso();
        procesador.listarTareasPendientes();

        procesador.completarTarea(); // tarea 1
        procesador.listarTareasEnProgreso();
        procesador.comenzarTarea();
        procesador.listarTareasPendientes();

        // =========================
        //  cola string
        // =========================

        ColaString cola2 = new ColaString();
        cola2.InicializarCola();

        System.out.println("¿Cola vacía?: " + cola2.ColaVacia());

        cola2.Acolar("Tarea 1");
        cola2.Acolar("Tarea 2");
        cola2.Acolar("Tarea 3");

        System.out.println("Contenido de la cola después de acolar:");
        System.out.println(cola2);  // Usa el toString

        System.out.println("Primer elemento (más antiguo): " + cola2.PrimerElemento());

        cola2.Desacolar();
        System.out.println("Contenido después de desacolar:");
        System.out.println(cola2);

        cola2.Acolar("Tarea 4");
        System.out.println("Contenido después de acolar 'Tarea 4':");
        System.out.println(cola2);


        // =========================
        //  pila string
        // =========================

        PilaString pilastring = new PilaString();
        pilastring.InicializarPila();
        System.out.println(pilastring.PilaVacia());

        pilastring.Apilar("HOLA");
        pilastring.Apilar("fhdjs");
        pilastring.Apilar("jkndk");
        pilastring.Apilar("lolok");
        System.out.println(pilastring.Tope());
        System.out.println(pilastring);
        pilastring.Desapilar();
        pilastring.Desapilar();
        System.out.println(pilastring);
        System.out.println(pilastring.Tope());


         // =========================
        //  cola con prioridad string
        // =========================

        ColaConPrioridadString cola = new ColaConPrioridadString();
        cola.Inicializar();

        // Verificamos que la cola esté vacía
        System.out.println("¿Cola vacía? " + cola.ColaVacia()); // true

        // Acolamos varias tareas con distintas prioridades
        cola.AcolarConPrioridad("Tarea A", 3);
        cola.AcolarConPrioridad("Tarea B", 1);
        cola.AcolarConPrioridad("Tarea C", 5);
        cola.AcolarConPrioridad("Tarea D", 2);

        // Imprimimos el estado de la cola (ahora en orden natural de inserción interna)
        System.out.println(cola); // [Tarea B (1), Tarea D (2), Tarea A (3), Tarea C (5)]

        // Primer elemento a salir (menor prioridad numérica → mayor prioridad real)
        System.out.println("Primer elemento: " + cola.PrimerElemento()); // Tarea B
        System.out.println("Prioridad: " + cola.Prioridad()); // 1

        // Desacolamos el primero (Tarea B)
        cola.Desacolar();
        System.out.println("Después de Desacolar:");
        System.out.println(cola); // [Tarea D (2), Tarea A (3), Tarea C (5)]

        // Otro desacolar
        cola.Desacolar(); // Quita "Tarea D"
        System.out.println("Después de otro Desacolar:");
        System.out.println(cola); // [Tarea A (3), Tarea C (5)]

        // ¿Está vacía?
        System.out.println("¿Cola vacía? " + cola.ColaVacia()); // false



        // =========================
        //  procesador de tareas
        // =========================

                ProcesadorDeTareas pt = new ProcesadorDeTareas();

                pt.agregarTarea("Actualizar servidor", 2);
                pt.agregarTarea("Hacer backup", 1);
                pt.agregarTarea("Instalar parches", 3);

                System.out.println("Pendientes: " + pt.listarTareasPendientes());
                System.out.println("En progreso: " + pt.listarTareasEnProgreso());

                pt.comenzarTarea();
                pt.comenzarTarea();

                System.out.println("Después de comenzar dos tareas:");
                System.out.println("Pendientes: " + pt.listarTareasPendientes());
                System.out.println("En progreso: " + pt.listarTareasEnProgreso());

                pt.completarTarea();
                System.out.println("Después de completar una tarea:");
                System.out.println("En progreso: " + pt.listarTareasEnProgreso());

 */

        // =========================
        //  conjunto string
        // =========================

        ConjuntoStringTDA conjunto = new ConjuntoString();
        conjunto.Inicializar();

        conjunto.Agregar("Juan");
        conjunto.Agregar("Ana");
        conjunto.Agregar("Pedro");
        conjunto.Agregar("Ana"); // No debe duplicar

        System.out.println("Conjunto actual: " + conjunto);

        System.out.println("¿Pertenece Ana? " + conjunto.Pertenece("Ana")); // true
        System.out.println("¿Pertenece Luis? " + conjunto.Pertenece("Luis")); // false

        System.out.println("Elegir un elemento: " + conjunto.Elegir());

        conjunto.Eliminar("Pedro");
        System.out.println("Después de eliminar Pedro: " + conjunto);

        System.out.println("¿Está vacío? " + conjunto.ConjuntoVacio()); // false

        conjunto.Eliminar("Juan");
        conjunto.Eliminar("Ana");
        System.out.println("Conjunto vacío: " + conjunto);
        System.out.println("¿Está vacío ahora? " + conjunto.ConjuntoVacio()); // true

        // =========================
        //  diccionario string
        // =========================

        DiccionarioSimpleStringTDA dicc = new DiccionarioSimpleString();
        dicc.InicializarDiccionario();

        dicc.Agregar("Juan", "Presente");
        dicc.Agregar("Ana", "Ausente");
        dicc.Agregar("Pedro", "Presente");

        System.out.println("Diccionario actual:\n" + dicc);

        dicc.Agregar("Ana", "Presente"); // Actualiza valor
        System.out.println("Después de actualizar Ana:\n" + dicc);

        System.out.println("Valor de Juan: " + dicc.Recuperar("Juan")); // Presente
        System.out.println("¿Existe Luis? " + dicc.Claves("Luis")); // false

        dicc.Eliminar("Pedro");
        System.out.println("Después de eliminar Pedro:\n" + dicc);
        System.out.println("¿Existe Pedro? " + dicc.Claves("Pedro"));

        // =========================
        //  reservas vuelos
        // =========================

        ReservasVuelos sistema = new ReservasVuelos();

        sistema.solicitarReserva("AR1234", 12);
        sistema.solicitarReserva("AR1234", 14);
        sistema.solicitarReserva("LA1000", 7);

        sistema.confirmarReserva("AR1234", 12);
        sistema.confirmarReserva("AR1234", 14);
        sistema.confirmarReserva("LA1000", 7);
        sistema.confirmarReserva("LA1000", 7); // duplicado, no se repite

        System.out.println("Solicitudes: " + sistema.listarSolicitudes());
        System.out.println(Arrays.toString(sistema.listarReservasActivas("AR1234")));
        System.out.println(Arrays.toString(sistema.listarReservasActivas("LA1000")));



        // =========================
        //  GESTOR ASISETNCIA
        // =========================


        GestorAsistencia gestor = new GestorAsistencia();

        // Registrar asistencias
        gestor.registrarAsistencia("Juan", "2024-05-01");
        gestor.registrarAsistencia("Juan", "2024-05-02");
        gestor.registrarAsistencia("Ana", "2024-05-01");
        gestor.registrarAsistencia("Lucas", "2024-05-03");

        // Marcar destacados
        gestor.marcarEstudianteDestacado("Ana");
        gestor.marcarEstudianteDestacado("Juan");

        // Marcar incompletos
        gestor.marcarEstudianteIncompleto("Carlos");
        gestor.marcarEstudianteIncompleto("Lucas");

        // Mostrar resultados
        System.out.println(">>> ESTUDIANTES DESTACADOS:");
        System.out.println(gestor.listarEstudiantesDestacados());

        System.out.println(">>> ESTUDIANTES CON ASISTENCIA INCOMPLETA:");
        System.out.println(gestor.listarEstudiantesIncompletos());

    }


}
