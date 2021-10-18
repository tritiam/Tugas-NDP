import java.util.Scanner;

public class method {
  
   public static void main(String[] args) {
      Scanner nilai = new Scanner(System.in);
      System.out.println("Masukkan angka pertama");
      int value1 = nilai.nextInt();
      System.out.println("Angka pertama : "+value1);
      nilaiKedua("Masukkan angka kedua", nilai);
   }
   
   public static void nilaiKedua(String tes, Scanner nilai) {
      System.out.println(tes);
      int value2 = nilai.nextInt();
      System.out.println("Angka kedua : "+value2);
   }
   
}