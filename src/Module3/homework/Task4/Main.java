package Module3.homework.Task4;

public class Main {
    public static void main(String[] args) {
        User user = new User("User", 2000, 4, "UserCompany", 500, "UAH");
        System.out.println(user.companyNameLength());
        user.paySalary();
        System.out.println(user.getBalance() + " After salary");
        user.monthIncreaser(6);
        user.withdraw(1500);
        System.out.println(user.getBalance() + " After withdraw");
        System.out.println(user.getMonthsOfEmployment() + " Months");

    }
}
