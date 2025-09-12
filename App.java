//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {

        Student myStudent = new Student();
        myStudent.firstname = "Omari";
        myStudent.lastname = "Jones";
        myStudent.age = 22;
        myStudent.major = "Java";
        myStudent.gpa = 3.5;
        myStudent.onProbation = false;

        System.out.println(myStudent.firstname);
        System.out.println(myStudent.lastname);
        System.out.println(myStudent.age);
        System.out.println(myStudent.major);
        System.out.println(myStudent.gpa);
        System.out.println(myStudent.onProbation);

        Student myStudent2 = new Student();
        myStudent2.firstname = "Clark";
        myStudent2.lastname = "Kent";
        myStudent2.age = 27;
        myStudent2.major = "Python";
        myStudent2.gpa = 2.5;
        myStudent2.onProbation = true;

        System.out.println(myStudent2.firstname);
        System.out.println(myStudent2.lastname);
        System.out.println(myStudent2.age);
        System.out.println(myStudent2.major);
        System.out.println(myStudent2.gpa);
        System.out.println(myStudent2.onProbation);

        Backpack myBackpack = new Backpack();

        myBackpack.name = "RabbitHole";
        myBackpack.color = "black";
        myBackpack.inches = 24;
        myBackpack.shape = "rectangle/Oval";
        myBackpack.isAffordable = true;
        System.out.println(myBackpack.name);
        System.out.println(myBackpack.color);
        System.out.println(myBackpack.inches);
        System.out.println(myBackpack.shape);
        System.out.println(myBackpack.isAffordable);



















    }
}