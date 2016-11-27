package Module3.homework.Task3;

class SpecialStudent extends CollegeStudent {


    private long secretKey;
    private String email;


    SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }


    SpecialStudent(long secretKey) {
        this.secretKey = secretKey;
        System.out.println("SpecialStudent extends CollegeStudent");
    }


    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}