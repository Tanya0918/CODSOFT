import java.util.Scanner;

public class gradeCalc{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your marks(out of 100): ");
        System.out.println("Hindi: ");
        float hindi=input.nextFloat();
        System.out.println("English: ");
        float eng=input.nextFloat();
        System.out.println("Math: ");
        float math=input.nextFloat();
        System.out.println("Physics: ");
        float phy=input.nextFloat();
        System.out.println("Chemistry: ");
        float chem=input.nextFloat();

        float sum=hindi+eng+math+phy+chem;
        System.out.println("Total marks: "+sum);

        float avg=sum/5;
        System.out.println("Average Percentage: "+avg+"%");

        if (avg>90) {
            System.out.println("Grade A");
        } else {
            if (avg>75) {
                System.out.println("Grade B");
            } else {
                if (avg>60) {
                    System.out.println("Grade C");
                } else {
                    if (avg>45) {
                        System.out.println("Grade D");
                    } else {
                        System.out.println("Fail");
                    }
                }
            }
        }
    }
}