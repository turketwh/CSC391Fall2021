import java.util.regex.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<String>();

        // add your words here to the wordList ArrayList


        String regularExpression = "(0|1)*(2|3)00*2";

        Pattern p = Pattern.compile(regularExpression);
        for (int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);
            if (p.matcher(word).matches() == true) {
                System.out.println("Word " + i + ": " + word + " is accepted (does match the regular expression)");
            }
            else {
                System.out.println("Word " + i + ": " + word + " is rejected (does not match the regular expression)");
            }
        }
    }
}
