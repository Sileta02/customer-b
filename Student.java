public class Student {
    public static void main(String[] args) {
        Student student_a=new Student("Edward", "06/06/2001", 23, "Kabete National Polytechnic");
        System.out.println( "Name - "+student_a.name);
        System.out.println( "Date_0f_Birth - "+student_a.Date_of_Birth );
        System.out.println("age -" + 23);
        
        student_a.learn();
    }
String name;
    String Date_of_Birth;
    int age;
    String school;
    //Constructor
    public  Student(String name, String Date_of_Birth,int age,String school){
        this.name=name;
        this.Date_of_Birth=Date_of_Birth;
        this.age=age;
        this.school=school ;
    }
        // Instantiation
        public void learn(){
    System.out.println("I'm excited to learn programmming");
    System.out.println();
    }
}

