public class Main {
    public static void main(String[] args) {
        //the first task
        int [] a = new int[]{1, 2, 3};
        float [] b = {1.57f, 7.654f, 9.986f};
        boolean [] c = {true, false, false, false, true};
        //the second task
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i != b.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i != c.length - 1){
                System.out.print(", ");
            }
        }
        //the third task
        System.out.println();
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        //the fourth task
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0){
                a[i]++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}