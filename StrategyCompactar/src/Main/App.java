package Main;

import Context.Audio;
import Context.File;
import Context.Image;

public class App {

	public static void main(String[] args) {
		File image = new Image(20, 10, 5);
		image.Compactar();
		
		File audio = new Audio(3, "X", "12/10/2000");
		audio.Compactar();
		
		File text = new Context.Text(2, 3);
		text.Compactar();
	}
}
