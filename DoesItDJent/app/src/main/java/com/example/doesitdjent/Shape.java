package com.example.doesitdjent;

abstract class Shape {
    private int x;
    private int y;
    private String Color = "Orange";

    void Shape(int x, int y, String Color) {
        this.x = x;
        this.y = y;
        this.Color = Color;
    }

    void SetColor(String Color) {
        this.Color = Color;
    }


    void SetX(int x) {
        this.x = x;
    }


    void SetY(int y) {
        this.y = y;
    }


    int GetY() {
        return this.y;
    }

    int GetX() {
        return this.x;
    }

    String GetColor() {
        return this.Color;
    }
}
