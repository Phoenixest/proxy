
public class ImagenReal implements Imagen{
	private String nombre;

	   public ImagenReal(String nombre){
	      this.nombre = nombre;
	      cargar(nombre);
	   }

	   @Override
	   public void display() {
	      System.out.println("Mostrando " + nombre);
	   }

	   private void cargar(String nombre){
	      System.out.println("Cargando " + nombre);
	   }
}
