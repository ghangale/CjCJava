package MethodOverridding;

public class C extends B{
    @Override
    public void add(int p,int q){
        this.a=p;
        this.b=q;
        System.out.println(p*q);

    }
    public static void main(String[] args) {
        A b1=new B();
        A c=new C();
        b1.add(1,2);
        c.add(3,4);


    }
}
