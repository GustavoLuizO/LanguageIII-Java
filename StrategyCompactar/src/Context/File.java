package Context;

import Strategy.ITipoCompactacao;

public class File {
	private int Size;
	public int getSize() {
		return Size;
	}

	public void setSize(int size) {
		Size = size;
	}

	public ITipoCompactacao getTC() {
		return TC;
	}

	public void setTC(ITipoCompactacao tC) {
		TC = tC;
	}

	private ITipoCompactacao TC;
	
	public File(int size, ITipoCompactacao tC) {
		super();
		Size = size;
		TC = tC;
	}
	
	public void Compactar() {
		TC.Compactar();
	}
}
