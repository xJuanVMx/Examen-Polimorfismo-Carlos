class PlatoComida extends ItemMenu {

    private boolean esVegetariano; 

     public PlatoComida (String id, String nombre, double precio, boolean esVegetariano) {
        super(id, nombre, precio);

         this.esVegetariano = esVegetariano;
    }

  public boolean esVegetariano(){
    return esVegetariano;
  }
 public void setesVegetariano (boolean esVegetariano){
     this.esVegetariano = esVegetariano;
 }

 @Override
 public void  obtenerDetalles(){
   
     System.out.println("ID: " + id + "Nombre: " + nombre + "Precio " + precio );
        super.obtenerDetalles();
        System.out.println("Tipo: vegetariano");

 }

}