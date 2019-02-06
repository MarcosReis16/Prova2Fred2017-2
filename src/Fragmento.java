
public class Fragmento extends Mapa {

	private Pixel[][] mapa;
	
	public Fragmento(int qtdlinhas, int qtdcolunas) {
		this.setMapa(new Pixel[qtdlinhas][qtdcolunas]);
	}

	public Pixel[][] getMapa() {
		return mapa;
	}

	public void setMapa(Pixel[][] mapa) {
		this.mapa = mapa;
	}
	
	public int getQtdLinhasFragmento() {
		return mapa.length;
	}
	
	public int getQtdColunas() {
}
