// 11.Write a program calculate the wind chill temperature given the temperature and wind speed

import java.util.Scanner;

public class WindChillCalculator {
    // Calculates wind chill based on temperature and wind speed.
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = in.nextDouble();
        
        System.out.print("Enter wind speed (in mph): ");
        double windSpeed = in.nextDouble();
        
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill temperature is " + windChill);
        

    }
}
