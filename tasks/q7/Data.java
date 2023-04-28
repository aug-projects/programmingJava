public class Data {

    public static double avg(Measurable[] measurables) {
        double sum = 0;
        for (int i = 0; i < measurables.length; i++) {
            sum += measurables[i].getMeasure();
        }
        if (measurables.length > 0) {
            return (sum / measurables.length);
        } else {
            return 0;
        }
    }
}
