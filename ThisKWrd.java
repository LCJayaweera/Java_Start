class Human{
    private String name;
    private int age;

public void getAge(int age){
    this.age=age;
}

public void getName(String name){
    this.name=name;
}


public int setAge(){
    return age;
}

public String setName(){
    return name;
}


}


public class ThisKWrd {
public static void main(String a[]){
    Human person = new Human();
person.getAge(32);
person.getName("Lakshan");
    System.out.println(person.setAge()+" : "+person.setName());
}    
}
