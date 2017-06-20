import java.util.*;

public class Recursion {
	
	public static void main(String[]args){
		System.out.println("0");
		System.out.println("1");
		recurse(0,1,2);
	}
	
	static void recurse(int num1,int num2, int count){
		int sum = num1+num2;
		System.out.println(sum);
		count++;
		if (count > 20){
			return;
		}
		
		recurse(num2, sum, count);
		
	}

}

