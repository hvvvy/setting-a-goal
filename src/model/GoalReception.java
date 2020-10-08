package model;

import java.util.Scanner;

public class GoalReception {

	public String set() {
		System.out.println("100日後に達成したい目標を入力してください。");

		//入力を受け付ける
		Scanner scan = new Scanner(System.in);
		String goal = scan.nextLine();

		return goal;
	}
}
