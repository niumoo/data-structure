package net.codingme.chapter1; 
/** 
* 
* 功能概述：递归数组前n个元素和
* @author NiuJinpeng
* @data   2017年3月17日 下午8:20:35
*/
public class 递归数组前n个元素和 {
	public static void main(String[] args) {
		int []arr={1,2,3,4,5,6,7,8,9,10};
		int arraySum = arraySum(arr, 3);
		System.out.println(arraySum);
	}

	/**
	 * 递归求数组arr前n个元素的和
	 * @param arr	数组
	 * @param n		求前n个数的和
	 * @return		返回和
	 */
	public static int arraySum(int []arr,int n){
		if(n == 1){
			return arr[0];
		}
		return arraySum(arr, n-1)+arr[n-1];
	}
}
