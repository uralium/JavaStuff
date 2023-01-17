public class probe_pr_3 {
    public static void main(String[] args) {
        int i = 1;
        {
            int j = 4;
            System.out.println(i + j);

            i = 7;
            System.out.println(i);
        }
        System.out.println(i);
    }
}