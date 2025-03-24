import java.util.*;

public class NumberContainers {
    private Map<Integer, Integer> indexToNum;
    private Map<Integer, TreeSet<Integer>> numToIndices;

    public NumberContainers() {
        indexToNum = new HashMap<>();
        numToIndices = new HashMap<>();
    }

    public void change(int index, int number) {
        if (indexToNum.containsKey(index)) {
            int prevNum = indexToNum.get(index);
            numToIndices.get(prevNum).remove(index);
        }
        indexToNum.put(index, number);
        numToIndices.putIfAbsent(number, new TreeSet<>());
        numToIndices.get(number).add(index);
    }

    public int find(int number) {
        return numToIndices.containsKey(number) && !numToIndices.get(number).isEmpty() ?
               numToIndices.get(number).first() : -1;
    }
}
