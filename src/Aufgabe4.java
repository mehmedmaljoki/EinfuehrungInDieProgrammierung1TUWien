/*
    Aufgabe 4) Rekursion
*/
// it is not allowed to use helper functions and no globale variables
public class Aufgabe4 {

	// imperative
//	private static int countCharsSmaller(String text, char value) {
//		// TODO: Implementieren Sie hier Ihre Lösung für die Methode
//		int count = 0;
//		String textCopy = text;
//		int i = 0;
//		while (textCopy.length() > 0) {
//			char ch = text.charAt(i);
//			if (ch < value) {
//				count++;
//			}
//			i++;
//			textCopy = textCopy.substring(0, textCopy.length() - 1);
//		}
//		return count;
//	}

	// rekursiv
	private static int countCharsSmaller(String text, char value) {
		if (text.length() > 0) {
			char ch = text.charAt(text.length() - 1);
			if (ch < value) {
				return 1 + countCharsSmaller(text.substring(0, text.length() - 1), value);
			} else {
				return countCharsSmaller(text.substring(0, text.length() - 1), value);
			}
		}
		return 0;
	}

	private static String removeCharsInString(String text, char start, char end) {
		// TODO: Implementieren Sie hier Ihre Lösung für die Methode
		return null; //Zeile kann geändert oder entfernt werden.
	}

	private static String shiftDigitRight(String text) {
		// TODO: Implementieren Sie hier Ihre Lösung für die Methode
		return null; //Zeile kann geändert oder entfernt werden.
	}

	public static void main(String[] args) {
		System.out.println(countCharsSmaller("DAS (ist) ]ein] Test!", (char) 100));
		System.out.println(countCharsSmaller("a!", (char) 200));
		System.out.println(countCharsSmaller("Ein Test", (char) 100));
		System.out.println();

//        System.out.println(removeCharsInString("testtrompete", 'd', 'n'));
//        System.out.println(removeCharsInString("test", 's', 'u'));
//        System.out.println(removeCharsInString("t", 't', 't'));
//        System.out.println(removeCharsInString("angabe", 'a', 'z'));
//        System.out.println();
//
//        System.out.println(shiftDigitRight("az3kj"));
//        System.out.println(shiftDigitRight("kjdn{nd8xngs+d#k"));
//        System.out.println(shiftDigitRight(""));
//        System.out.println(shiftDigitRight("4"));
//        System.out.println(shiftDigitRight("ji)oiepk(2"));
//        System.out.println(shiftDigitRight("ohneziffer"));
//
//        assert (countCharsSmaller("DAS (ist) ]eine] Test!", (char) 100) == 12);
//        assert (countCharsSmaller("a!", (char) 200) == 2);
//        assert (countCharsSmaller("Ein Test", (char) 100) == 3);
//
//        assert (removeCharsInString("testtrompete", 'd', 'n').equals("tsttropt"));
//        assert (removeCharsInString("test", 's', 'u').equals("es"));
//        assert (removeCharsInString("t", 't', 't').equals("t"));
//        assert (removeCharsInString("angabe", 'a', 'z').equals("aa"));
//
//        assert (shiftDigitRight("az3kj").equals("azkj3"));
//        assert (shiftDigitRight("kjdn{nd8xngs+d#k").equals("kjdn{ndxngs+d#k8"));
//        assert (shiftDigitRight("").equals(""));
//        assert (shiftDigitRight("4").equals("4"));
//        assert (shiftDigitRight("ji)oiepk(2").equals("ji)oiepk(2"));
//        assert (shiftDigitRight("ohneziffer").equals("ohneziffer"));
	}
}
