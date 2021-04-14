/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns;

interface Shape {

    void show();
}

class ShapeFactory {

    private Shape shape ;

    public ShapeFactory(Shape shape) {
        this.shape = shape;
    }
    
    
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;  
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
    //bu methodu evezledik bir method ile
        public void getShape() {
            shape.show();
         }

  
}

class Rectangle implements Shape {

    @Override
    public void show() {
        System.out.println("Inside Rectangle show()");
    }
}

class Square implements Shape {

    @Override
    public void show() {
        System.out.println("Inside Square show()");
    }
}

public class Factory {

    public static void main(String[] args) {
        
        ShapeFactory sf = new ShapeFactory(new Rectangle());
        sf.getShape();
//        Shape s1 = sf.getShape("rectangle");
//        s1.show();
//        Shape s2 = sf.getShape("square");
//        s2.show();
    }

}
