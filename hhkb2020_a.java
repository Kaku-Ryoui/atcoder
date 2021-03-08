import java.util.*;

public class hhkb2020_a{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		if(S == "Y" && T == "a"){
			System.out.println("A");
		}else if( S == "Y"&&  T == "b"){
			System.out.println("B");
		}else if( S == "Y"&& T == "c"){
			System.out.println("C");
		}else{
			System.out.println(T);
	}
}
