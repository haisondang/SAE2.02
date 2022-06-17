package eraser;

public class Eraser {
	
	/** Supprime les espaces simples d'une chaine de caractères
     * @param str
     * @return newString
     */
    public static String erase(String str) {
    	String newString = "";
		int lenString = str.length();
		for (int i=0; i<lenString; i++) {
			if (str.charAt(i) != ' ') {
				newString += str.charAt(i);
			} else {
				if (i==0) {
					if (str.charAt(i+1) == ' ') {
						newString += str.charAt(i);
					}
				} else if (i==lenString-1) {
					if (str.charAt(i-1) == ' ') {
						newString += str.charAt(i);
					}
				} else {
					if (str.charAt(i-1) == ' ' || str.charAt(i+1) == ' ') {
						newString += str.charAt(i);
					}
				}
			}
		}
		return newString;
    }
}
