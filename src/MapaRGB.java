
public class MapaRGB extends Mapa {
	
	private PixelRGB [][] mapa;
	
	public MapaRGB(int qtdlinhas, int qtdcolunas) {
		this.setMapa(new PixelRGB[qtdlinhas][qtdcolunas]);
	}

	public PixelRGB [][] getMapa() {
		return mapa;
	}

	public void setMapa(PixelRGB [][] mapa) {
		this.mapa = mapa;
	}
	
}
