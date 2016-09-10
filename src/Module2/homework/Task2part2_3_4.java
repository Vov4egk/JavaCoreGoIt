package Module2.homework;

class Task2part2_3_4 {
    static double comissionPer = 5;
    static double[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double result(double balance, double withdrawal) {
        return balance - withdrawal - (withdrawal * comissionPer / 100);
    }

    static double withdrawOwnerBalance(String ownerName, double withdrawal) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                return result(balances[i], withdrawal);
            }
        }
        return 0;
    }

    static double fundBalance(String ownerName, double fund) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                return balances[i] + fund;
            }
        }
        return 0;
    }

    static void main(String[] args) {
        double balance = 100;
        double withdrawal = 10;
        double withdrawBalance = result(balance, withdrawal);

        String ownerName = "Ann";
        double sumOfWithdrawal = 245;

        //part2:
        if (withdrawBalance >= 0) {
            System.out.println("ОК. Commission:" + (withdrawal * comissionPer / 100) + " Balance: " + withdrawBalance);
        } else {
            System.out.println("NO");
        }

        //part3:

        withdrawBalance = withdrawOwnerBalance(ownerName, sumOfWithdrawal);
        if (withdrawBalance >= 0) {
            System.out.println(ownerName + " Sum: " + sumOfWithdrawal + " Balance: " + withdrawBalance);
        } else {
            System.out.println("NO");
        }

        //part4

        ownerName = "Oww";
        sumOfWithdrawal = 100;

        withdrawBalance = fundBalance(ownerName, sumOfWithdrawal);

        if (withdrawBalance >= 0) {
            System.out.println(ownerName + " Balance: " + withdrawBalance);
        } else {
            System.out.println("NO");
        }

    }
}