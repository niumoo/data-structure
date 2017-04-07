package net.codingme.stack;


import net.codingme.list.Node;

/**
 * 
 * 功能概述：使用单链表实现栈
 * 注：因为链表的长度是可以变化的，而具体长度只能通过遍历所有元素统计，所以多生命一个size变量用于在入栈和出栈的时候记录规模。
 * @author NiuJinpeng(codingme.net)
 * @data 2017年3月25日 上午9:38:11
 */
public class ListStack implements InterStack {
	private Node top;
	private int size;

	// 构造方法 空栈
	public ListStack() {
		this.top = null;
		this.size = 0;
	}

	//取栈顶
	@Override
	public Object top() throws ExceptionStackEmpty {
		if(isEmpty()){
			throw new ExceptionStackEmpty("异常：栈空");
		}
		return top.getElement();
	}

	//弹栈
	@Override
	public Node pop() throws ExceptionStackEmpty {
		if(isEmpty()){
			throw new ExceptionStackEmpty("异常：栈空");
		}
		Node temp=top;
		top = top.getNext();
		size--;
		return temp;
	}

	//入栈
	@Override
	public void push(Object obj) {
		Node node = new Node(obj, top);	//创建新节点，新节点下一个指向之前top。
		top = node;						//更新头节点
		size++;							//更新规模
	}

	//获取规模
	@Override
	public int getSize() {
		return size;
	}

	//是否为空
	@Override
	public boolean isEmpty() {
		return top==null?true:false;
	}

}
