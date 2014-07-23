package edu.missouri.java;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	
	public static void main(String[] args){
		String[] tokens={"2", "1", "+", "3", "*"};
		System.out.println(evalRPN(tokens));
	}
	
	
	
	public static int evalRPN(String[] tokens) {
		
		Stack<Integer> stack=new Stack<Integer>();
		int firstNum=0;
		int secondNum=0;
		for(String t:tokens){
			if(t.matches("-?\\d+")){
				stack.push(Integer.parseInt(t));
			}
			if(t.equals("+")){
				secondNum=stack.pop();
				firstNum=stack.pop();
				stack.push(firstNum+secondNum);
			}
			if(t.equals("-")){
				secondNum=stack.pop();
				firstNum=stack.pop();
				stack.push(firstNum-secondNum);
			}
			if(t.equals("*")){
				secondNum=stack.pop();
				firstNum=stack.pop();
				stack.push(firstNum*secondNum);
			}
			if(t.equals("/")){
				secondNum=stack.pop();
				firstNum=stack.pop();
				stack.push(firstNum/secondNum);
			}
		}
		
		
		return stack.pop();

	}
}
