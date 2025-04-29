public class Grading {
    public static void main(String[] args) {
        int marks = 60;

        if(marks >= 80){
            System.out.println("GRADE: A");
        }
        else if(marks >= 70){
            System.out.println("GRADE: B");
        }
        else if(marks >= 60){
            System.out.println("GRADE: C");
        }
        else if(marks >= 50){
            System.out.println("GRADE: D");
        }
        else{
            System.out.println("You have failed");
        }
    }
    
}
