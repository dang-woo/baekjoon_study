import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // n의 갯수를 결정해주는 변수
        int nums = sc.nextInt();
        // 변수 m  : n들 3개의 합이  이 숫자보다 크면 안됌
        int m = sc.nextInt();

        // numbers: n 들의 리스트
        List<Integer> numbers = new ArrayList<>();

        // n들을 nums 의 횟수만큼 입력해준다.
        for (int i = 1; i <= nums; i++) {
            //입력한 n을 넘버즈 리스트에 저장
            numbers.add(sc.nextInt());
        }

        //모든 수를 비교해준다 (3개의 카도 조합을 찾기 위해)

        //최대 합 을 저장할 변수
        int sum = 0;



//        System.out.println(nums - 2);
        //첫 번째  카드 선택, -2 까지 반복하는 이유는 첫번째 카드를 선택하고 남은 카드중 2개를 더 선택해야하기 때문
        for (int i = 0; i < nums - 2; i++) {
//            System.out.println("첫번째카드 : " + numbers.get(i));
            //위에 와 마찬가지로 2번째 카드를 고르는 반복문 -1 도 3번째 카드를 선택해야되니까
            for (int j = i + 1; j < nums - 1; j++) {
//                System.out.println("두번째카드 : " + numbers.get(j));

                for (int k = j + 1; k < nums; k++) {
//                    System.out.println("세번째카드 : " + numbers.get(k));

                        //1,2,3번의 카드들을 모두 더해준다
                        int currentSum = numbers.get(i) + numbers.get(j) + numbers.get(k);

                        //m보다 작거나 같고 sum보다 큰 경우 sum 변수에 저장
                        if (currentSum <= m && currentSum > sum) {
                            sum = currentSum;
                        }
                    }
                }
            }
        System.out.println(sum);

        }


    }

