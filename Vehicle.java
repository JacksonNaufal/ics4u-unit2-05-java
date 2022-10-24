/*
* This is a program that gets the Vehicle status
* from Vehicle to carStatus
*
* @author  Jackson Naufal
* @version 1.0
* @since   2022-10-24
*/

/**
 * This is the class for Vehicle.
 * Make class Vehicle.
 */

public class Vehicle {

    /**
     * This is the speed.
     */
    private int speed;

    /**
     * This is the licensePlate.
     */
    private String licensePlate;

    /**
    * This is the color.
    */
    private String color;

    /**
     * This is the maxSpeed.
     */
    private int maxSpeed;

    /**
     * This is the doorNum.
     */
    private int doorNum;

    /**
     * This is the Vehicle Constructor.
     *
     * @param color The vehicles color.
     * @param licensePlate The vehicles license plate.
     * @param doorNum The vehicles number of doors.
     * @param maxSpeed The vehicles max speed.
     *
     */
    public Vehicle(
        String color,
        String licensePlate,
        int doorNum,
        int maxSpeed) {
        this.color = color;
        this.licensePlate = licensePlate;
        this.doorNum = doorNum;
        this.maxSpeed = maxSpeed;
    }

    /**
     * This returns the licensePlate.
     *
     * @return this returns the licensePlate.
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * This sets the licensePlate.
     *
     * @param licensePlateNew this is the new variable.
     */
    public void setLicensePlate(String licensePlateNew) {
        this.licensePlate = licensePlateNew;
    }

    /**
     * This returns the color.
     *
     * @return this returns the color.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * This gets the color.
     *
     * @param setColorNew this is the new variable.
     */
    public void setColor(String setColorNew) {
        this.color = setColorNew;
    }

    /**
     * This gets the door number.
     *
     * @return this returns the door number.
     */
    public int getDoorNum() {
        return this.doorNum;
    }

    /**
     * This gets the speed.
     *
     * @return this returns the speed.
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * This sets the status.
     */
    public void status() {
        System.out.println(" ---> Speed: " + this.speed);
        System.out.println(" ---> MaxSpeed: " + this.maxSpeed);
        System.out.println(" ---> Number Of Doors " + this.doorNum);
        System.out.println(" ---> License Plate: " + this.licensePlate);
        System.out.println(" ---> Color: " + this.color);
    }

    /**
     * Acceleration function
     * This calculates the acceleration speed.
     *
     * @param accelerationPower this is the acceleration power.
     * @param accelerationTime this is the acceleration time.
     *
     */
    public void accelerate(int accelerationPower, int accelerationTime) {
        this.speed = (accelerationPower * accelerationTime) + this.speed;

        if (speed > maxSpeed) {
            this.speed = maxSpeed;
        }
    }

    /**
     * Breaking function
     * This calculates the breaking speed.
     *
     * @param breakPower this is the breaking power.
     * @param breakTime this is the break time.
     *
     */
    public void breaking(int breakPower, int breakTime) {
        this.speed = this.speed - (breakPower * breakTime);

        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
