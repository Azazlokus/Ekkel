package com.azazlokus;

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<String, Integer>("Two", 2);
    };
    static ThreeTuple<Vehicle, Amphibian, Integer> g(){
        return new ThreeTuple<Vehicle, Amphibian, Integer>(new Vehicle(), new Amphibian(), 9);
    }
    static FourTuple<Integer, Integer, Vehicle, String> h(){
        return new FourTuple<Integer,Integer,Vehicle, String>(1,2, new Vehicle("Vaz"), "9");
    }
    static  FiveTuple<String,String,Integer,Vehicle,Amphibian> i(){
        return new FiveTuple<>("This","is",5,new Vehicle("Tesla"), new Amphibian());
    }
    public static void main(String args[]){
        TwoTuple t2 = f();
        System.out.println(t2);
        System.out.println(g());
        System.out.println(h());
        System.out.println(i());
    }
}
