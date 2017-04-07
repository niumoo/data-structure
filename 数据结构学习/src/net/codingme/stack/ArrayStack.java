package net.codingme.stack;

/**
 * 
 * 功能概述： 用数组实现栈功能
 * 
 * @author NiuJinpeng(codingme.net)
 * @data 2017年3月23日 下午8:51:28
 */
public class ArrayStack implements InterStack {

	public static final int INIT_SIZE = 10; // 数组栈默认容量
	private int size; // 数组栈实际容量
	private Object[] arrayStack; // 定义数组栈
	private int top = -1; // 栈顶当前位置

	//构造方法，构造一个空数组栈
	public ArrayStack() {
		this.size = INIT_SIZE;
		arrayStack = new Object[INIT_SIZE];
	}

	// 构造方法，构造一个指定大小的栈
	public ArrayStack(int size) {
		this.size = size; // 设置数组栈容量
		arrayStack = new Object[size];
	}

	// 获取栈顶元素
	@Override
	public Object top()  throws ExceptionStackEmpty{
		if (isEmpty()) {
			throw new ExceptionStackEmpty("异常：栈空");
		}
		return arrayStack[top];
	}

	//出栈
	@Override
	public Object pop() throws ExceptionStackEmpty{
		if (isEmpty()) {
			throw new ExceptionStackEmpty("异常：栈空");
		}
		Object temp;
		temp = arrayStack[top];
		arrayStack[top--] = null;
		return temp;
	}

	// 入栈
	@Override
	public void push(Object obj)throws ExceptionStackFull {
		if (getSize() == size) {
			throw new ExceptionStackFull("异常：栈溢出");
		}
		arrayStack[++top] = obj;
	}

	// 判断栈当前大小
	@Override
	public int getSize() {
		return top + 1;
	}

	// 判断栈是否为空
	@Override
	public boolean isEmpty() {
		return (top < 0);
	}

}
