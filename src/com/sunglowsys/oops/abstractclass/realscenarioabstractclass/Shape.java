package com.sunglowsys.oops.abstractclass.realscenarioabstractclass;

abstract class Shape {
    abstract void draw();

}
class Rectangle extends Shape{
    void draw(){System.out.println("Rectangle sefely............");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle................");
    }
}
class Test{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();

    }


}
