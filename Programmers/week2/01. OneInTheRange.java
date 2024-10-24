/**
 * 커스텀 클래스 내에 1과 0으로 이루어진 배열 arr이 있을 때, 주어진 인덱스 s와 e 사이에(inclusive) 몇 개의 1이 존재하는지를 리턴하는 함수를 작성하세요.
 *
 * numOfOnes(...) 메소드는 아주 많이 호출될 수 있습니다.

 * 예제 1:
 * 입력: arr = [0, 1, 1, 0, 0, 1, 1, 1], s = 2, e = 6
 * 출력: 3
 *
 * 예제 2:
 * 입력: arr = [0, 1, 1, 0, 0, 1, 1, 1], s = 1, e = 7
 * 출력: 5
 *
 * 제약사항:
 * 2 <= arr.length <= 10^8
 * 1 <= number of numOfOnes is called <= 10^8
 * 0 <= s < e <= arr.length
 */

class OneInTheRange {
  static final int[] arr = new int[]{0, 0, 1, 0, 1}; // ex 1
  private int[] prefixSum;

  public OneInTheRange() {
      prefixSum = new int[arr.length + 1]; // 0,0,0,1,1,2
      for (int i=1; i<=arr.length; i++) {
          prefixSum[i] = prefixSum[i-1] + arr[i-1];
      }
  }

  public int numOfOnes(int s, int e) {
      return prefixSum[e+1] - prefixSum[s];
  }
}

public class OneInTheRangeExample {
  public static void main(String[] args) {
      OneInTheRange oneInTheRange = new OneInTheRange();
      int cnt = oneInTheRange.numOfOnes(2, 4);
      System.out.println(cnt);
  }
}


