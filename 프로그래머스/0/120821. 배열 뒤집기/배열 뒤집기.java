import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        // 1. int[] 배열을 Stream으로 변환 후 List<Integer>로 변경
        // .boxed()는 int를 Integer로 변환해주는 역할을 합니다.
        List<Integer> list = Arrays.stream(num_list)
                                   .boxed()
                                   .collect(Collectors.toList());

        // 2. Collections.reverse()로 리스트를 뒤집음
        Collections.reverse(list);

        // 3. 뒤집힌 List<Integer>를 다시 int[] 배열로 변환하여 반환
        // .mapToInt()는 Integer를 다시 int로 변환해주는 역할을 합니다.
        return list.stream()
                   .mapToInt(Integer::intValue)
                   .toArray();
    }
}