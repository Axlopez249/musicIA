package iamusic;

public class Generador_cancion {
	private Generador_letra generator;
	private String cambio;
	
	
	public Generador_cancion(Generador_letra pgenerator) {
		generator = pgenerator;
		generarCancion(generator.getLetra_realizada());
	}
	
	public void generarCancion(String letra) {
		//Va creando la cancion con la letra creada
	}
	
	public void solicitarCambio(String pcambio) {
		this.cambio = pcambio;
		generator.cambiarGenero(cambio);
	}
	
	
	
	
	
}
