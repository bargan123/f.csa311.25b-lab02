package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        // Өмнө нь Renderer зөвхөн тэгш өнцөгттэй ажиллаж болох байсныг засаж ямар ч 
        // ажиллах боломжтой болгосон.
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(4);
        Shape square = new Square(5);

        Renderer renderer = new Renderer();
        
        renderer.draw(rectangle);
        renderer.draw(circle);
        renderer.draw(square);
    }
}
