package com.example.doesitdjent;

abstract class Shape {
    private int x;
    private int y;


    void Shape(int x, int y){
        this.x = x;
        this.y = y;

    }

    void SetX(int x){
        this.x = x;
    }


    void SetY(int y){
        this.y = y;
    }


    int GetY(){
       return this.y;
    }

    int GetX(){
        return this.x;
    }


}