import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 낮에 올라가는 높이
        int b = sc.nextInt(); // 밤에 미끄러지는 높이
        int v = sc.nextInt(); // 목표 높이
        
        // 마지막 날 전까지 올라가야 할 높이: v-b
        // 하루에 실제 올라가는 높이: a-b 
        // 기본 일수 계산
        int day = (v - b) / (a - b);

        // 나누어떨어지지 않으면 하루 더 필요 (올림 처리)
        if ((v - b) % (a - b) != 0) {
            day = day + 1;
        }
        // 정답
        System.out.println(day);
    }
}
