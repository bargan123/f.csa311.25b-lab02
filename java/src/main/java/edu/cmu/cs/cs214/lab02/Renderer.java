package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    // draw одоо бүх дүрсийг үүсгэх боломжтой.
    public void draw(Shape shape) {
        double area = shape.getArea();
        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
