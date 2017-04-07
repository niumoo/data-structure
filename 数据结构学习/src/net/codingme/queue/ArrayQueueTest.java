package net.codingme.queue; 
/** 
* 
* 功能概述：    数组队列的测试
* @author NiuJinpeng(codingme.net)
* @data   2017年3月24日 下午5:17:08
*/
public class ArrayQueueTest {
	public static void main(String[] args) {
		//创建长度为4的数组队列
		ArrayQueue arrayQueue = new ArrayQueue(4);
		//入队
		arrayQueue.enQueue(1);
		arrayQueue.enQueue(2);
		arrayQueue.enQueue(3);
		System.out.println("队头："+arrayQueue.front());
		System.out.println("出队："+arrayQueue.delQueue());
		System.out.println("队头："+arrayQueue.front());
		arrayQueue.enQueue(4);
		System.out.println("长度："+arrayQueue.getSize());
//		arrayQueue.enQueue(5);
	}
}
