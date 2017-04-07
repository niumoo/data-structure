package net.codingme.stack;

/**
 * 功能概述： 栈的接口，声明常用方法
 * 
 * @author NiuJinpeng(codingme.net)
 * @data 2017年3月23日 下午8:47:24
 */
public interface InterStack {

	Object top() throws ExceptionStackEmpty; // 出栈且不删除元素

	Object pop() throws ExceptionStackEmpty; // 出栈且删除元素

	void push(Object obj)throws ExceptionStackFull; // 入栈

	int getSize(); // 取栈中元素数量

	boolean isEmpty();// 栈是否空

}
