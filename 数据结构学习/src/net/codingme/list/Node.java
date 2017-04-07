package net.codingme.list;


/** 
* 
* 功能概述：    链表结点
* @author NiuJinpeng(codingme.net)
* @data   2017年3月25日 上午9:29:45
*/
public class Node {
	private Object element;
	private Node next;
	
	//构造函数
	public Node(){
		this(null, null);
	}
	//构造函数
	public Node(Object info,Node top){
		this.element = info;
		this.next = top;
	}
	//获取元素内容
	public Object getElement(){
		return this.element;
	}
	//设置元素内容
	public Object setElement(Object obj){
		this.element = obj;
		return element;
	}
	//获取下一个结点
	public Node getNext(){
		return this.next;
	}
	//设置下一个结点
	public void setNext(Node next){
		this.next = next;
	}
	
	
}
