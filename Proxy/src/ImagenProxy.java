
public class ImagenProxy implements Imagen{
	private ImagenReal imagenReal;
	private String nombre;

	public ImagenProxy(String nombre){
	   this.nombre = nombre;
	}

	@Override
	public void display() {
	   if(imagenReal == null){
	      imagenReal = new ImagenReal(nombre);
	   }
	   imagenReal.display();
	}
}
