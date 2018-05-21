
public class Demo {
	public static void main(String[] args) {
		Imagen imagen = new ImagenProxy("test1.jpg");

	    //la imagen será cargada desde el disco
	    imagen.display(); 
	    System.out.println("");
	      
	    //la imagen no será cargada desde el disco
	    imagen.display(); 	
	}
}
