/*
* This is a program that calculates the pop
* from JacksonStack
*
* @author  Jackson Naufal
* @version 1.0
* @since   2022-10-08
*/

import java.util.ArrayList;
/**
 * This is the class for JacksonStacks.
 * Make class JacksonStacks.
 */

public class JacksonStacks {

    /**
    * This is an array that is private in this class
    * and can not be modified elsewhere, it only
    * takes number inputted in Main.
    */
    private ArrayList<Integer> stackNum = new ArrayList<Integer>();

    /**
    * This is getter
    * getStack().
    *
    * @return stackNum this is the list of numbers.
    */
    public ArrayList<Integer> getStack() {
        return stackNum;
    }

    /**
     * This adds numbers to the stack.
     *
     * @param userInt this number is added to the array.
     */
    public void push(int userInt) {
        stackNum.add(userInt);
    }

    /**
    * This is the pop stack.
    *
    * @return stackNum this is the new popped number.
    */
    public int pop() {
        final int quantity = stackNum.size();
        final int poppedItem;
        if (stackNum.isEmpty()) {
            poppedItem = -1;
            System.out.println("Nothing In Stack!");
        } else {
            poppedItem = (int) stackNum.get(quantity - 1);
            stackNum.remove(quantity - 1);
        }
        return poppedItem;
    }

    /**
     * This is a peak function.
     *
     * @return peakItem this is the top number in a stack.
     */
    public int peak() {
        final int quantity = stackNum.size();
        final int peakItem;
        if (stackNum.isEmpty()) {
            peakItem = 0;
            System.out.println("Number were popped! No peak!");
        } else {
            peakItem = (int) stackNum.get(quantity - 1);
        }
        return peakItem;
    }

    /**
     * This is a clear function.
     */
    public void clearedArray() {
        stackNum.clear();
    }

    /**
    * This is the final stack.
    */
    public void finishedStack() {
        System.out.println(stackNum);
    }
}
