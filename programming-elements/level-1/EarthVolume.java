//Write a Program to compute the volume of Earth in km^3 and miles^3


public class EarthVolume {
    public static void main(String[] args) {
        double pi = 3.14159;
        double radius = 6378; 
        
        double volumeInKm = (4.0 / 3) * pi * Math.pow(radius, 3);
        double volumeInMiles = volumeInKm * 0.239913; 
        
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + " and cubic miles is " + volumeInMiles);
    }
}
