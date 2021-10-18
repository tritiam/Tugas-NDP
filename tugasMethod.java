public class tugasMethod {

    public static void main(String[] args) {
        welcome();
        System.out.println(halo());
        tes("Tiara", 19);
        // tes("Rara", 16);
    }

        static void welcome() {
            System.out.println("Selamat Datang!");
        }

        static String halo() {
            return "Pembuatan SIM";
        }

        static void tes(String nama, int umur) {
            if(umur>=17) {
                System.out.println(nama + ", pembuatan SIM anda akan segera diproses.");
            } else {
                System.out.println("Anda belum cukup umur");
            }
        }
    
}