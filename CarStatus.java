/*
* The program gets a a vehicle
* and it calculates the stats.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-10-17
*
* This is a Vehicle program
*/

/**
 * This is the main CarStatus Class.
 * Class CarStatus
 */
final class CarStatus {

    /**
     * The number 4.
     */
    public static final int FOUR = 4;

    /**
     * The number 284.
     */
    public static final int TWOEIGHTYFOUR = 284;

    /**
     * The number 10.
     */
    public static final int TEN = 10;

    /**
     * The number 320.
     */
    public static final int THREETWENTY = 320;

    /**
     * The number 100.
     */
    public static final int ONEHUNDRED = 100;

    /**
     * The number 45.
     */
    public static final int FOURTYFIVE = 45;

    /**
     * The number 5.
     */
    public static final int FIVE = 5;

    /**
     * The word "Status".
     */
    public static final String STATUS = "Status";

    /**
     * The new speed.
     */
    public static final String NEWSPEED = "New speed is";

    /**
     * The new color.
     */
    public static final String NEWCOLOR = "New color:";

    /**
     * The color change.
     */
    public static final String CHANGECOLOR = "Changing color:";

    /**
     * The new speed change again.
     */
    public static final String NEWERSPEED = "New speed:";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private CarStatus() {
        throw new IllegalStateException("Cannot be instantiated");

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // new Ford Focus
        System.out.println("Created Ford Focus");
        final Vehicle fordFocus = new Vehicle("white", "B40-C4RR0", FOUR,
                        TWOEIGHTYFOUR);

        System.out.println(STATUS);
        fordFocus.status();

        System.out.println("Accelerating, 10 of power for 10 sec.");
        fordFocus.accelerate(TEN, TEN);
        System.out.println(NEWSPEED + fordFocus.getSpeed());

        System.out.println("Changing colour to black:");
        fordFocus.setColor("black");
        System.out.println(NEWCOLOR + fordFocus.getColor());

        System.out.println("");

        // new Ferrari
        System.out.println("Created a Ferrari");
        final Vehicle ferrari = new Vehicle("red", "VHD-35HU", 2, THREETWENTY);

        System.out.println(STATUS);
        ferrari.status();

        System.out.println("Accelerating, 100 of power for 10 sec.");
        ferrari.accelerate(ONEHUNDRED, FOUR);
        System.out.println(NEWSPEED + ferrari.getSpeed());

        System.out.println("Breaking, 10 of power for 10 sec.");
        ferrari.breaking(TEN, TEN);
        System.out.println(NEWERSPEED + ferrari.getSpeed());

        System.out.println(CHANGECOLOR);
        ferrari.setColor("racing red");
        System.out.println(NEWCOLOR + ferrari.getColor() + "!");

        System.out.println("");

        // new Citroen Ami
        System.out.println("Created Citroen Ami");
        final Vehicle citroenAmi = new Vehicle("blue", "FS-695-DQ", 2,
                        FOURTYFIVE);

        System.out.println(STATUS);
        citroenAmi.status();

        System.out.println("Accelerating, 5 of power for 10 sec.");
        citroenAmi.accelerate(FIVE, TEN);
        System.out.println(NEWSPEED + citroenAmi.getSpeed());

        System.out.println("Breaking, 2 of power for 10 sec.");
        citroenAmi.breaking(2, TEN);
        System.out.println(NEWERSPEED + citroenAmi.getSpeed());

        System.out.println(CHANGECOLOR);
        citroenAmi.setColor("purple");
        System.out.println(NEWCOLOR + citroenAmi.getColor());

        System.out.println("\nDone!");
    }
}
