package middlewares;

import models.Operation;
import models.Request;

import java.math.BigDecimal;

public class MultiplicationMiddleware extends Middleware{
    @Override
    public BigDecimal operate(Request request) {
        if (request == null) {
            throw new NullPointerException("Request is null");
        } else if (request.getOperation().equals(Operation.Multiplication)) {
            return request.getFirstNumber().multiply(request.getSecondNumber());
        } else if(next == null){
            throw new IllegalArgumentException(
                    String.format("There is no middleware for that operation %s", request.getOperation()));
        }
        return operateNext(request);
    }
}
