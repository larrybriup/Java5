package com.briup.enumeration;

public class MoveTest {
	
	public void move(Move move) {
		switch (move) {
		case forward:
			System.out.println("前进!");
			break;
		case goBack:
			System.out.println("后退!");
			break;
		case turnRight:
			System.out.println("向右!");
			break;
		case turnLeft:
			System.out.println("向左!");
			break;
			default:
				System.out.println("别动!");
				
				break;
		}
	}
	public static void main(String[] args) {
		MoveTest mt = new MoveTest();
		mt.move(Move.turnRight);
		//java 1.7新特性
		/*String str = "test";
		switch (str) {
		case "test":
			System.out.println("test");
			break;

		default:
			System.exit(0);
			break;
		}*/
	}
}

enum Move {
	forward, goBack, turnRight, turnLeft
}