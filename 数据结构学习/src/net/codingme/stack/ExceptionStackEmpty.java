package net.codingme.stack; 
/** 
* 
* 功能概述：  栈空异常
* @author NiuJinpeng(codingme.net)
* @data   2017年3月23日 下午9:21:04
*/
public class ExceptionStackEmpty  extends RuntimeException{
	public ExceptionStackEmpty(String str){
		super(str);
	}
}
