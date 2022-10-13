//MUHAMMAD RIZALDY ALIFIANSYAH - F - TUGAS PBO

import java.util.Scanner; // Ini adalah contoh comment

public class Main { // Main Program
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[][] matriksA; //Matriks A
        int[][] matriksB; //Matriks B
        int[][] matriksC; //Matriks C

        int baris; // Tipe Data
        int kolom; // Tipe Data
        char pilih; // Tipe Data


        do{ // Perulangan  Do While
            System.out.println("=====Program Menghitung Perkalian Dua Buah Matriks====="); // Input
            System.out.print("Masukkan Jumlah Baris Matriks : ");
            baris = input.nextInt();

            System.out.print("Masukkan Jumlah Baris Kolom : "); // Variabel utk menginputkan data jumlah baris
            kolom = input.nextInt();

            System.out.println();

            matriksA = new int[baris][kolom]; // Array Multi Dimensi
            matriksB = new int[baris][kolom];
            matriksC = new int[baris][kolom];

            // Array Satu Dimensi
            System.out.println("Elemen Matriks A");
            for(int i=0; i<baris; i++){ // Perulangan For
                for(int j=0; j<kolom; j++){
                    System.out.print("Matriks A ["+i+"]["+j+"] = ");
                    int isimatriks = input.nextInt();

                    matriksA[i][j] = isimatriks;
                }
            }
            System.out.println("\n");
            //Input Matriks B
            System.out.println("Elemen Matriks B");
            for(int i=0; i<baris; i++){
                for(int j=0; j<kolom; j++){
                    System.out.print("Matriks B ["+i+"]["+j+"] = ");
                    int isimatriks = input.nextInt();

                    matriksB[i][j] = isimatriks;
                }
            }
            //Hitung Perkalian Matriks A dan B
            for(int i = 0; i<baris; i++){
                for(int j = 0; j<kolom; j++){
                    matriksC[i][j] = matriksA[i][j] * matriksB[i][j]; // Proses perkalian antara matriks A dengan matriks B
                }
            }

            System.out.println("\n");
            // Output Program
            // Tampilkan hasil Perkalian
            System.out.println("Hasil Perkalian Matriks A dengan matriks B: ");
            for (int i = 0; i<baris; i++){
                for(int j = 0; j<kolom; j++){
                    System.out.print(matriksC[i][j]+"  ");
                }
                System.out.println();
            }

            System.out.println();
            System.out.print("Apakah Anda Ingin Mengulang Program ? Y/N : ");
            pilih = input.next().charAt(0);

            if(pilih == 'N'){ // Penggunaan IF
                System.out.println(" ");
                System.out.println("===== Program Selesai Terimakasih :) =====");
            }



        }while(pilih == 'Y'); // Perulangan While
    }
}
