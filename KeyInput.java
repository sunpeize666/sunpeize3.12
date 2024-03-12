package a202195057;
/*
 * 2024년3월 12일
 * 손패택
 */

//包括输入的库
import java.util.Scanner;
public class KeyInput {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
    Scanner stdIn  = new Scanner(System.in);

    System.out.print("당신의 이름을 입력하세요 : ");
    
    
    String name = stdIn.next();
    
    
    System.out.println("안년하세요. " + name + "님 반갑습니다.");
    
	}

}
