package net.codingme.paseHTML;

import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

/** 
* 
* 功能概述：    HTML格式化的功能
* @author NiuJinpeng(codingme.net)
* @data   2017年3月24日 下午1:48:59
*/
public class HTMLFormat {
	//常用HTML标签集
	public static void main(String[] args) {
		StringBuffer sBuffer=new StringBuffer("<div class='header'> 			<p class='codingmeTitle'>业精于勤，荒于嬉；行成于思，毁于随</p> 			<nav class='navbar navbar-default navbar-static-top' 				role='navigation'> 				<div class='container-fluid'> 					<div class='navbar-header'> 						<button type='button' class='navbar-toggle' data-toggle='collapse' 							data-target='#example-navbar-collapse'> 							<span class='sr-only'>切换导航</span> <span class='icon-bar'></span> 							<span class='icon-bar'></span> <span class='icon-bar'></span> 						</button> 						 					</div> 					<div class='collapse navbar-collapse' id='example-navbar-collapse'> 						<ul class='nav navbar-nav'> 							<li role='presentation' class='active'><a 								href='/'>Codingme.net</a></li> 							<li role='presentation'><a 								href='/archives'>归档</a></li> 							<li role='presentation'><a 								href='/tags'>标签</a></li> 							<li role='presentation'><a href='#'>工具</a></li> 							<li role='presentation'><a href='#'>关于</a></li> 						</ul> 						<form class='navbar-form navbar-right' method ='post' accept-charset='UTF-8' 							action='/search.html'> 							<div class='form-group'> 								<input type='text' name='keyword' class='form-control' 									style='width: 300px;' placeholder='KeyWord'></input> 							</div> 							<button type='submit' class='btn btn-primary'>搜一搜</button> 						</form> 					</div> 				</div> 			</nav>       </div>");
//		StringBuffer sBuffer=new StringBuffer("<html> <body> <div> <p> 123 </p> </div> </body> </html>");
		ArrayList<HTMLTag> arrayList = parseHTMLTAG(sBuffer);
		for (HTMLTag htmlTag : arrayList) {
			for (int i=0;i<htmlTag.getLevel();i++) {
				System.out.print("   ");
			}
			System.out.println(htmlTag.getName());
		}
	}
	
	public static ArrayList<HTMLTag> parseHTMLTAG(StringBuffer sb){
		ArrayList<HTMLTag> arrayList = new ArrayList<HTMLTag>();
		//创建一个空栈
		Stack<String> stack = new Stack<String>();
		StringBuffer htmlTagBuf =new StringBuffer();
		int level=-1;
		StringTokenizer st = new StringTokenizer(sb.toString(), "<>", true);
		while(st.hasMoreTokens()){
			String str = st.nextToken();
			if("<".equals(str)){
				stack.clear();
			}
			stack.push(str);
			if(">".equals(str)){
				while(!stack.isEmpty()){
					htmlTagBuf.insert(0, stack.pop().replaceAll("[\\s+]", " "));
				}
				if(!htmlTagBuf.toString().contains("</")){
					level++;
				}
				HTMLTag htmlTag = new HTMLTag(htmlTagBuf.toString(), level);
				if(htmlTagBuf.toString().contains("</")){
					level--;
				}
				arrayList.add(htmlTag);
				htmlTagBuf.delete(0, htmlTagBuf.length());
			}
		}
		System.out.println((level == -1?"符合HTML格式":"不符合HTML格式"));
		return arrayList;
	}
}

/** 
* 
* 功能概述：
* @author NiuJinpeng(codingme.net)
* @data   2017年3月24日 下午2:32:25
*/
class HTMLTag {
	private String name;
	private int level;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public HTMLTag() {
		super();
	}
	public HTMLTag(String name, int level) {
		super();
		this.name = name;
		this.level = level;
	}
	
}
