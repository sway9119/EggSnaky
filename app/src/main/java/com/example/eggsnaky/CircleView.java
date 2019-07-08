package com.example.eggsnaky;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


public class CircleView extends View {
    public CircleView (Context context, AttributeSet attrs) { super(context, attrs); }
    public CircleView (Context context, AttributeSet attrs, int defStyle) { super(context, attrs, defStyle); }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.LTGRAY);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        paint.setAntiAlias(true);
        canvas.drawCircle(300,200,100, paint);
    }
}
