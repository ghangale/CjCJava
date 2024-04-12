package MethodOverridding;

public class B extends A {
    @Override
    public void add(int x, int y) {
        this.a=x;
        this.b=y;
        System.out.println(y-x);

    }
}
