import java.util.Scanner;

public class CM1_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tugas, uts, uas;
        String nama,nim;
        double nilaiAkhir[] = new double[2] ;
        String nilaiHuruf[] = new String[2];
        String status[] = new String[2];
        double rata[] = new double[2];

        System.out.println("======INPUT DATA MAHASISWA======");
        System.out.print("NAMA :");
        nama=sc.nextLine();
        System.out.print("NIM :");
        nim=sc.nextLine();

        String matkul[] = {"Algoritma dan Pemrograman", "Struktur Data"};

        for (int i = 1; i <= 2; i++) {
            System.out.println("____Mata kuliah " + matkul[i-1] + "____");
            System.out.print("Nilai UTS :");
            uts=sc.nextInt();
            System.out.print("Nilai UAS :");
            uas=sc.nextInt();
            System.out.print("Nilai Tugas :");
            tugas=sc.nextInt();            

            double nilaiTotal = (uts*0.3) + (uas*0.4) + (tugas*0.3);
            System.out.println("Rata-rata nilai akhir: " + nilaiTotal);

            //rata = 
                
            if (nilaiTotal >= 80) {
                nilaiAkhir[i-1] = nilaiTotal;
                nilaiHuruf[i-1]="A";
                status[i-1]="Sangat Baik";
            }else if (nilaiTotal >= 73) {
                nilaiAkhir[i-1] = nilaiTotal;
                nilaiHuruf[i-1]="B+";
                status[i-1]="Lebih dari baik";
            }else if (nilaiTotal >= 65){
                nilaiAkhir[i-1] = nilaiTotal;
                nilaiHuruf[i-1]="B";
                status[i-1]="Baik";
            }else if (nilaiTotal >= 60){
                nilaiAkhir[i-1] = nilaiTotal;
                nilaiHuruf[i-1]="C+";
                status[i-1]="Lebih dari cukup";
            }else if (nilaiTotal >= 50){
                nilaiAkhir[i-1] = nilaiTotal;
                nilaiHuruf[i-1]="C";
                status[i-1]="Cukup";
            }else if (nilaiTotal >=39){
                nilaiAkhir[i-1] = nilaiTotal;
                nilaiHuruf[i-1]="D";
                status[i-1]="Kurang";
            }else {
                nilaiAkhir[i-1] = nilaiTotal;
                nilaiHuruf[i-1]="E";
                status[i-1]="Gagal";

            }

        }
    
         System.out.println("=====HASIL PENILAIAN AKADEMIK=====");
            System.out.println("NAMA :" + nama);
            System.out.println("NIM :"+ nim);  
            double nilaiTotal = (nilaiAkhir[0] + nilaiAkhir[1]) / 2;
         System.out.println("Status Anda :" + (nilaiTotal >= 70 ? "lulus" : "tidak Lulus"));
    }
}