package Context;
import Strategy.Lempel_Ziv_Welch;

public class Text extends File {
	private int FontSize;

	public Text(int size, int fontSize) {
		super(size, new Lempel_Ziv_Welch());
		FontSize = fontSize;
	}

	public int getFontSize() {
		return FontSize;
	}

	public void setFontSize(int fontSize) {
		FontSize = fontSize;
	}
}
