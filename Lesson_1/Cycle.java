public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i < 21; i++) {
            System.out.println(i);
        }

        int j = 6;
        while(j > -7) {
            System.out.println(j);
            j -= 2;
        }

        int k = 10;
        int count = 0;
        do {
            count += k;
            k++;
        } while (k < 21);
        System.out.println(count);
    }
}