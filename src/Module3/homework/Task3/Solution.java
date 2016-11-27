package Module3.homework.Task3;

import java.util.Date;

public class Solution {

    public static void main(String[] args) {

        Date date = new Date();

        Course course1 = new Course(date, "TI");
        Course course2 = new Course(10, "Programming", "Java");
        Course course3 = new Course();
        Course course4 = new Course(date, "Art");
        Course course5 = new Course(30, "Art", "DigitalArt");

        Student student = new Student();
        Student student2 = new Student("Ivan", "John", 5);
        Course[] coursesTaken = new Course[2];
        coursesTaken[0] = course2;
        coursesTaken[1] = course5;
        Student student3 = new Student("Perepyatka", coursesTaken);

        CollegeStudent collegeStudent1 = new CollegeStudent();
        CollegeStudent collegeStudent2 = new CollegeStudent("Anna", "Olefirenko", 3);
        CollegeStudent collegeStudent3=new CollegeStudent("Ivanenko",coursesTaken);
        CollegeStudent collegeStudent=new CollegeStudent("Roman","Igorenko",4,"NAU",10,9680);

        SpecialStudent specialStudent=new SpecialStudent(125869);



    }

}