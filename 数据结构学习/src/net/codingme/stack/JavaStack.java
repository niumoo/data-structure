package net.codingme.stack;

import java.util.Stack;

/** 
* 
* 功能概述：    使用体验Java中封装的栈
* @author NiuJinpeng(codingme.net)
* @data   2017年3月23日 下午8:36:41
*/
public class JavaStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());
		
	}
}
