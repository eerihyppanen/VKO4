package main;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);


        boolean exit = false;

        Student student = null;

        University university = new University();

        Grade grade = null;



        while(!exit)    {

            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");


            if(sc.hasNext())    {

                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch (i) {
                    case 1:

                    System.out.println("Anna opiskelijan nimi?");
                    String name = sc.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:");
                    String studentNumberString = sc.nextLine();
                    int studentNumber = Integer.parseInt(studentNumberString);
                    student = new Student(name, studentNumber);
                    university.addStudents(student);

                    
                        break;

                    case 2:

                        university.listStudents();



                        break;

                    case 3:

                        university.listID();
                        System.out.println("Mille opiskelijalle suorite lisätään?");
                        String selectedStudentIndexString = sc.nextLine();
                        int selectedStudentIndex = Integer.parseInt(selectedStudentIndexString);
                    
                        Student selectedStudent = university.getStudent(selectedStudentIndex);

                        System.out.println("Mille kurssille suorite lisätään?");
                        String course = sc.nextLine();
                        System.out.println("Mikä arvosana kurssille lisätään?");
                        String courseGradeString = sc.nextLine();
                        int courseGrade = Integer.parseInt(courseGradeString);
                        grade = new Grade(course, courseGrade);
                        selectedStudent.addGrade(grade);


                         break;

                    case 4:

                        university.listID();
                        System.out.println("Minkä opiskelijan suoritteet llistataan?");
                        String selectedStudentListString = sc.nextLine();
                        int selectedStudentList = Integer.parseInt(selectedStudentListString);
                        Student selectedStudent2 = university.getStudent(selectedStudentList);
                        selectedStudent2.listGrades(grade);



                        break;
                    
                    case 5:

                        System.out.println("Minkä opiskelijan keskiarvo lasketaan?");
                        university.listID();
                        String selectedStudentIndexString2 = sc.nextLine();
                        int selectedStudentIndex2 = Integer.parseInt(selectedStudentIndexString2);

                        Student selectedStudent3 = university.getStudent(selectedStudentIndex2);
                        double average = Calculator.calculateAverage(selectedStudent3.getGrades());
                        System.out.println("keskiarvo: " + average);


                        break;

                    case 6:



                        break;

                    case 7:

                        university.saveStudents();

                        break;

                    case 8:

                        try {
                            university.loadStudents();
                        } catch (ClassNotFoundException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }

                        break;
                    

                    case 0:

                        System.out.println("Kiitos ohjelman käytötä.");
                        exit = true;


                        break;


                
                    default:


                        System.out.println("Syöte oli väärä");



                        break;

                }
            }



        }




        

        sc.close();



    }
}
