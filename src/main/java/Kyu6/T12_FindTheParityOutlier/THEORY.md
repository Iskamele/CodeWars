### STREAM: partitioningBy() can split stream on 2 groups by boolean condition
```
Map<Boolean, List<Integer>> result = numbers.stream()
    .collect(Collectors.partitioningBy(n -> n > 3));
```
- it always returns map with true/false keys, also without elements

### STREAM: groupingBy() can group elements by any key (not only boolean)
```
List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry");
Map<Character, List<String>> result = words.stream()
    .collect(Collectors.groupingBy(word -> word.charAt(0)));
    // result = {a=[apple, apricot], b=[banana], c=[cherry]}
```
- but if there are no elements for some key, this key will not be in the result

### STREAM: teeing() can apply two different collectors to one stream and union the results
```
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
String result = numbers.stream()
    .collect(Collectors.teeing(
        Collectors.summingInt(Integer::intValue),    // first collector
        Collectors.counting(),                       // second collector
        (sum, count) -> "Sum: " + sum + ", Count: " + count  // union
    ));
    // result = "Sum: 21, Count: 6"
```
- it can collect 2 different results in one pass
- the third parameter is a function that combines the results of the two collectors
- very efficient, since only one stream is passed