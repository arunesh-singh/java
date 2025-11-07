public class convert_minute {
    public static int convertMinuteToDays(int minutes) {
        return minutes / (24 * 60);
    }

    public static int convertDaystoYears(int days) {
        return days / 365;
    }

    public static void main(String[] args) {
        int minutes = 525600; // Example input
        int days = convertMinuteToDays(minutes);
        int years = convertDaystoYears(days);
        System.out.println(minutes + " minutes is equal to " + days + " days.");
        System.out.println(days + " days is equal to " + years + " years.");
    }
}