package Leetcode.LogicalQuestion;

public class ConvertTheTemperature_2469 {

    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahren = celsius*1.8 + 32;
        return new double[] { kelvin, fahren };
    }
    public static void main(String[] args) {
        double celsius = 36.50;
        double[] temp = convertTemperature(celsius);
        System.out.println(temp[0]);
        System.out.println(temp[1]);
    }
}
