package net.codingme.stack; 
/** 
* 
* 功能概述：    数组栈测试
* @author NiuJinpeng(codingme.net)
* @data   2017年3月23日 下午9:16:52
*/
public class ArrayStackTest {
	public static void main(String[] args) {
		//创建一个10长度的数组栈
		ArrayStack arrayStack = new ArrayStack(10);
		System.out.println("栈空："+arrayStack.isEmpty());
		//入栈
		arrayStack.push(1);
		arrayStack.push(2);
		System.out.println("栈空："+arrayStack.isEmpty());
		System.out.println("个数："+arrayStack.getSize());
		System.out.println("栈顶："+arrayStack.top());
		System.out.println("出栈："+arrayStack.pop());
		System.out.println("栈顶："+arrayStack.top());
//		arrayStack.pop();
//		System.out.println("栈顶："+arrayStack.top());
		reverse();
	}
	
	/**
	 * 数组的倒置测试
	 */
	public static void reverse(){
		Integer []arr={1,2,3,4,5,6,7,8,9};
		ArrayStack arrayStack = new ArrayStack(arr.length);
		for (Integer integer : arr) {
			arrayStack.push(integer);
		}
		for(int i=0;i<arr.length;i++){
			arr[i]=(Integer)arrayStack.pop();
		}
		for (Integer integer : arr) {
			System.out.print(integer+",");
		}
	} 
}
