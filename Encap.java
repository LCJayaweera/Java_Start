class Human{
    private String name="Lakshan";
    private int age=32;

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

    System.out.println(person.setAge()+" : "+person.setName());
}    
}
