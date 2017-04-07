package net.codingme.stack; 
/** 
* 
* 功能概述：    单链表栈的测试
* @author NiuJinpeng(codingme.net)
* @data   2017年3月25日 上午9:46:25
*/
public class ListStackTest {
	public static void main(String[] args) {
		//创建单链表栈
		ListStack listStack = new ListStack();
		//入栈 1234
		listStack.push("1");
		listStack.push("2");
		listStack.push("3");
		listStack.push("4");
		//取栈顶
		System.out.println("top:"+listStack.top());
		System.out.println("pop:"+listStack.pop().getElement());
		listStack.push("5");
		System.out.println("top:"+listStack.top());
		System.out.println("pop:"+listStack.pop().getElement());
		System.out.println("pop:"+listStack.pop().getElement());
		System.out.println("pop:"+listStack.pop().getElement());
		System.out.println("pop:"+listStack.pop().getElement());
//		System.out.println("pop:"+listStack.pop().getElement());
	}
}
