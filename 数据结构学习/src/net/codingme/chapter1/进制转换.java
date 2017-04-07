package net.codingme.chapter1;

/**
 * 
 * 功能概述：进制转换 给定一个十进制，将其转换成三进制
 * 
 * @author NiuJinpeng
 * @data 2017年3月17日 下午8:08:44
 */
public class 进制转换 {
	public static void main(String[] args) {
		baseConversion(2, 255);
	}

	/**
	 * 十进制转换成base进制，输出的数位为从低到高。
	 * @param base 目标进制
	 * @param num  十进制数字
	 */
	public static void baseConversion(int base, int num) {
		if (num == 0)
			return;
		System.out.print(num % base);
		baseConversion(base, num / base);
	}

}
