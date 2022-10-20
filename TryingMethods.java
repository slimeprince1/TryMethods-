public class TryingMethods { // insert comment here
    public static void main(String[] args) {

        new TryingMethods().secondDynamic(0);

        System.out.println("The sum of natural numbers below 1000 is: " + sumLoop());
    }

    // dynamic methods
    String daysInWeek(int days) {
        switch (days) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid";
        }
    }

    void secondDynamic(int score) {

        if (score <= 70) {
            System.out.println("Keep pushing");
        } else if (score >= 75) {
            System.out.println("You're doing great");
        } else {
            System.out.println("Please go and sleep");
        }
    }

    // Static
    public static int sumLoop() {

        int a = 1;
        int sum2 = 0;

        while (a < 1000) {
            sum2 = sum2 + a;
            a++;
        }
        return sum2;
    }

    public static int SumEven() {
        int a, sumEven = 0;
        for (a = 13; a <= 103; a++) {
            if (a % 2 == 0) {

                sumEven += a;

            }
        }
        return sumEven;
    }
}