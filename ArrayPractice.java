//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayPractice {
    public static void main(String[] args) {
                // Declare array of sports as final (constant reference)
                final String[] SPORTS = {"Basketball", "Football", "Soccer", "Tennis", "Boxing", "Nascar"};

                // Print the array
                System.out.println("List of Sports:");
                for (int i = 0; i < SPORTS.length; i++) {
                    System.out.println((i + 1) + ". " + SPORTS[i]);
                }
            }
        }
        