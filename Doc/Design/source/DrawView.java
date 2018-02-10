package group10;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PixelFormat;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


 */

/**
 * Class used to draw the points on screen. Handles user touch input.
 */
public class DrawView extends SurfaceView {
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    List<Point> circlePoints;
    private Context context;

    private static int REFERENCE_POINT_COLOR = Color.YELLOW;
    private static int MEASURE_POINT_COLOR = Color.RED;

    public DrawView(Context context){

    }

    @Override
    protected void onDraw(Canvas canvas){
        
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){

    }

    /**
     * Clears all drawn points and shapes
     */
    public void clearCanvas(){

    }

    /**
     * Calculates the measurement
     * @param reference The reference size
     * @param inputUnitIndex The input length unit index
     * @param outputUnitIndex The output length unit index
     * @return The value of the measurement, converted to outputUnitIndex
     */
    public double calculate(double reference, int inputUnitIndex, int outputUnitIndex){



}
