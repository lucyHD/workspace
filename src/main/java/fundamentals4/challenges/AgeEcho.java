package fundamentals4.challenges;

public class AgeEcho {

    public static void main(String[] args) {

        ageStrng("ben", 61);
    }

    public static String ageStrng(String name, int age) {

        String overSixty = "NO";
        if (age >= 60) {
            overSixty = "YES";
        }
        return overSixty;

    }}
