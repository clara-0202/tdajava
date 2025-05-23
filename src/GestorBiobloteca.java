
/* armo esta clase para organizar la logica del sistema y que se encargue de manejar
internamente la pila y la cola.

////////////////////////
//ejercicio con string
////////////////
 */


public class GestorBiobloteca {
    private PilaString pilaPrestados; // representa los libros que estan prestados actualmente
    private ColaString colaPorDevolver;// representa los libros que ya devolvieorn y deben procesarse


    public GestorBiobloteca(){
        pilaPrestados=new PilaString();
        pilaPrestados.InicializarPila();

        colaPorDevolver= new ColaString();
        colaPorDevolver.InicializarCola();
    }

    public void prestarLibro(String libro){
        pilaPrestados.Apilar(libro);
    }
    public void devolverLibro(){
        if (!pilaPrestados.PilaVacia()){
            pilaPrestados.Desapilar();
            colaPorDevolver.Acolar(pilaPrestados.Tope());
        }else {
            System.out.println("no hay libros");
        }
    }

    public String listaLibrosPrestados(){
        return pilaPrestados.toString();
    }

    public String listaLibrosPordevolver(){
       return colaPorDevolver.toString();
    }


    /*
    //////////////////////////////
    //ejercicio con int
    ////////////////////////////




//inicializo tda
    public GestorBiobloteca(){
        pilaPrestados= new Pila();
        pilaPrestados.InicializarPila();

        colaPorDevolver= new Cola();
        colaPorDevolver.IniciliazarCola();
    }

    //al prestar un libro, lo agregamos al tope de la pila
    public void prestarLibro(int libro){
        pilaPrestados.Apilar(libro);
    }

    public void devolverLibro(){
        if (!pilaPrestados.PilaVacia()){ //reviso si hay libros prestados
            int librosDevuelto = pilaPrestados.Tope();//toma el ultimo que presto
            pilaPrestados.Desapilar();// lo saca de la pila
            colaPorDevolver.Acolar(librosDevuelto);//lo pone en la cola de devoluciones
        }else {
            System.out.println("no hay libros prestados");
        }
    }

    public String listarLibrosPrestados(){
        return pilaPrestados.toString();
    }
    public String listarLibrosPorDevolver(){
        return  colaPorDevolver.toString();
    }
*/


}
