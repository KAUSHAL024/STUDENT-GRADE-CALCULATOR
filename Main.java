import java.util.Scanner;
 public class Main{
public static void main(String args[]){
    Scanner kb=new Scanner(System.in);
    int totalmarks=0;
    int totalsubjects;
    double averagepercentage;
    char grade;
    //input the totle number of totlesubjects
    System.out.println("Enter the totle number of subject");
    totalsubjects=kb.nextInt();
    // input the total markks of each subject and calculate the total markks
    for(int i=1;i<=totalsubjects;i++){
        System.out.println("Enter marks of subject "+i+ ": ");
        int marks=kb.nextInt();
        totalmarks=totalmarks+marks;
    }
    averagepercentage=(double)totalmarks/totalsubjects;
    //calculate the average perrcentagw
    if(averagepercentage>=90){
        grade='A';
}
    else if(averagepercentage>=80){
        grade='B';  
    }
    else if(averagepercentage>=70){
    grade='C';
    }
    else if(averagepercentage>=60){
    grade='D';
    }
    else{
        grade='f';
    }
    //output
    System.out.println("total marks : " + totalmarks);
    System.out.println("Average percentage: " + averagepercentage + "%");
    System.out.println("Grade: " + grade);
}
}