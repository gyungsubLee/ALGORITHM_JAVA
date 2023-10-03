import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";   // Sting 데이터, 수식과 같이 더하기로 추가 가능
        // for문 돌리기
        //  1) if 소문자 판별: Character.isLowerCase(word) -> 대문자 변환: Character.toUpperCase(word);
        //  2) else 대문자 판별(Character.isUpperCase()), 위 소문자 판별을 제외하면 나머지는 대문자인 경우만 존재함. 따라서 실행 코드만 작성하면됨.
        //     -> 소문자 변환: Character.toLowerCase(word);
        for (char word : str.toCharArray()){
            if (Character.isLowerCase(word)) answer += Character.toUpperCase(word);
            else answer += Character.toLowerCase(word);
        }
        return answer;
    }
    public static void main(String[] args){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(m.solution(str));
    }
};