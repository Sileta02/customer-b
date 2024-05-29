public class Main {

    static void checkage(int age){

        if (age<18) {
            System.out.println("Access denied .You are not old enough !");
            
        }
        else{
            System.out.println("access granted. You are old enough !");
        }
    }
    public static void main(String[] args) {
        checkage(20);
    }
}