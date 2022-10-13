// MUHAMMAD RIZALDY ALIFIANSYAH - F - TUGAS PBO

#include <iostream> 
using namespace std; // Ini adalah contoh comment
int main() { // Main Program
	
  int i, j, m, n, matriks1[20][20], matriks2[20][20], hasil[20][20]; // Array Multi Dimensi
  char pilih; // Tipe Data
  
  do{
  //Input baris dan kolom
  cout<<" =====Program Menghitung Perkalian Dua Buah Matriks===== "<<endl;
  cout<<" ======================TUGAS PBO========================= "<<endl;
  cout<<" "<<endl;
  cout<<"Masukkan Jumlah Baris Matriks : "; // Variabel utk menginputkan data jumlah baris
  cin>>m;
  cout<<"Masukkan Jumlah Kolom Matriks : ";
  cin>>n;
  
  //Input Matriks A
  cout<<"Elemen Matriks A: \n";
  for(i = 0; i < m; i++){ // Perulangan For
    for(j = 0; j < n; j++){
      cin>>matriks1[i][j];
    }
  }
  
  //Input Matriks B
  cout<<"Elemen Matriks B : \n";
  for(i = 0; i < m; i++){ // Perulangan For
    for(j = 0; j < n; j++){
      cin>>matriks2[i][j]; // Mengambil Inputan
    }
  }
  // Proses Perkalian matriks
  for(i = 0; i < m; i++){
    for(j = 0; j < n; j++){
      hasil[i][j] = matriks1[i][j] * matriks2[i][j];
    }
  }
  // Output hasil Perkalian Matriks
  cout<<"Hasil Perkalian Matriks A dengan Matriks B : \n"; // Output Program
  for(i = 0; i < m; i++){ // Perulangan For
    for(j = 0; j < n; j++){
      cout<<hasil[i][j] << "\t";
    }
    cout<<endl;
  }
  // Pilihan untuk mengulang program 
  cout<<"\n\nApakah Anda Ingin Mengulang Program Y/N : ";
  cin>>pilih;
  cout<<"\n";
  
  if (pilih == 'N'){ // Perulangan IF
  	cout << "===== Program Selesai Terimakasih :) =====";
  }
  cout <<"\n---------------------------------------------\n";
}
	while(pilih == 'Y'); // Do While
  
  return 0;
}