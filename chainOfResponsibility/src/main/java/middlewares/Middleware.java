package middlewares;

import models.Request;

import java.math.BigDecimal;

public abstract class Middleware {
    protected Middleware next;

    public Middleware() {
    }

    public static Middleware link(Middleware start, Middleware... others) {
        Middleware first = start;
        for (Middleware middleware : others) {
            first.next = middleware;
            first = middleware;
        }
        return start;
    }

    public abstract BigDecimal operate(Request request);

    protected BigDecimal operateNext(Request request) {
        return next.operate(request);
    }
}