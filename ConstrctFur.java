
class Human{
    private String name;
    private int age;

// public Human(){     // This is the default constructor but we donot init,it is automatically add

// }

public Human(){
name ="Lakshan";
age=12;
}
public Human(int age, String name){
    this.name=name;
    this.age = age;
}


public void setAge(int age){
    this.age=age;
}

public void setName(String name){
    this.name=name;
}


public int getAge(){
    return age;
}

public String getName(){
    return name;
}


}


public class ConstrctFur {
public static void main(String a[]){
Human person = new Human();
System.out.println(person.getAge()+" : "+person.getName());

Human person2 = new Human(34,"Chathuranga");
System.out.println(person2.getAge()+" : "+person2.getName());



} 
}
