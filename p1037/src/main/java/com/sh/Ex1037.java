package com.sh;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1037{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //수 입력을 받는데   ----------여기까지가 혼자해서 맞았던 부분 뒤는 다 틀리고 결국 구글링

        int[] nums = new int[num]; //--쓰라니까 쓴건데 배워야지 확실히 개념을 알 거 같습니다. 대충은 알거같은

        for(int i=0; i< num;      i++){
            //  ㄴ0부터 ㄴnum까지   ㄴ1씩늘려라인데  num이 6이라치면 0부터 num보다 작을때까지 늘리면 5까지인데 0,1,2,3,4,5= 6개 이뜻인가?
            nums[i] = sc.nextInt(); //ㄴ 그래서 이줄(12라인) nums[]에 i가 들어있는 이유가(num 6이라 치면) 3    4    2 12 6 8 이걸 다 입력 받아야 돼서
            //ㄴ0번 ㄴ1번 ....   ㄴ5번 다 채워지고 6개를 만족시킬때 까지 반복해야 돼서 반복문사용?

            //최소 최대 구하는걸 찾아봤는데 결국 아래서 참고한 이방법이 가장 쉬운거 같아서 이걸로합니다.
            Arrays.sort(nums);// Arrays.sort가 배열을 오름차순으로 정렬해준다고 구글링하니까 나옵니다.
            // nums를 오름차순으로 정렬했으니
            int result = nums[0] * nums[num - 1];
            //ㄴnums 첫번째에 칸에 있는 수가 가장 작은 수 그래서 num[0], 뒤에는 뭔소린가 했는데
            // num에 들어가는 수마다 값이 바뀌고 1이 아닌 0부터 시작하니 num에서 1을 빼면 가장 뒤에 있는 칸=가장 큰 수라서?
            System.out.println(result);
            //안 돌아가는데 한계입니다. 그만하겠습니다. A 참조
        }
    }
}

