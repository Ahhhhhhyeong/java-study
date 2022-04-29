package chapter04;

import java.util.IllegalFormatWidthException;
import java.util.Objects;

public class Rect {
	private int width;
	private int hight;
	
	public Rect(int width, int hight) {
		this.width = width;
		this.hight = hight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hight, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rect other = (Rect) obj;
		return hight == other.hight && width == other.width;
	}
}
