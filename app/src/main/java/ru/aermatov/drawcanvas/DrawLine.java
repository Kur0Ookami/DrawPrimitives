package ru.aermatov.drawcanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by aermatov on 29.09.2015.
 */
public class DrawLine extends DrawCanvas{

    public DrawLine(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(Color.WHITE);
        mCanvas.drawLine(50, 300, 200, 600, mPaint);
    }
}
