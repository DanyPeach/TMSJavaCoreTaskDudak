package by.TMS_Dudak.Lesson7OOP;

public class ShapeApp {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 1, 3);
        Rectangle rectangle = new Rectangle("yellow", 4, 6);

        Shape[] shapes={circle, rectangle};

        for(int i = 0; i< shapes.length; i++){
            shapes[i].draw();
        }
    }
}
