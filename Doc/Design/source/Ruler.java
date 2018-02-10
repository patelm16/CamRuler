package group10;

import android.graphics.Point;

import java.util.List;

 */

/**
 * Class that handles all the mathematical operations.
 */
public class Ruler {

    private Ruler(){}

    /**
     * Based on a list of 4 points, computes the distance between the last 2 using the first 2 as a
     * reference.
     * @param points A List of 4 points
     * @param scale The value of the distance between the first 2 points
     * @param inputUnitIndex Input unit
     * @param outputUnitIndex Output unit
     * @return The value of the distance between the last 2 points
     */
    public static double compute(List<Point> points, double scale, int inputUnitIndex, int outputUnitIndex){

    	
    }

    /**
     * Get the distance between 2 points
     * @param p1 First point
     * @param p2 Second point
     * @return Distance between the 2 points
     */
    private static double getDistance(Point p1, Point p2){

    }

    /**
     * Converts between units of length.
     * @param refUnit The unit of the reference size
     * @param reference The reference size
     * @param meaUnit The unit of the measurement size
     * @param measurement The measurement size
     * @return measurement converted to refUnit
     */
    private static double convertUnits(int refUnit, double reference, int meaUnit, double measurement){
        
    }

    /**
     * Converts a value in a given unit to meters.
     * @param measurement The length value.
     * @param refUnit The original unit.
     * @return The length value in meters
     */
    private static double toMeters(double measurement, int refUnit){

    }
}
