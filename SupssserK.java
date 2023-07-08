class A{


public A(){
    System.out.println("class A normal");
} 

public A(int a){
    System.out.println("Class A Pramaritize");
}

}


class B extends A{

public B(){
    System.out.println("class B normal");
} 

public B(int a){
    System.out.println("Class B Pramaritize");
}

}




public class SupssserK {

public static void main(String a[]){
     A obj1 = new A();
     B obj2 = new B();
     B obj3 = new B(23);

    
}    
    
}
