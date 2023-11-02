package task_2;

import java.util.Scanner;

public class Student_grade_Calculator {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter marks obatained in English");
		int english=s.nextInt();
		System.out.println("Enter marks obatained in Mathematics");
		int maths=s.nextInt();
		System.out.println("Enter marks obatained in Physics");
		int physics=s.nextInt();
		System.out.println("Enter marks obatained in Chemistry");
		int chemistry=s.nextInt();
		System.out.println("Enter marks obatained in Computer");
		int computer=s.nextInt();
		int totalmarks=english+maths+physics+chemistry+computer;
		double avg_percentage=totalmarks/5;
		String grade="";
		if (avg_percentage>40&& avg_percentage<=60) {
			grade="D";
		}else if (avg_percentage<=40){
			grade="Faill";
		}else if (avg_percentage>60&& avg_percentage<=75){
			grade="C";
		} else if (avg_percentage>75&& avg_percentage<=90){
			grade="B";
		}else {
			grade="A";
		}
		System.out.println("Total Marks is :"+totalmarks);
		System.out.println("Average Percentage is :"+avg_percentage+"%");
		System.out.println("Grade is "+grade);
		System.out.println("\n\n");
		System.out.println("The Grade is calculated based on Average Percentage as Follows \n 91 - 100 = A \n"
				+ " 76 - 90 = B \n 61 - 75 = C \n 41 - 60 = D \n Below 40 is Faill ");
	}

}
