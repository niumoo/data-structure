package net.codingme.queue; 
/** 
* 
* 功能概述：    队列空异常
* @author NiuJinpeng(codingme.net)
* @data   2017年3月24日 下午4:32:17
*/
public class ExceptionQueneuEmpty extends RuntimeException{
	public ExceptionQueneuEmpty(String err){
		super(err);
	}
}
