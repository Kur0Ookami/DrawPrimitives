package ru.aermatov.drawcanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;


public class DrawCircle extends DrawCanvas{
    public DrawCircle(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(Color.BLUE);
        mCanvas.drawCircle(200f, 200f, 150f, mPaint);
    }
}
