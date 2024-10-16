package ie.atu.week4;
import java.util.Scanner;

public class StudentApp
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student 1 //
        System.out.println("Please enter name: ");
        String name1 = sc.nextLine();
        System.out.println("Please enter email: ");
        String email1 = sc.nextLine();
        System.out.println("Please enter course: ");
        String course1 = sc.nextLine();
        Student s1 = new Student();
        s1.setName(name1);
        s1.setEmail(email1);
        s1.setCourse(course1);

        // Student 2 //
        System.out.println("Please enter student 2's name: ");
        String name2 = sc.nextLine();
        System.out.println("Please enter student 2's email: ");
        String email2 = sc.nextLine();
        System.out.println("Please enter student 2's course: ");
        String course2 = sc.nextLine();
        Student s2 = new Student();
        s2.setName(name2);
        s2.setEmail(email2);
        s2.setCourse(course2);

        // Student 3 //
        System.out.println("Please enter student 3's name: ");
        String name3 = sc.nextLine();
        System.out.println("Please enter student 3's email: ");
        String email3 = sc.nextLine();
        System.out.println("Please enter student 3's course: ");
        String course3 = sc.nextLine();
        Student s3 = new Student();
        s3.setName(name3);
        s3.setEmail(email3);
        s3.setCourse(course3);


        System.out.println("Student 1's name: " + s1.getName() + "Email: " + s1.getEmail() + "Course: " + s1.getCourse());
        System.out.println("Student 2's name: " + s2.getName() + "Email: " + s2.getEmail() + "Course: " + s2.getCourse());
        System.out.println("Student 3's name: " + s3.getName() + "Email: " + s3.getEmail() + "Course: " + s3.getCourse());
    }
}