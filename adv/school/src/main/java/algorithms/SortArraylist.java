/*
create a method sort(List<Integer> numbers) that will return sorted list e.g.
sort([1,5,3,2]) -> [1,2,3,5]
*/

package algorithms;

import java.util.ArrayList;
import java.util.List;

public class SortArraylist {

    public List<Integer> sort(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 1; j < numbers.size(); j++) {
                int number = result.get(j);

                if (result.get(j - 1) > result.get(j)) {
                    result.set(j, result.get(j - 1));

                    result.set(j - 1, number);
                }
            }
        }
        return result;
    }
}
