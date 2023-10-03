import java.util.Scanner;

public class Main {
    public String solution(String str){
        String[] list = str.split(" ");
        String answer = "";
        int left = 0;
        int right = list.length -1;
        while(left <= right) {
            int left_len = list[left].length();
            int right_len = list[right].length();
            int answer_len = answer.length();
            if (left_len >= right_len && left_len > answer_len) {
                answer = list[left];
                left++;
                right--;
            }
            else if (right_len >= left_len && right_len > answer_len) {
                answer = list[right];
                left++;
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(m.solution(str));
    }
}