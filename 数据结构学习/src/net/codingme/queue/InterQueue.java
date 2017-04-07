package net.codingme.queue;

/**
 * 
 * 功能概述： 队列的接口
 * 队列特点： 先进先出，如银行排队，各种先到客户先享受服务的场合
 * 
 * @author NiuJinpeng(codingme.net)
 * @data 2017年3月24日 下午4:29:30
 */
public interface InterQueue {
	int getSize(); // 获取队列长度

	boolean isEmpty(); // 队列是否为空

	Object front() throws ExceptionQueneuEmpty; // 取队列首元素，不删除

	Object delQueue() throws ExceptionQueneuEmpty; // 出队

	void enQueue(Object obj) throws ExceptionQueneuFull; // 入队

	void loop(); // 遍历
}
