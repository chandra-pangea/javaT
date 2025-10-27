
class Student {
    String name;
    int age;
    int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

public class array {
    public static void main(String[] args) {
        // int[] marks = new int[4];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;
        // marks[3] = 95;
        // for (int i = 0; i < 4; i++) {
        //     System.out.println(marks[i]);
        // }

        // int[][] marks1 = new int[4][4];

        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         marks1[i][j] = i + j;
        //     }
        // }

        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.err.print(marks1[i][j]);
        //     }
        //     System.err.println("");
        // }

        // int[][] marks2 = {
        //         { 97, 98, 95, 95 },
        //         { 96, 97, 94, 94 },
        //         { 95, 96, 93, 93 },
        //         { 94, 95, 92, 92 }
        // };

        // for (int i = 0; i < marks2.length; i++) {
        //     for (int j = 0; j < marks2[i].length; j++) {
        //         System.err.print(marks2[i][j] + "");
        //     }
        //     System.err.println("");
        // }

        // Student array and initialization
        Student[] students = new Student[4];
        Student s1 = new Student("Alice", 20, 85);
        Student s2 = new Student("Bob", 21, 90);
        Student s3 = new Student("Charlie", 22, 95);
        Student s4 = new Student("Diana", 23, 88);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

        for (Student s : students) {
            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.age);
            System.out.println("Marks: " + s.marks);
        }
    }
}
