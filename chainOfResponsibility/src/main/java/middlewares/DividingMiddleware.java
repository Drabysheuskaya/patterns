package middlewares;

import models.Operation;
import models.Request;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DividingMiddleware extends Middleware {

    @Override
    public BigDecimal operate(Request request) {
        if (request == null) {
            throw new NullPointerException("Request is null");
        } else if (request.getSecondNumber().equals(BigDecimal.ZERO)) {
            throw new ArithmeticException("The dividing for zero is blocked");
        } else if (request.getOperation().equals(Operation.Dividing)) {
            return request.getFirstNumber().divide(request.getSecondNumber(), 7,  RoundingMode.HALF_UP);
        } else if (next == null) {
            throw new IllegalArgumentException(
                    String.format("There is no middleware for that operation %s", request.getOperation()));
        }
        return operateNext(request);
    }
}
