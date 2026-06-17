import java.util.LinkedList;

public class Day10a {

    static class Student {
        String name;
        int regNo;
        int marks;

        Student(String name, int regNo, int marks) {
            this.name = name;
            this.regNo = regNo;
            this.marks = marks;
        }
    }

    static void removeStudent(LinkedList<Student> students) {
        System.out.println("Removed : " + students.removeFirst().name);
    }

    static void updateStudent(LinkedList<Student> students) {
        for (Student s : students) {
            if (s.name.equals("Ashmii")) {
                s.marks = 95;
            }
        }
    }
    public static void main(String[] args) {

        LinkedList<Student>students = new LinkedList<>();

        students.add(new Student("Abi", 101, 80));
        students.add(new Student("Sajiii", 102, 75));
        students.add(new Student("Lasii", 103, 90));
        students.add(new Student("Ashmii", 104, 85));
        students.add(new Student("Rithicka", 105, 88));


        removeStudent(students);
        updateStudent(students);

        System.out.println("\nStudent Details");
        for (Student s : students) {
            System.out.println(
                    s.name + " " +
                            s.regNo + " " +
                            s.marks
            );
        }
    }
}