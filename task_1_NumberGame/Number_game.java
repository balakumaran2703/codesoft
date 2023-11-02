package task_1;

import java.util.Scanner;

public class Number_game {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int again=0;
		do {
			System.out.println("Welcom to the Number Game!!\n");
			int random=(int) (Math.random()*101);
			int score=100;
			int attempt=5;
			System.out.println(attempt+" attempts is there.....\n");
			while (attempt-->0) {
				System.out.println("Guess the Number");
				int guess=s.nextInt();
				if (guess==random) {
					System.out.println("It's a Perfect Guessing, You have Won!!!\n");
					break;
				} else if(guess>random) {
					System.out.println(guess+" is High!! Guess Again Low Number\n");
					score-=20;
				}else {
					System.out.println(guess+" is Low!! Guess Again High Number\n");
					score-=20;
				}
			}
			if (score==0) {
				System.out.println("Sorry You Lost!!, You Almost cracked it!!!\n");
				System.out.println("The Number is :"+random);
			}
			System.out.println("Your Score is :"+score+"\n");
			System.out.println("Do you want to paly again\n 1.Yes\n 2.No\n");
			again=s.nextInt();
		} while (again==1);
		System.out.println("!!!Thank You for Participating!!!");
	}

}
