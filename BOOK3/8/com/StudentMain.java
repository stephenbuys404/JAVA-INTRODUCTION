import name.Students;

public class StudentMain {

    public static void main(String[] args) {
        Students student1 = new Students ("Ali", "Ashfaq");
        Students student2 = new Students ("Ali", "Ashfaq");
        System.out.println("Comparison 1: " + student1.compareTo(student2));

        Students student3 = new Students ("Ali", "Ashfaq");
        Students student4 = new Students ("Zoya", "Ashfaq");
        System.out.println("Comparison 2: " + student3.compareTo(student4));

        Students student5 = new Students ("Mehr-un-nissa", "Ashfaq");
        Students student6 = new Students ("Hina", "Ashfaq");
        System.out.println("Comparison 3: " + student5.compareTo(student6));
    }
}