public class tugas3_perulangan {

    public static void main(String[] args) {
        int a = 5;
        for (int i = 1; i <= a; i++){
            for (int x = 4; x >= i; x--) {
                System.out.print(' ');
            }
            for (int y = 1; y <= i; y++){
                System.out.print('*');
            }
            for (int z = 1; z <= i - 1; z++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
