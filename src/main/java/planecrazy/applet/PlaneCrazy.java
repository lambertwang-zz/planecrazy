package planecrazy.applet;

import processing.core.PApplet;

public class PlaneCrazy extends PApplet {
    private static int window_width = 256;
    private static int window_height = 256;

    
    public static void setWindowWidth(int new_width) {
        window_width = new_width;
    }

    public static void setWindowHeight(int new_height) {
        window_height = new_height;
    }

    public static int width() {
        return window_width;
    }

    public static int height() {
        return window_height;
    }

    public void settings() {
        size(this.window_width, this.window_height);
        frameRate(60);
        smooth();
    }

    public void setup() {
        background(0);
    }

    public void draw() {
        stroke(255);
        if (mousePressed) {
            line(mouseX,mouseY,pmouseX,pmouseY);
        }
    }
}
