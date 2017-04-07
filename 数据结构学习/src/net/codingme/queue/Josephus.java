package net.codingme.queue;

/**
 * 
 * 功能概述： Josephus环的问题，n个人围城一圈，从第一个人开始数，第k个数到的人出局，继续数，循环数，第k个人出局。。
 * 
 * @author NiuJinpeng(codingme.net)
 * @data 2017年3月24日 下午9:46:09
 */
public class Josephus {
	public static void main(String[] args) {
		ArrayQueue arrayQueue = new ArrayQueue(10);
		arrayQueue.enQueue("niujinpeng");
		arrayQueue.enQueue("laosiji");
		arrayQueue.enQueue("xujun");
		arrayQueue.enQueue("shentao");
		arrayQueue.enQueue("yangang");
		arrayQueue.enQueue("zhuzhongwei");

		String survivalKid = outKid(arrayQueue, 3);
		System.out.println("存活：" + survivalKid);

	}
	
	
	public static String outKid(ArrayQueue arrayQueue, int k) {
		while (arrayQueue.getSize() != 1) {
			for (int i = 0; i < k - 1; i++) {
				arrayQueue.enQueue(arrayQueue.delQueue());
			}
			String kid = (String) arrayQueue.delQueue();
			System.out.println(kid + " out!");
		}
		return (String) arrayQueue.front();
	}

}
