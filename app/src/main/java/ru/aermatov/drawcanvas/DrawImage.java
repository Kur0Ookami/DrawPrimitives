package ru.aermatov.drawcanvas;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;

/**
 * Created by aermatov on 29.09.2015.
 */
public class DrawImage extends DrawCanvas{


    public DrawImage(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
       // mPaint.setColor(Color.CYAN);
       // mCanvas.drawRect(10, 10, 300, 375, mPaint);

    //    mCanvas.drawPicture(new Picture(R.drawable.pict));

    }
}
