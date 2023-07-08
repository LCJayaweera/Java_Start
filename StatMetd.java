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

public static void show1(Mobile obj){
    System.out.println(obj.brand+" : "+obj.price+" : "+useCountry);
}




}



public class StatMetd {

public static void main(String a[]){

Mobile obj1 = new Mobile();
Mobile obj2 = new Mobile();
Mobile obj3 = new Mobile();




obj1.color = "Black";
obj2.color = "Red";
obj3.color = " White";



// obj1.show();
// obj2.show();
// obj3.show();


Mobile.show1(obj1);//calling static method


}


    
    
}
