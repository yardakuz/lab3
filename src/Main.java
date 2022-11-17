import functions.*;
public class Main {
    public static void main(String[] args) {


        LinkedListTabulatedFunction points = new LinkedListTabulatedFunction(0, 5, 2);
        FunctionPoint point = new FunctionPoint(5, 0);
        try {
            points.addPoint(point);
        } catch (InappropriateFunctionPointException e) {
             e.printStackTrace();
        }
        points.print();
    }
}