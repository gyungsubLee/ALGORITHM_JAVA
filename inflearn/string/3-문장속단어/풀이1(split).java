import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer="";
        int m=Integer.MIN_VALUE;
        String[] s=str.split(" ");
        for(String x : s) {
            int len=x.length();
            if (len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }
    public static void main(String[] args ){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
				// next() 작성하여 오류남.. 한줄 전체를 받아오기 위해 nextLine() 으로 작성해야함.
			  String str = sc.nextLine();          
				System.out.print(m.solution(str));
    }
}