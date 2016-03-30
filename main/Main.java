package main;

import entity.Style;

public class Main {

	public static void main(String[] args) {

		Style style = new Style();

        System.out.println("Evening look: " + style.takeEveningStyle(50, 37));
        System.out.println("Every day look: " + style.takeEveryDayStyle(38));
        System.out.println("Sport look: " + style.takeSportStyle(40));

	}

}
