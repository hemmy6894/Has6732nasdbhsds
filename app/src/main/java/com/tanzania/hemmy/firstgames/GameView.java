package com.tanzania.hemmy.firstgames;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.annotation.MainThread;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.SurfaceHolder;
import android.view.View;

public class GameView extends SurfaceView implements SurfaceHolder.Callback, View.OnTouchListener {
    private MainThreadMy thread;

    private CharactorSprite charactorSprite;
    public GameView(Context context){
        super(context);
        getHolder().addCallback(this);
        thread = new MainThreadMy(getHolder(), this);
        setFocusable(true);
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        charactorSprite = new CharactorSprite(BitmapFactory.decodeResource(getResources(),R.mipmap.seat_taken));
        thread.startRunning(true);
        thread.start();
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            boolean retry = true;
            while (true){
                try {
                    thread.startRunning(false);
                    thread.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                retry = false;
            }
    }

    public void update(){
        charactorSprite.update();
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if(canvas != null){
            charactorSprite.draw(canvas);
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
