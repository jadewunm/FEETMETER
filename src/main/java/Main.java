public class FeetMetersConversion {
    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.println("Feet\tMeters");
        System.out.println("----\t------");
        for (double feet = 1.0; feet <= 10.0; feet++) {
            double meters = footToMeter(feet);
            System.out.printf("%.1f\t%.3f\n", feet, meters);
        }

        System.out.println("\nMeters\tFeet");
        System.out.println("------\t----");
        for (double meters = 20.0; meters <= 65.0; meters += 5.0) {
            double feet = meterToFoot(meters);
            System.out.printf("%.1f\t%.3f\n", meters, feet);
        }
    }
}
