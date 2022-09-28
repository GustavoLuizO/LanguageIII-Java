package Context;

import Strategy.Huffman;

public class Audio extends File {
	private String Codec;
	
	public Audio(int size, String codec, String duration) {
		super(size, new Huffman());
		Codec = codec;
		Duration = duration;
	}
	private String Duration;
	
	public String getCodec() {
		return Codec;
	}
	public void setCodec(String codec) {
		Codec = codec;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
}
