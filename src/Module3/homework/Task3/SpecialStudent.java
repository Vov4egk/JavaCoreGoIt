package Module3.homework.Task3;

class SpecialStudent extends CollegeStudent {

    long secretKey;
    String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, Course[] coursesTaken, int age, String collegeName, int rating, long id) {
        super(firstName, lastName, group, coursesTaken, age, collegeName, rating, id);
    }

}
