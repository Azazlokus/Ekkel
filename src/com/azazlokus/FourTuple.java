package com.azazlokus;

public class FourTuple<A,B, C, D> extends ThreeTuple<A, B, C> {
    public final D four;

    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        four = d;
    }

    @Override
    public String toString() {
        return "FourTuple{" +
                "four=" + four +
                ", third=" + third +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
