package net.codingme.chapter1; 
/** 
* 
* 功能概述：   请一个数的阶乘
* @author NiuJinpeng(codingme.net)
* @data   2017年3月24日 下午1:01:11
*/
public class 阶乘 {
	public static void main(String[] args) {
		
		System.out.println(jiecheng(3));
	}
	
	/**
	 * 求一个数字的阶乘
	 * @param n	请n的阶乘
	 * @return
	 */
	public static long jiecheng(long n){
		if(n<=1){
			return 1;
		}
		return n*jiecheng(n-1);
	}
}
