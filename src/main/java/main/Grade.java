package main;

import java.io.Serializable;

public class Grade implements Serializable{

    String course;

    int courseGrade;


public Grade(String course, int courseGrade)    {

        this.course = course;
        this.courseGrade = courseGrade;
}


public String getCourse()   {
    return course;
}

public int getCourseGrade() {
    return courseGrade;

}

    

}
