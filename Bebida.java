class Bebida extends ItemMenu {

    private int volumenML; 

     public Bebida (String id, String nombre, double precio, int volumenML) {
        super(id, nombre, precio);

         this.volumenML = volumenML;
    }

      public int getvolumenML(){
      return volumenML;
  }

     public void setvolumenML (int volumenML){
     this.volumenML = volumenML;
 }

  @Override
 public void  obtenerDetalles(){
   
     System.out.println("ID: " + id + "Nombre: " + nombre + "Precio " + precio );
        super.obtenerDetalles();
        System.out.println("Tipo: Bebida");

 }

}