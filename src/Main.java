import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first midterm grade: ");
        double first_midterm_grade = scanner.nextDouble();
        System.out.print("Please enter your second midterm grade: ");
        double second_midterm_grade = scanner.nextDouble();
        System.out.print("Please enter your final grade: ");
        double final_grade = scanner.nextDouble();

        double calculation = ((first_midterm_grade * 30) / 100) + ((second_midterm_grade * 30) / 100) +
                ((final_grade * 40) / 100);


        if (calculation > 90 && calculation <= 100){
            System.out.println("Your Grade : AA");
        }
        else if (calculation > 85 && calculation <= 89){
            System.out.println("Your Grade : BA");
        }
        else if (calculation > 80 && calculation <= 84){
            System.out.println("Your Grade : BB");
        }
        else if (calculation > 75 && calculation <= 79){
            System.out.println("Your Grade : CB");
        }
        else if (calculation > 70 && calculation <= 74){
            System.out.println("Your Grade : CC");
        }
        else if (calculation > 64 && calculation <= 69){
            System.out.println("Your Grade : DC");
        }
        else if (calculation > 60 && calculation <= 64){
            System.out.println("Your Grade : DD");
        }
        else{
            System.out.println("Failed The Lesson");
        }



    }
}