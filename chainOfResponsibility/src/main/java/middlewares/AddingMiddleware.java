package middlewares;

import models.Operation;
import models.Request;

import java.math.BigDecimal;

public class AddingMiddleware extends Middleware {

    @Override
    public BigDecimal operate(Request request) {
        if (request == null) {
            throw new NullPointerException("Request is null");
        } else if (request.getOperation().equals(Operation.Adding)) {
            return request.getFirstNumber().add(request.getSecondNumber());
        } else if(next == null){
            throw new IllegalArgumentException(
                    String.format("There is no middleware for that operation %s", request.getOperation()));
        }
        return operateNext(request);
    }
}
