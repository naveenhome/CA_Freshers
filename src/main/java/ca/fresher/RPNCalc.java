package ca.fresher;

import java.util.Stack;

public class RPNCalc {

	public String calculate(String expr) {
		String str[] = expr.split(" ");
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("+")) {
				try {

					int addValue = Integer.valueOf(stack.pop())
							+ Integer.valueOf(stack.pop());
					stack.push(Integer.toString(addValue));
				} catch (Exception ex) {
					return ex.getMessage();
				}
			} else {
				stack.push(str[i]);
				
			}

		}
		return stack.pop();
	}

}
