package com.azazlokus;

public class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D> {
    public final E five;

    public FiveTuple(A a, B b, C c, D d, E five) {
        super(a, b, c, d);
        this.five = five;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FiveTuple{");
        sb.append("five=").append(five);
        sb.append(", four=").append(four);
        sb.append(", third=").append(third);
        sb.append(", first=").append(first);
        sb.append(", second=").append(second);
        sb.append('}');
        return sb.toString();
    }
}
