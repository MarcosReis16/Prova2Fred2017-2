
public class PixelCMYK {
	
	public static final int MIN_VALUE = 0;
	public static final int MAX_VALUE = 100;
	
	private int cyan;
	private int magenta;
	private int yellow;
	private int black;
	
	public PixelCMYK(int cyan, int magenta, int yellow,int black) {
		setCyan(cyan);
		setMagenta(magenta);
		setYellow(yellow);
		setBlack(black);
	}
	
	public void setCyan(int cyan) {
		if(cyan>=MIN_VALUE && cyan<=MAX_VALUE)
			this.cyan = cyan;
	}
	
	public int getCyan() {
		return this.cyan;
	}
	
	public void setMagenta(int magenta) {
		if(magenta>=MIN_VALUE && magenta<=MAX_VALUE)
			this.magenta = magenta;
	}
	
	public int getMagenta() {
		return this.magenta;
	}
	
	public void setYellow(int yellow) {
		if(yellow>=MIN_VALUE && yellow<=MAX_VALUE)
			this.yellow = yellow;
	}
	
	public int getYellow() {
		return this.yellow;
	}
	
	public void setBlack(int black) {
		if(black>=MIN_VALUE && black<=MAX_VALUE)
			this.black = black;
	}
	
	public int getBlack() {
		return this.black;
	}
	
	public static int luminosidade(PixelCMYK pixel) {
		
		return pixel.getBlack();
	}
	
	public boolean verificaPixelSimilar(PixelCMYK pixel) {
		
		return  this.cyan == pixel.cyan &&
				this.magenta == pixel.magenta &&
				this.yellow == pixel.yellow &&
				this.black == pixel.black;
	}
	
}
