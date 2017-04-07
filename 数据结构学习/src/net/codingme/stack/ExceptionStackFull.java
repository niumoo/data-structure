package net.codingme.stack; 
/** 
* 
* 功能概述：
* @author NiuJinpeng(codingme.net)
* @data   2017年3月23日 下午9:27:47
*/
public  class ExceptionStackFull  extends RuntimeException{
	public ExceptionStackFull(String str){
		super(str);
	}
}