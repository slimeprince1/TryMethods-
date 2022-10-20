public class TryingMethods { // insert comment here
    public static void main(String[] args) {
        System.out.println("Trying Methods");

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
                return "Invalid Day";
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
    public static void samLoop() {

        int a = 1;
        int sum = 0;
        while (a < 1000) {
            sum = sum + a;
            a++;
        }
    }
}