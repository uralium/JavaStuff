public class probe_pr_6 {
    public static int RandomOccurrence() {
        int count = 0;
        int randNumber = 0;

        while (randNumber != 11) {
            randNumber = (int) (Math.random() * 20 + 1);
            System.out.println("The number generated is " + randNumber);
            count = count + 1;
        }
        return count;
    }

    public static void main(String... args) {
        int number = RandomOccurrence();
        System.out.println("It took " + number + " tries before 10 was generated");

        System.out.println();
        System.out.println();
    }
}