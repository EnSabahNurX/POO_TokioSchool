public class Temperature {
    private static final int boilingPointC = 100;
    private static final int boilingPointF = 212;
    protected static int meltingPointC = 0;
    protected static int meltingPointF = 32;

    private static double toCelsius(double f2) {
        return (f2 - 32) * 5.0 / 9.0;
    }

    private static double toFahrenheit(double c2) {
        return (c2 * 9.0 / 5.0) + 32;
    }

    public static double getToCelsius(double f1) {
        return toCelsius(f1);
    }

    public static double getToFahrenheit(double c1) {
        return toFahrenheit(c1);
    }

    public static int getMeltingPointC() {
        return meltingPointC;
    }

    public static int getMeltingPointF() {
        return meltingPointF;
    }

    public static int getBoilingPointC() {
        return boilingPointC;
    }

    public static int getBoilingPointF() {
        return boilingPointF;
    }
}
