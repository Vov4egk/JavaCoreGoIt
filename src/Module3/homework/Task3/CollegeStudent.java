package Module3.homework.Task3;

class CollegeStudent extends Student {

    private String collegeName;
    private int rating;
    private long id;


    CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
        System.out.println("CollegeStudent extends Student");
    }

    CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
        System.out.println("CollegeStudent extends Student");
    }


    public CollegeStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    CollegeStudent() {

    }



    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}