
class Mobile{
    String brand;
    int price;
    String color;
    static String useCountry;

   public void show(){

    System.out.println(brand+ " : " + price+" : " + color+" : "+useCountry);
   } 

}



public class StatKeyWrd {

public static void main(String a[]){

Mobile obj1 = new Mobile();
Mobile obj2 = new Mobile();
Mobile obj3 = new Mobile();

obj1.brand = "samsung";
obj2.brand ="Apple";
obj3.brand = "Huwaei";

obj1.price =1400;
obj2.price =1200;
obj3.price =1300;

obj1.color = "Black";
obj2.color = "Red";
obj3.color = " White";

Mobile.useCountry="SriLanka";// ststic data type acees as class mebmber not as object member

obj1.show();
obj2.show();
obj3.show();
}


    
    
}
