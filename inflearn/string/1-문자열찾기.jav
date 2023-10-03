import java.util.Scanner;

public class Main {
    public int solution(String str, char t){
        int answer = 0;
        str=str.toUpperCase();
        t=Character.toUpperCase(t);
        //System.out.println(str+" "+t);

        // solution 1)
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == t) answer++; //'String.charAt(index)'로 배열처럼 index로 조회가능
        }

        // solution 2)
        for(char x : str.toCharArray()){  // str.toCharArray():  str -> array
            if(x == t ) answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb =new Scanner(System.in);
        String input1 = kb.next();
        char input2 = kb.next().charAt(0);
        //System.out.println(input1 + input2);
        System.out.print(T.solution(input1, input2));
    }
};