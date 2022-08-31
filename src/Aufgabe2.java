/*
    Aufgabe 2) Überladen von Methoden
*/
public class Aufgabe2 {

    private static void addSeparator(String text, char separator) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        String copy = text;
        if (text.length() == 1) {
            System.out.println(text);
        } else if (text.length() > 1) {
            int i = 0;
            while (copy.length() > 0) {
                if (copy.length() == 1) {
                    System.out.print(text.charAt(i));
                    break;
                }
                System.out.print(text.charAt(i) + "" + separator);
                i++;
                copy = copy.substring(0, copy.length() - 1);
            }
            System.out.println();
        }
    }


    private static void addSeparator(int number, char separator) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
            addSeparator(Integer.toString(number), separator);
    }

    private static void addSeparator(String text, String separators) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        String sepCopy = separators;
        int i = 0;
        while (sepCopy.length() > 0) {
            char ch = separators.charAt(i);
            addSeparator(text, ch);
            i++;
            sepCopy = sepCopy.substring(0, sepCopy.length() - 1);
        }
    }

    private static void addSeparator(String text) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        addSeparator(text, '$');
    }

    public static void main(String[] args) {
        String text0 = "A";
        String text1 = "AB";
        String text2 = "Hello!";
        String text3 = "-Java-";
        String text4 = " TEST ";

        addSeparator(text0, '?');
        addSeparator(text1, ',');
        addSeparator(text2, ':');
        addSeparator(text3, '-');
        addSeparator(text4, '+');

        addSeparator(1, '$');
        addSeparator(35, '*');
        addSeparator(657, ':');
        addSeparator(2048, '#');
        addSeparator(26348, '+');

        addSeparator(text1, "+#$");
        addSeparator(text2, ":*&!");

        addSeparator(text0);
        addSeparator(text1);
        addSeparator(text2);
    }
}
