





class Student{
    int rollNo;
    String name;
    int marks;
}




public class ForEach {
    public static void main(String a[]){
Student s1 = new Student();
s1.rollNo=1;
s1.name="Lakshan";
s1.marks=75;

Student s2 = new Student();
s2.rollNo=2;
s2.name="Anil";
s2.marks=55;


Student s3 = new Student();
s3.rollNo=1;
s3.name="Lasith";
s3.marks=95;


Student stud[] =new Student[3];

stud[0]=s1;
stud[1]=s2;
stud[2]=s3;



for(Student n:stud){ 
    System.out.println(n.name+":"+n.marks);
}



// for(int n:num){  // num array
    
// }

// for (int i = 0; i < stud.length; i++) {
//     System.out.println(stud[i].name+":"+stud[i].marks);
// }





    }
    
}
