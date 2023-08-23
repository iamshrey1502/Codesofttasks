import java.util.*;

public class Studentgradecalculator {
    public static float total(float num1,float num2,float num3,float num4,float num5){
        float t=num1+num2+num3+num4+num5;
        return t;
    }
    public static float avgpercentage(float num){
        float av=num/5;
        float avg=av*100/100;
        return avg;
    }
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your marks in subject 1 : ");
        float m1=scn.nextFloat();
        System.out.println("Enter your marks in subject 2 : ");
        float m2=scn.nextFloat();
        System.out.println("Enter your marks in subject 3 : ");
        float m3=scn.nextFloat();
        System.out.println("Enter your marks in subject 4 : ");
        float m4=scn.nextFloat();
        System.out.println("Enter your marks in subject 5 : ");
        float m5=scn.nextFloat();
        

        float totalmarks=total(m1,m2,m3,m4,m5);
        float averagepercentage=avgpercentage(totalmarks);

        System.out.println("Total marks of student is : "+totalmarks);
        System.out.println("Average percentage of marks of student is : "+averagepercentage);

        if(averagepercentage>=90){
            System.out.println("Grade of student is : A");
        }
        else if(averagepercentage>=75&&averagepercentage<90){
            System.out.println("Grade of student is : B");
        }
        else if(averagepercentage>=40&&averagepercentage<75){
            System.out.println("Grade of student is : C");
        }
        else{
            System.out.println("Grade of student is : D");
        }

        scn.close();

    }
}
