package day26_CustomMethodPractice;

public class FrequencyOfElement {

    public static int frequencyOfElement(int[] a, int b) {

        int freq = 0;

        for (int each : a) {

            if (each == b) {
                freq++;
            }
        }


        return freq;
    }

    public static int frequencyOfElement(double[] a, double b) {

        int freq = 0;

        for (double each : a) {

            if (each == b) {
                freq++;
            }
        }


        return freq;
    }

    public static int frequencyOfElement(char[] a, char b) {

        int freq = 0;

        for (char each : a) {

            if (each == b) {
                freq++;
            }
        }


        return freq;
    }

    public static int frequencyOfElement(String[] a, String b) {

        int freq = 0;

        for (String each : a) {

            if (each == b) {
                freq++;
            }
        }


        return freq;
    }

}

