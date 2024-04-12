package MethodOverridding;

public class A {
   int a;
   int b;
    protected void add(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println(a+b);

    }
}
