import java.util.Scanner;

public class BMIindex{
        public static String BMIChecker(double Weight, double Height) {

            // calculate the BMI
            double BMI = Weight / ( Height * Height) ;

            // check the range of BMI
            if(BMI < 16.00)
                return "starvation";
            else if(BMI < 16.99)
                return "emaciation";
            else if(BMI < 18.49)
                return "underweight";
            else if(BMI < 22.99)
                return "normal,low range";
            else if(BMI < 24.99)
                return "normal, high range";
            else if(BMI < 27.49)
                return "overweight,low range";
            else if(BMI < 29.99)
                return "overweight,high range";
            else if(BMI < 34.9)
                return "1st degree obesity";
            else if(BMI < 39.9)
                return "2nd degree obesity";
            else if(BMI < 40)
                return "3rd degree obesity";
            else
                return "Obese";
        }

        public static void main(String[] args) {

            double Weight = 0.0f;
            double Height = 0.0f;
            String BMI_Result = null;

            Scanner scan_input = new Scanner(System.in);
            System.out.print("Please enter the weight in kg: ");
            Weight = scan_input.nextDouble();
            System.out.print("Please enter the height in cm: "); //we need in meters
            Height = scan_input.nextDouble();


            BMI_Result = BMIChecker( Weight, Height );

            System.out.println(BMI_Result);

            scan_input.close();
        }
    }

