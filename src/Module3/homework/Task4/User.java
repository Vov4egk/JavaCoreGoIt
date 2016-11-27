package Module3.homework.Task4;

    class User {
        private String name;
        private int balance;
        private int monthsOfEmployment;
        private String companyName;
        private int salary;
        private String currency;

        User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
            this.name = name;
            this.balance = balance;
            this.monthsOfEmployment = monthsOfEmployment;
            this.companyName = companyName;
            this.salary = salary;
            this.currency = currency;
        }

         String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }

        int getBalance() {
            return balance;
        }

         void setBalance(int balance) {
            this.balance = balance;
        }

        int getMonthsOfEmployment() {
            return monthsOfEmployment;
        }

         void setMonthsOfEmployment(int monthsOfEmployment) {
            this.monthsOfEmployment = monthsOfEmployment;
        }

         String getCompanyName() {
            return companyName;
        }

         void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

         int getSalary() {
            return salary;
        }

         void setSalary(int salary) {
            this.salary = salary;
        }

         String getCurrency() {
            return currency;
        }

         void setCurrency(String currency) {
            this.currency = currency;
        }

        void paySalary(){
            balance += salary;
        }

        void withdraw(int summ){
            int commision;
            if (summ < 1000) {
                commision = 5;
                balance -= (summ + summ*commision/100);
            }
            else {
                commision = 10;
                balance -= (summ + summ*commision/100);
            }
        }

        int companyNameLength() {
            return companyName.length();
        }

        void monthIncreaser(int addMonth) {
            monthsOfEmployment += addMonth;
        }
    }

