package studentmanagement_app;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.student.manage.Student;
import com.student.manage.StudentDao;


public class Start {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Press 1 to Add student");
            System.out.println("Press 2 to Delete student");
            System.out.println("Press 3 to Display students");
            System.out.println("Press 4 to Exit App");

            int c = Integer.parseInt(br.readLine());

            if (c == 1) {
                // Add student
                System.out.println("Enter user name:");
                String name = br.readLine();

                System.out.println("Enter user phone:");
                String phone = br.readLine();

                System.out.println("Enter user city:");
                String city = br.readLine();

                Student st = new Student(name, phone, city);
                boolean answer = StudentDao.insertStudentToDB(st);

                if (answer) {
                    System.out.println("Student is added successfully...");
                } else {
                    System.out.println("Something went wrong, try again");
                }
                System.out.println(st);

            } else if (c == 2) {
                // Delete student
                System.out.println("Enter student ID to delete:");
                int userId = Integer.parseInt(br.readLine());
                boolean f = StudentDao.deleteStudent(userId);

                if (f) {
                    System.out.println("Deleted successfully...");
                } else {
                    System.out.println("Something went wrong...");
                }

            } else if (c == 3) {
                // Display students
                StudentDao.showAllStudents();

            } else if (c == 4) {
                // Exit
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        System.out.println("Thank you for using my application!");
    }
}
