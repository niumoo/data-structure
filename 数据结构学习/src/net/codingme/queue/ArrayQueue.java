package net.codingme.queue;

/**
 * 
 * 功能概述： 使用数组实现队列ADT
 * 长度只能为size-1;不然则出现队头和队尾相等，不能判断是队满还是队空
 * @author NiuJinpeng(codingme.net)
 * @data 2017年3月24日 下午4:52:21
 */
public class ArrayQueue implements InterQueue {
	private Object[] arrayQuenue;
	private int size;
	private int front = 0;
	private int rear = 0;

	// 构造方法初始化队列
	public ArrayQueue() {
		this.size = 10;
		arrayQuenue = new Object[size];
	}

	// 构造方法初始化队列，size为队列长度
	public ArrayQueue(int size) {
		this.size = size;
		arrayQuenue = new Object[size];
	}

	// 当前队列长度
	@Override
	public int getSize() {
		return (size - front + rear) % size;
	}

	// 队列是否为空
	@Override
	public boolean isEmpty() {
		return front == rear;
	}

	//获取队列头，不删除元素
	@Override
	public Object front() throws ExceptionQueneuEmpty {
		if(isEmpty()){
			throw new ExceptionQueneuEmpty("队列：队空");
		}
		return arrayQuenue[front];
	}

	//出队
	@Override
	public Object delQueue() throws ExceptionQueneuEmpty {
		if(isEmpty()){
			throw new ExceptionQueneuEmpty("队列：队空");
		}
		Object temp=arrayQuenue[front];
		arrayQuenue[front] = null;
		front = (front+1)%size;
		return temp;
	}

	//入队
	@Override
	public void enQueue(Object obj) throws ExceptionQueneuFull {
		if(getSize()+1==size ){
			throw new ExceptionQueneuFull("队列：队满");
		}
		arrayQuenue[rear] = obj;
		rear = (rear +1)%size;
	}

	@Override
	public void loop() {

	}

}
