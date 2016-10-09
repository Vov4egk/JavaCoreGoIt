package Module3.homework.Task3;

import java.util.Date;

public class Course {
    private int hoursDuration;
    private String teacherName;
    private Date startDate;
    private String name;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(int hoursDuration, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }
}