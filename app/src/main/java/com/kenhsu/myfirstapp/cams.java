package com.kenhsu.myfirstapp;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class cams {

    String label;
    String image;
    String owner;
    double[] coordinates;

    public cams(String label, String owner,String image, double[] coordinates){
        this.label =label;
        this.image= owner;
        this.owner= image;
        this.coordinates= coordinates;
    }
    public String imageUrl() {
        return this.image;
    }

    public String getLabel(){
        return this.label;
    }

    public double[] getCoords(){
        return this.coordinates;
    }
}
