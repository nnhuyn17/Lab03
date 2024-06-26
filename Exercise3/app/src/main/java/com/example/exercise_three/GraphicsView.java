package com.example.exercise_three;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class GraphicsView extends View {
    Bitmap[] frames = new Bitmap[16];
    int i = 0;
    public GraphicsView(Context context)
    {
        super(context);
        frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable.win_5);
        frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable.win_5);
        frames[4] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[5] = BitmapFactory.decodeResource(getResources(), R.drawable.win_5);
        frames[6] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[7] = BitmapFactory.decodeResource(getResources(), R.drawable.win_5);
        frames[8] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[9] = BitmapFactory.decodeResource(getResources(), R.drawable.win_5);
        frames[10] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[11] = BitmapFactory.decodeResource(getResources(), R.drawable.win_5);
        frames[12] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[13] = BitmapFactory.decodeResource(getResources(), R.drawable.win_5);
        frames[14] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[15] = BitmapFactory.decodeResource(getResources(), R.drawable.win_5);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        if(i<16)
        {
            canvas.drawBitmap(frames[i], 40, 40, new Paint());
        }
        else {
            i = 0;
        }
        invalidate();
    }
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        i++;
        return true;
    }
}
