package iamusic;

public class Main {
	public static void main(String [] args) {
		//Se crea para generar la letra
		Generador_letra generador_letra = new Generador_letra("el amor de mi vida no me contesta los mensajes de whatsapp", "Rock", "Feliz");
		
		//Se crea para generar la cancion con la letra
		Generador_cancion generador_cancion = new Generador_cancion(generador_letra);
		
		//Si se desea realizar un cambio de genero
		generador_letra.cambiarGenero("salsa");
		
		//si se desea realizar un cambio de tipo de letra como triste a feliz
		generador_letra.cambiarTipoLetra("triste");
		
		//Para agregar genero
		generador_letra.agregarGenero("bachata");
		
	}
}
