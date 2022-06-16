
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator consumption1 = new Calculator();

        Scanner input = new Scanner(System.in);

        System.out.println("     _Enter your MPG_  ");

        double carMileage;
        double gallons;
        double carOdometer;
        double gas;
        double mpg;

        System.out.println(" Enter your car miles driven: ");
        carMileage = input.nextDouble();
        carOdometer = carMileage++;
        consumption1.setMilesDriven(carMileage);

        System.out.println("Enter gallons used: ");
        gallons = input.nextDouble();
        gas = gallons++;
        consumption1.setGallonsUsed(gallons);
        consumption1.setMpg(carMileage, gallons);

        mpg = consumption1.getMpg();
        System.out.println(" (Your mpg is: " + mpg + ")" );

        }
        double milesDriven;
        double gallonsUsed;
        double mpg1;


        public void setMilesDriven(double Miles) {
        milesDriven = milesDriven + Miles;
        }
        public void setGallonsUsed(double Gallons) {
        gallonsUsed = gallonsUsed+Gallons;
        }
        public void setMpg(double setM, double setG) {
        mpg1 = (setM) / setG;
        }
        public double getMpg() {
        return mpg1;
        }

        }
