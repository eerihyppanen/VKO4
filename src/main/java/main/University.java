package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class University {
    private ArrayList<Student> students = new ArrayList<>();
    final private String FILENAME;



    public University() {
        FILENAME = "students.data";
    }





    public void addStudents(Student student)   {
        students.add(student);
    }


    public void listStudents()  {
        System.out.println("Opiskelijat:");

        for (Student student : students) {
            System.out.println(student.getStudentNumber() + ": " + student.getName());
            
        }

    }


    public void listID()    {

        for (int i=0; i < students.size(); ++i) {

            System.out.println(i + ": " + students.get(i).getName()); // katsoin .get(i).getName() ChatGPT kun sain erroria kokoajan pelkällä getName()

        }

        

    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public void saveStudents()  {

        
        try {
            ObjectOutputStream studentWriter = new ObjectOutputStream(new FileOutputStream(FILENAME));
            studentWriter.writeObject(students);
            studentWriter.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }



    public void loadStudents() throws ClassNotFoundException  {
        try {
            ObjectInputStream studentReader = new ObjectInputStream(new FileInputStream(FILENAME));
            students = (ArrayList<Student>) studentReader.readObject();
            studentReader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }




    }





}
