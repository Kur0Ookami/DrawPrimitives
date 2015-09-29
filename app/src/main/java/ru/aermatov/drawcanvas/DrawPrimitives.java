package ru.aermatov.drawcanvas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class DrawPrimitives extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_primitives);
    }
    public void toRectangle(View view){
        Intent goToRect = new Intent(this, Rectangle.class);
        startActivity(goToRect);

    }public void toCircle(View view){
        Intent goToCirc = new Intent(this, Circle.class);
        startActivity(goToCirc);

    }public void toLine(View view){
        Intent goToLine = new Intent(this, Line.class);
        startActivity(goToLine);

    }public void toImage(View view){
        Intent goToImage = new Intent(this, Image.class);
        startActivity(goToImage);

    }
}
