
public class Pangram {
    public static void main(String[] args) {
        String input = "Pack my box with five dozen liquor jugs"; 
        boolean present = present(input);

        if (present) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean present(String input) {
        input = input.toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (input.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }
}
