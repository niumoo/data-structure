package net.codingme.stack; 
/** 
* 
* 功能概述：    使用栈检测算术表达式的括号是否匹配
* @author NiuJinpeng(codingme.net)
* @data   2017年3月24日 下午1:20:18
*/
public class ParenMath {
	public static void main(String[] args) {
		String math="3 * ( 3 + 1 ) * ( 4 + 1 )";
		String[] mathSplit = math.split(" ");
		ArrayStack arrayStack = new ArrayStack();
		
		for (String string : mathSplit) {
			if("(".equals(string)){
				arrayStack.push(string); 	//左括号入栈
			}
			if(")".equals(string)){			//遇右括号，检查栈顶是否为左括号
				if(arrayStack.top().equals("(")){
					arrayStack.pop();
				}
			}
		}
		if(arrayStack.isEmpty()){
			System.out.println("括号匹配");
		}
	}
}
