import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        String[] passwords = new String[11];
        // These first four should be accepted
        passwords[0] = "a!z";
        passwords[1] = "b?c";
        passwords[2] = "dest1nation2!g";
        passwords[3] = "fun_f0n_18?c";
        // These last seven should be rejected
        passwords[4] = "!ab23_!z";
        passwords[5] = "ac";
        passwords[6] = "a23!";
        passwords[7] = "b0b?_great!c";
        passwords[8] = "mypassword";
        passwords[9] = "passwd!23";
        passwords[10] = "passwd!?c";

        String regularExpression = "";

        for (int i = 0; i < 11; i++) {
            if (Pattern.matches(regularExpression,passwords[i]) == true) {
                System.out.println("Password " + i + ": " + passwords[i] + " is accepted");
            }
            else {
                System.out.println("Password " + i + ": " + passwords[i] + " is rejected");
            }
        }
    }
}