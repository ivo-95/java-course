package homework9_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Task9_5_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		String input = null;
		Stack<String> stack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>();
		int num1 = 0, num2 = 0;
		
		System.out.print("Enter string: ");
		input = sc.nextLine();
		if ((input = validateInput(input)) == null) {
			sc.close();
			return;
		}
		
		for (int i = 0; i < input.length(); i++) {
			queue.offer(Character.toString(input.charAt(i)));
			i++;
		}
		
		for (int i = 1; i < input.length(); i++) {
			stack.push(Character.toString(input.charAt(i)));
			i++;
		}

		while (!stack.isEmpty()) {
			if (stack.pop().equals("+")) {
				num1 = Integer.parseInt(queue.poll());
				num2 = Integer.parseInt(queue.poll());
				queue.offer(Integer.toString(num1 + num2));
			} else {
				num1 = Integer.parseInt(queue.poll());
				num2 = Integer.parseInt(queue.poll());
				queue.offer(Integer.toString(num1 - num2));
			}
		}
		
		System.out.println("Result: " + queue.poll());
		sc.close();
	}

	public static String validateInput(String input) {
		input = input.replaceAll("\\s+","");
		if (input.length() % 2 == 0) {
			return null;
		}
		for (int i = 0; i < input.length(); i++) {
			if (i == 0) {
				if (!Character.isDigit(input.charAt(i))) {
					return null;
				}
			} else if (i % 2 == 0) {
				if (!Character.isDigit(input.charAt(i))) {
					return null;
				}
			} else if (i % 2 != 0) {
				if (input.charAt(i) != '+' && input.charAt(i) != '-') {
					return null;
				}
			}
		}
		return input;
	}
}
