package hashTag;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class HashTagImpl implements HashTag {
    @Override
    public List<Result> hashTag(List<String> str) {
        Objects.requireNonNull(str);
        return str.stream()
                .flatMap(it -> Arrays.stream(it.split(" ")).filter(to -> to.startsWith("#"))
                        .distinct())
                .collect(Collectors.groupingBy(it -> it, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .map(ti -> new Result(ti.getKey(), ti.getValue().intValue()))
                .collect(Collectors.toList());
    }
}
