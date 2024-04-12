package Polymorphism;

//import java.lang.reflect.Method;

public class MethodOverloading {
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public void add(int d,int e,int f){
        int g=d+e+f;
        System.out.println(g);
    }

    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        m.add(1,2);
        m.add(3,4,34);
    }
}
