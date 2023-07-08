public class Strbffer {

public static void main(String a[]){
    StringBuffer sb =new StringBuffer("Lakshan");
   

    // System.out.println(sb.capacity());
    // System.out.println(sb.length());

sb.append(" Jayaweera");
sb.insert(6," Chathuranga");

 System.out.println(sb);

sb.setLength(45);

 System.out.println(sb.length());

}
    
}
