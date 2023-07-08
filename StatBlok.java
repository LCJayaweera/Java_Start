class Mobile{
    String brand;
    int price;
    String color;
    static String useCountry;

public Mobile(){
    brand="dddddd";
    price=200;
    System.out.println("In Constructor");
}


static{
    useCountry="India";
    System.out.println("In static Block");
}

public void show(){

 System.out.println(brand+ " : " + price+" : " + color+" : "+useCountry);
   } 

}



public class StatBlok {

public static void main(String a[]){

// Mobile obj1 = new Mobile();
// Mobile obj2 = new Mobile();
// Mobile obj3 = new Mobile();




// obj1.color = "Black";
// obj2.color = "Red";
// obj3.color = " White";



// obj1.show();
// obj2.show();
// obj3.show();

Class.forName("Mobile");//get error
}


    
    
}
