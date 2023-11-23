import middlewares.*;
import models.Operation;
import models.Request;

import java.math.BigDecimal;

public class Calculator {
    public static void main(String[] args) {

        //testAll
        Middleware middleware = Middleware.
                link(new AddingMiddleware(), new SubtractionMiddleware(),
                        new DividingMiddleware(), new MultiplicationMiddleware());

        Request adding = new Request(Operation.Adding, BigDecimal.valueOf(12.25), BigDecimal.valueOf(324.36));

        Request subtraction = new Request(Operation.Subtraction, BigDecimal.valueOf(35.36), BigDecimal.valueOf(56.6));

        Request multiplication = new Request(Operation.Multiplication, BigDecimal.valueOf(546.45), BigDecimal.valueOf(45.457));

        Request dividing = new Request(Operation.Dividing, BigDecimal.valueOf(7.45), BigDecimal.valueOf(3.456));


        System.out.printf("Adding with request: %s -> %s\n", adding, middleware.operate(adding));

        System.out.printf("Subtraction with request: %s -> %s\n", subtraction, middleware.operate(subtraction));

        System.out.printf("Multiplication with request: %s -> %s\n", multiplication, middleware.operate(multiplication));

        System.out.printf("Dividing with request: %s -> %s\n", dividing, middleware.operate(dividing));

    }
}
