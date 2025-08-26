//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ForLoopPractice {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        //A loop must have a loop
        // Control variable
        //The loop control variable must
        // Be initialized, checked , and changed
        for (i = 1; i <= 100000000; i++) {
            System.out.println(i);
        }
    }
}