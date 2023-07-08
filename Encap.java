class Human{
    private String name;
    private int age;

public void getAge(int a){
    age=a;
}

public void getName(String b){
    name=b;
}


public int setAge(){
    return age;
}

public String setName(){
    return name;
}


}


public class Encap {
public static void main(String a[]){
    Human person = new Human();
person.getAge(32);
person.getName("Lakshan");
    System.out.println(person.setAge()+" : "+person.setName());
}    
}
