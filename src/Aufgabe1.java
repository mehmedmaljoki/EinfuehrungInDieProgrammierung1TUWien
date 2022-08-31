/*
    Aufgabe 1) Codeanalyse, Codingstyle und Methoden
*/
public class Aufgabe1 {

    // nimmt den String und sortiert nach der Reihnfolge
    // Zuerst die a's, dann die b's usw...
    private static String f0(String s) {
        int xednI = 0;
        String sCopy = s;
        while (xednI < getStringLength(sCopy)) {
            if (xednI == 0 || isFirstCharGreaterEqualsThenSecond(sCopy.charAt(xednI), sCopy.charAt(xednI - 1))) {
                xednI = addiere(xednI, 1);
            } else {
                sCopy = takeSubstring(sCopy, 0, xednI - 1) +
                            sCopy.charAt(xednI) + sCopy.charAt(xednI - 1) +
                        takeSubstring(sCopy, xednI + 1, getStringLength(sCopy));
                xednI = addiere(xednI, -1);
            }
        }
        return sCopy;
    }

    private static int getStringLength(String s) {
        return s.length();
    }

    private static int addiere(int n, int s) {
        return n + s;
    }

    private static boolean isFirstCharGreaterEqualsThenSecond(char c1, char c2) {
        return c1 >= c2;
    }

    private static String takeSubstring(String s, int n1, int n2) {
        return s.substring(n1, n2);
    }

    public static void main(String args[]) {

        System.out.println(f0("ab"));
        System.out.println(f0("ba"));
        System.out.println(f0("aa"));
        System.out.println(f0("cba"));
        System.out.println(f0("abababab"));
        System.out.println(f0("abcfghed"));
        System.out.println(f0("abnasnasab"));
        System.out.println(f0("najskaghkkjsfvjhbavbdfsan"));
        System.out.println(f0("jgbgdsjabkjdbvbdjabkjsavbkjbdsvkjbagfgafjdbv"));

        assert (f0("ab").equals("ab"));
        assert (f0("ba").equals("ab"));
        assert (f0("aa").equals("aa"));
        assert (f0("cba").equals("abc"));
        assert (f0("abababab").equals("aaaabbbb"));
        assert (f0("abcfghed").equals("abcdefgh"));
        assert (f0("abnasnasab").equals("aaaabbnnss"));
        assert (f0("najskaghkkjsfvjhbavbdfsan").equals("aaaabbdffghhjjjkkknnsssvv"));
        assert (f0("jgbgdsjabkjdbvbdjabkjsavbkjbdsvkjbagfgafjdbv").equals("aaaaabbbbbbbbbdddddffggggjjjjjjjjkkkksssvvvv"));
    }
}


