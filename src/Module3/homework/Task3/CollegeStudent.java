package Module3.homework.Task3;

public class CollegeStudent extends Student {

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken, int age,
                          String collegeName, int rating, long id) {
        super(firstName, lastName, group, coursesTaken, age);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
    String collegeName;
    int rating;
    long id;

}
