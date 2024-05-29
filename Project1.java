public class Project1 {

    static void checkage(int age){  // inserting parameter
        if (age<18) { // giving conditions of the project
            System.out.println("Access denied-you are not old enough");
            
        }
        else{
            System.out.println("Access granted - you are old enough");
        }
    }
        public static void main (String []args){
            checkage(19); //giving arguments to the project
        }
    
}
