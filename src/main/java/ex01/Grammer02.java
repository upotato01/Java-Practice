package ex01;

public class Grammer02 {
    public static void main(String[] args) {
        String myString = "apple";
        char[] myChars = myString.toCharArray();

        for (int i=0; i<myChars.length; i++){
            System.out.println(myChars[i]);
        }

/* [결과]
            a
            p
            p
            l
            e
*/
    }
}
