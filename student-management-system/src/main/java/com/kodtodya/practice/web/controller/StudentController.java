package com.kodtodya.practice.web.controller;

import com.kodtodya.practice.web.model.Student;
import com.kodtodya.practice.web.service.StudentService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class StudentController extends HttpServlet {
    private String message;

    private StudentService studentService = new StudentService();

    public void init() {
        System.out.println("--------------- inside the init() method ---------------");
        message = "Hello team!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("--------------- inside the doGet() method ---------------");
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("--------------- inside the doGet() method ---------------");
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String male = request.getParameter("male");
        String female = request.getParameter("female");
        String age = request.getParameter("age");
        String id = request.getParameter("id");

        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setGender( (null == male) ? "Female" : "Male");
        student.setAge(Integer.parseInt(age));
        student.setId(Integer.parseInt(id));

        try {
            boolean isInserted = studentService.insertStudent(student);
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            if (isInserted) {
                out.println("<h1> student object inserted to db</h1>");
            } else {
                out.println("<h1> student object in NOT inserted to db</h1>");
            }
            out.println("</body></html>");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("--------------- inside the service() method ---------------");
        if (request.getMethod().equals("POST")) {
            this.doPost(request, response);
        } else {
            this.doGet(request, response);
        }
    }

    public void destroy() {
        System.out.println("--------------- inside the destroy() method ---------------");
    }
}