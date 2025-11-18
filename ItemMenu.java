public class ItemMenu {
    
   private String id;
   private String nombre;
   private double precio;

     // constructor
    public ItemMenu(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    //Definimos lo metodos
    public String getid() { return id; }
    public void setid(String id) { this.id = id; }

    public String getnombre() { return nombre; }
    public void setnombre(String nombre) { this.nombre = nombre; }

    public double getprecio() { return precio; }
    public void setprecio(double precio) { this.precio = precio; }

    public void obtenerDetalles() {
         System.out.println("ID: " + id + "Nombre: " + nombre + "Precio " + precio);
    }
}



