
public class Demo {
	public static void main(String[] args) {
		Imagen imagen = new ImagenProxy("test1.jpg");

	    //la imagen ser� cargada desde el disco
	    imagen.display(); 
	    System.out.println("");
	      
	    //la imagen no ser� cargada desde el disco
	    imagen.display(); 	
	}
}
