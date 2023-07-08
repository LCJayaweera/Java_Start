class A{


public A(){
        super();
    System.out.println("class A normal");
} 

public A(int a){
        super();
    System.out.println("Class A Pramaritize");
}

}


class B extends A{

public B(){
        super();
    System.out.println("class B normal");
} 

public B(int a){

    this();
    System.out.println("Class B Pramaritize");
}

}




public class SupssserK {

public static void main(String a[]){
    //  A obj1 = new A();
    //  B obj2 = new B();
     B obj3 = new B(23);

    
}    
    
}
