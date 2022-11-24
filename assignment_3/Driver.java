/*
 * Assignment 3
 * Jerry Joy
 * 2203196
 */

// The main function
public class Driver {
    public static void main(String[] args) {
        Property formatter = new Property();
        Property property1 = new Property("7 main St.", 1, 2, 2012, (float) 0.1, "Condo");
        Property property2 = new Property("20 Square St.", 2, 1, 2020, (float) 0.02, "Condo");
        Property property3 = new Property("65 rue College", 3, 3, 1988, (float) 0.2,
                "SFHome");
        Property property4 = new Property("110 Flowers rd", 1, 4, 1992, (float) 0.15,
                "SFHome");

        /*
         * 
         * Display Properties
         */
        formatter.header();
        System.out.print("Property 1:");
        property1.displayDetails();
        formatter.dividor();

        System.out.print("Property 2:");
        property2.displayDetails();
        formatter.dividor();

        System.out.print("Property 3:");
        property3.displayDetails();
        formatter.dividor();

        System.out.print("Property 4:");
        property4.displayDetails();
        formatter.dividor();

        formatter.footer();
    }
}
