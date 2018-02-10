package com.example.kshitij.camruler;

/**
 * Created by Kshitij on 2017-11-29.
 */

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;


public class Utilities {
    private Utilities(){}






//Imperial units conversion factor - https://en.wikipedia.org/wiki/Imperial_units


    /**
     * Convert from inchestometers
     * @param measurement the value to be computed
     * @return converted value
     */

    public static double inchesToMeters(double measurement) {
        return measurement * 0.0254;
    }

    /**
     * Convert from mmtometers
     * @param measurement the value to be computed
     * @return converted value
     */


    public static double millimetersToMeters(double measurement) {
        return measurement * 0.001;
    }
    /**
     * Convert from centimeterstometers
     * @param measurement the value to be computed
     * @return converted value
     */


    public static double centimetersToMeters(double measurement) {
        return measurement * 0.01;
    }


    /**
     * Convert from meterstoinch
     * @param measurement the value to be computed
     * @return converted value
     */

    public static double metersToInch(double measurement) {
        return measurement * 39.3700787;
    }
    /**
     * Convert from meterstomillimeters
     * @param measurement the value to be computed
     * @return converted value
     */


    public static double metersToMillimeters(double measurement) {
        return measurement * 1000;
    }
    /**
     * Convert from meterstocentimeters
     * @param measurement the value to be computed
     * @return converted value
     */

    public static double metersToCentimeters(double measurement) {
        return measurement * 100;
    }
}
