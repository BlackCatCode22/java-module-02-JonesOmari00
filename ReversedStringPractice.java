//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ReversedStringPractice {
    public static void main(String[] args) {
                String str = "I am a programmer";

                // Option 1: Using StringBuilder
                String reversed = new StringBuilder(str).reverse().toString();
                System.out.println("Reversed: " + reversed);

                // Option 2: Manual method (loop)
                String manualReverse = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    manualReverse += str.charAt(i);
                }
                System.out.println("Manually Reversed: " + manualReverse);
            }
        }

    