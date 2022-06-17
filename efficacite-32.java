package main.java.eraser;
public class Eraser {
	public static String erase(String str) {
		StringBuilder Newmot = new StringBuilder(str);
		int size = Newmot.length();
		for (int i = 0; i < size; i++) {
			if (Newmot.charAt(i) == (char) 32 && Newmot.charAt(Math.min(i + 1, size - 2)) != (char) 32 && Newmot.charAt(Math.max(i - 1, 1)) != (char) 32) {{
					Newmot.deleteCharAt(i);
					size = Newmot.length();
				}
			}
		}
		str = Newmot.toString();
		return str;
	}
}
