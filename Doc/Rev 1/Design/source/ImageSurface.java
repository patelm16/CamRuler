package group10;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.io.File;


 */

/**
 * Class used to handle displaying the photo/image to the user.
 */
public class ImageSurface extends SurfaceView implements SurfaceHolder.Callback {

    private Bitmap icon;
    private Paint paint;

    public ImageSurface(Context context, File image) {
 
    }

    @Override
    protected void onDraw(Canvas canvas) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
    }

    @SuppressLint("WrongCall")
    @Override
    public void surfaceCreated(SurfaceHolder holder) {
       
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
    }
}
