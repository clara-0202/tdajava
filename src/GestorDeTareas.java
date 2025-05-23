public class GestorDeTareas {
    DiccionarioSimpleCombinado inventario;
    ConjuntoString productosAgotados;
    ConjuntoString productosOfertas;


    public GestorDeTareas(){
        inventario=new DiccionarioSimpleCombinado();
        inventario.InicializarDiccionario();

        productosAgotados=new ConjuntoString();
        productosAgotados.Inicializar();

        productosOfertas= new ConjuntoString();
        productosOfertas.Inicializar();
    }

    public void agregarProducto(String nombre, int cantidad){
        inventario.Agregar(nombre,cantidad);
        if (cantidad>0 && productosAgotados.Pertenece(nombre)){
            productosAgotados.Eliminar(nombre);
        }
    }

    public void agotarProducto(String nombre) {
        productosAgotados.Agregar(nombre);
    }




    public void venderProducto(String nombre, int cantidadVendida) {
        if (inventario.Claves(nombre)) {
            int cantidadActual = inventario.Recuperar(nombre);
            int nuevaCantidad = cantidadActual - cantidadVendida;
            if (nuevaCantidad <= 0) {
                inventario.Agregar(nombre, 0);
                agotarProducto(nombre);
            } else {
                inventario.Agregar(nombre, nuevaCantidad);
            }
        }
    }

    public void agregarOferta(String nombre) {
        productosOfertas.Agregar(nombre);
    }
    public String listarProductosOfertas(){
        return productosOfertas.toString();

    }
    public String listarProductosAgotados(){
        return productosAgotados.toString();

    }

}
