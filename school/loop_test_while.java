public class loop_test_while {
    public static void main(String[] args) {
        int i = 0;
        while (i != 6) {
            i = (int)(6*Math.random()+1);
            System.out.println(i);
        }
    }
}