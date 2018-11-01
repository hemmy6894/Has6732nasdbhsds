package com.tanzania.hemmy.firstgames.GridLayout;

public class Seat {
    int imageView;
    String labelView;
    String seatPrice;
    boolean isVisible;
    int visiblity;

    public Seat(int imageView, String labelView, int visiblity) {
        this.imageView = imageView;
        this.labelView = labelView;
        this.visiblity = visiblity;
    }

    public int getImageView() {
        return imageView;
    }

    public String getLabelView() {
        return labelView;
    }

    public int getVisiblity() {
        return visiblity;
    }
}
