/**
 * Make a LandTract class with the following fields:
 * 
 * • length - an int containing the tract's length • width - an int containing
 * the tract's width
 * 
 * The class should also have the following methods:
 * 
 * area - returns an int representing the tract's area equals - takes another
 * LandTract object as a parameter and returns a boolean saying whether or not
 * the two tracts have the same dimensions (This applies regardless of whether
 * the dimensions match up. i.e., if the length of the first is the same as the
 * width of the other and vice versa, that counts as having equal dimensions.)
 * toString - returns a String with details about the LandTract object in the
 * format: LandTract object with length 30 and width 40 (If, for example, the
 * LandTract object had a length of 30 and a width of 40.) Write a separate
 * program that asks the user to enter the dimensions for the
 * 
 * two tracts of land (in the order length of the first, width of the first,
 * length of the second, width of the second). The program should print the
 * output of two tracts' toString methods followed by a sentence stating whether
 * or not the tracts have equal dimensions. (If the tracts have the same
 * dimensions, print, "The two tracts have the same size." Otherwise, print,
 * "The two tracts do not have the same size.") Print all three statements on
 * separate lines.
 **/

import java.util.Scanner;
public class LandTract {

	private int length; // hold length of obj
	private int width; // hold width of obj

	public LandTract(int len, int wid) {

		length = len;
		width = wid;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// hold length and width of first object
		int objLength1, objWidth1;

		System.out.println();

		// hold length and width of first object
		int objLength2, objWidth2;

		// Ask for the first landTract
		System.out.print("Enter length of first land tract: ");
		objLength1 = input.nextInt();
		System.out.print("Enter width of first land tract: ");
		objWidth1 = input.nextInt();

		// creating second object
		LandTract object1 = new LandTract(objLength1, objWidth1);

		// Ask for the first landTract
		System.out.print("Enter length of second land tract: ");
		objLength2 = input.nextInt();
		System.out.print("Enter width of second land tract: ");
		objWidth2 = input.nextInt();

		// creating second object
		LandTract object2 = new LandTract(objLength2, objWidth2);

		// calculate area of first
		int area1 = area(objLength1, objWidth1);
		// calculate area of second
		int area2 = area(objLength2, objWidth2);

		// print results
		System.out.println(object1);
		System.out.println(object2);

		// check if they are same size
		equals(object1, object2);
	}

	/**
	 * 
	 * @param len will hold length of objects
	 * @param wid will hold width of objects
	 * @return
	 */
	public static int area(int len, int wid) {
		return len * wid; // returns area
	}

	/**
	 * @return a string of each object1 and onbject2
	 */
	public String toString() {
		String str = "LandTract with " + length + ", " + " width " + " and area " + area(length, width);
		return str;
	}

	/**
	 * 
	 * @param object1 reference to object 1
	 * @param object2 reference to object 2
	 */
	public static void equals(LandTract object1, LandTract object2) {
		if (object1.equals(object2)) {
			System.out.println("The two tracts have the same size");
		} else {
			System.out.println("The two tracts do not have the same size");
		}
	}

}
