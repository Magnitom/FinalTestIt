public class Rectangle extends Figure {

    private int length = 6;
    private int width = 6;

    @Override
    int area() {
        return length * width;
    }

    @Override
    int perimeter() {
        return (length + width) *2;
    }

    boolean thisSquare (int length, int width){
        if (length == width){
            return true;
        } else {
            return false;
        }
    }

}
