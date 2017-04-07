package net.codingme.chapter1;

/**
 * 
 * 功能概述：使用递归实现数组的倒置
 * 
 * @author NiuJinpeng(codingme.net)
 * @data 2017年3月24日 下午12:45:19
 */
public class 数组倒置 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reverse(arr, 0, arr.length-1);
		for (int i : arr) {
			System.out.print(i+",");
		}
	}

	public static void reverse(int arr[], int start,int length) {
		if(length >start){
			int temp = arr[start];
			arr[start] = arr[length];
			arr[length] = temp;
			reverse(arr, start+1, length-1);
		}
	}
}
