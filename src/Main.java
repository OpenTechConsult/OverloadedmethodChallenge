public class Main {

    public static void main(String[] args) {

        System.out.println("120 inches is equivalent to " + convertToCentimeters(120) + " centimeters");
        System.out.println("5 foot, 8 inches is equivalent to " + convertToCentimeters(5, 8) + " centimeters");
    }


    public static double convertToCentimeters (int heightInInches){
        double heightInCentimeters = heightInInches * 2.54;
        return heightInCentimeters;
    }

    public static double convertToCentimeters (int heightInFeet, int heightInInches){

        int footToInches = heightInFeet * 12;
        int totalOfHeightInInches = footToInches + heightInInches;
        double heightInCentimeters = convertToCentimeters(totalOfHeightInInches);

        return heightInCentimeters;
    }


}
