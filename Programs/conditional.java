public class conditional {
    public static void main(String[] args) {
        /*
         * 1)if statement 2)if-else 3)if else if ladder 4)nested if
         * 
         */
        // if statement
        // if(condition){}

        int age = 15;
        if (age >= 18) {
            System.out.println("This person is eligible for voting");
        } else {
            System.out.println("Not Eliible");
        }

        // if-else ladder/elif
        int licenseage = 21;
        if (licenseage > 20) {
            System.out.println("Eligible for license");
        } else if (licenseage == 20) {
            System.out.println("One year to left for applying");
        } else {
            System.out.println("Your age is not for applying");

        }

        // nestedif
        int ages = 18;
        int studies_in = 10;
        if (ages == 15) {
            System.out.println("He is in teenager");
            if (studies_in == 10) {
                System.out.println("He is studying in 10th");
            }
        } else {
            System.out.println("He is not a teenager");
        }

    }

}
