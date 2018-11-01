package com.tanzania.hemmy.firstgames;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Environment;
import android.widget.Button;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class CharactorSprite {
    private Bitmap bitmap;
    int x, y;
    int w, s;
    int z, p;
    Button button;
    private  int xVelocity = 10, yVelocity = 5;
    private  int wVelocity = 12, sVelocity = 5;
    private  int zVelocity = 13, pVelocity = 5;
    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;
    public CharactorSprite(Bitmap bitmap) {
        this.bitmap = bitmap;
        x = 10;
        y = 20;
        w = 50;
        s = 25;
        z = 60;
        p = 35;
    }

    public void draw(Canvas canvas){

        int number = 7;
        int intervalX = (screenWidth / number) - 10;

        int intervalY = screenHeight / 12;

        int intervalx2 = x;
        int i = 2;

        String company_name = "M-SAFARI COMPANY";

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText(company_name,(screenWidth /2) - 100, 50, paint);
        canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap,intervalX,intervalY,false),x,y, null);
        canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap,intervalX,intervalY,false),w,s, null);
        canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap,intervalX,intervalY,false),z,p, null);
    }

    public void update() {

        x+=xVelocity;
        y+=yVelocity;
        if((x > screenWidth - bitmap.getWidth()) || (x < 0)){
            xVelocity = xVelocity * -1;
        }
        if((y > screenHeight - bitmap.getHeight()) || (y < 0)){
            yVelocity = yVelocity * -1;
        }

        w+=wVelocity;
        s+=sVelocity;
        if((w > screenWidth - bitmap.getWidth()) || (w < 0)){
            wVelocity = wVelocity * -1;
        }
        if((s > screenHeight - bitmap.getHeight()) || (s < 0)){
            sVelocity = sVelocity * -1;
        }


        z+=zVelocity;
        p+=pVelocity;
        if((z > screenWidth - bitmap.getWidth()) || (z < 0)){
            zVelocity = zVelocity * -1;
        }
        if((p > screenHeight - bitmap.getHeight()) || (p < 0)){
            pVelocity = pVelocity * -1;
        }
    }
}
