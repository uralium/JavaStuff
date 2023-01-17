public class probe_pr_4 {
    public static void main(String[] args) {
        double randomNumber = Math.random() * 10;
        while (randomNumber != 10) {
            randomNumber = Math.floor(Math.random() * 10);
            System.out.println(randomNumber);
        }
    }
}