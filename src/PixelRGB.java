
public class PixelRGB {
	
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 250;
	
	private int red;
	private int green;
	private int blue;
	
	public PixelRGB(int red, int green, int blue) {
		setRed(red);
		setGreen(green);
		setBlue(blue);
	}
	
	public void setRed(int red) {
		if(red>=MIN_VALUE && red<=MAX_VALUE)
			this.red = red;
	}
	
	public int getRed() {
		return this.red;
	}
	
	public void setGreen(int green) {
		if(green>=MIN_VALUE && green<=MAX_VALUE)
			this.green  = green;
	}
	
	public int getGreen() {
		return this.green;
	}
	
	public void setBlue(int blue) {
		if(blue>=MIN_VALUE && blue<=MAX_VALUE)
			this.blue = blue;
	}
	
	public int getBlue() {
		return this.blue;
	}
	
	public static int luminosidade(PixelRGB pixel) {
		
		return (int)(pixel.getRed()*0.3 + pixel.getGreen()*0.59 + pixel.getBlue()*0.11);
		
	}
	
	public boolean verificaPixelSimilar(PixelRGB pixel) {
		
		return this.getGreen() == pixel.getGreen() &&
				this.getBlue() == pixel.getBlue() &&
				this.getRed() == pixel.getRed();
	}
}
