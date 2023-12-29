package Work21.work205;

import java.util.*;

class Solution<T, K, V> {
    public Solution() {
    }

    private List<T> newArrayList(T[] elements) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, elements);
        return list;
    }

    private Set<T> newHashSet(T[] elements) {
        return new HashSet<>(Arrays.asList(elements));
    }

    private Map<K, V> newHashMap(K[] keys, V[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values should have the same length");
        }
        Map<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }
    public static void main(String[] args) {
        String[] elements={"a", "b", "c"};
        Integer[] keys={1, 2, 3};
        Solution<String, Integer, String> solution = new Solution<>();
        List<String> stringList = solution.newArrayList(elements);
        Set<String> stringSet = solution.newHashSet(elements);
        Map<Integer, String> map = solution.newHashMap(keys,elements);

        System.out.println(stringList);
        System.out.println(stringSet);
        System.out.println(map);
    }
}


