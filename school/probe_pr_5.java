import java.util.stream.IntStream;

public class probe_pr_5 {
    public static void main(String[] args) {
        long count = IntStream.generate(() -> (int) (Math.random() * 20 + 1))
                .takeWhile(i -> i != 10).count();
        System.out.println(count);
    }
}