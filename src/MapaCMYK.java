
public class MapaCMYK extends Mapa {
	
	private PixelCMYK[][] mapa;
	
	public MapaCMYK(int qtdlinhas, int qtdcolunas) {
		this.setMapa(new PixelCMYK[qtdlinhas][qtdcolunas]);
	}

	public PixelCMYK[][] getMapa() {
		return mapa;
	}

	public void setMapa(PixelCMYK[][] mapa) {
		this.mapa = mapa;
	}

}
