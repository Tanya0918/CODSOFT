import java.util.Scanner;

public class gradeCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks of all subjects (out of 100): ");
        System.out.print("Hindi: ");
        int hindi= input.nextInt();
        System.out.print("English: ");
        int eng= input.nextInt();
        System.out.print("Math: ");
        int math= input.nextInt();
        System.out.print("Physics: ");
        int phy= input.nextInt();
        System.out.print("Chemistry: ");
        int chem= input.nextInt();

        int sum = hindi + eng + math + phy + chem;
        float avg_perc= sum/5;

        System.out.println("\nYour Result: ");
        System.out.println("\nTotal marks: " + sum + "\nAverage Percentage: " + avg_perc + "\n");
        
        if(avg_perc>90){
            System.out.println("Grade A");
        }
        else if(avg_perc>75){
            System.out.println("Grade B");
        }
        else if(avg_perc>50){
            System.out.println("Grade C");
        }
        else if(avg_perc>35){
        System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }

    }

}
