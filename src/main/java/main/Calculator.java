package main;

import java.util.List;

public class Calculator {
    public double averageGrade;




    public Calculator(double averageGrade)  {

        this.averageGrade = averageGrade;
    }  




public static double calculateAverage(List<Grade> grades) { // List ei toiminut niin netistä läytyn että kyseinen kirjasto pitää ladata.

    if (grades.isEmpty()) {
        
        return 0.0;

    }


        double totalGrade = 0.0;

        for (Grade studentGrade : grades) {
            totalGrade += studentGrade.getCourseGrade();
        }

        return totalGrade / grades.size();
    }


    public void getMedianGrade(Student s)   {



    }
}





