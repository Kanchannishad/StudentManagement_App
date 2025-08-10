package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

    public static boolean insertStudentToDB(Student st) {
        boolean f = false;
        try {
            Connection con = CP.createC(); // use CP here
            String q = "insert into students(name, phone, city) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudenPhone());
            pstmt.setString(3, st.getStudenCity());

            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deleteStudent(int userId) {
        boolean f = false;
        try {
            Connection con = CP.createC(); // use CP here
            String q = "delete from students where id=?";
            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setInt(1, userId);

            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static void showAllStudents() {
        try {
            Connection con = CP.createC(); // fixed here too
            String q = "select * from students;";
            Statement stmt = con.createStatement();

            ResultSet set = stmt.executeQuery(q);

            while (set.next()) {
                int id = set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString("city");

                System.out.println("Id: " + id);
                System.out.println("Name: " + name);
                System.out.println("Phone: " + phone);
                System.out.println("City: " + city);
                System.out.println("---------------------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
