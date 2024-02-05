package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    private String name;

    private int studentNumber;

    private ArrayList<Grade> grades = new ArrayList<>();


    public Student(String name, int studentNumber)  {
        this.name = name;
        this.studentNumber = studentNumber;
        


    }

    public String getName() {
        return name;
    }

    public int getStudentNumber()   {
        return studentNumber;

    }

    public void addGrade(Grade grade)    {
        
        grades.add(grade);
    }

    public void listGrades(Grade grade) {

        for (Grade studentGrade : grades) {
            System.out.println(studentGrade.getCourse() + ": " + studentGrade.getCourseGrade());
            
        }
    }

    public List<Grade> getGrades() {
        return new ArrayList<>(grades);
    }



}
