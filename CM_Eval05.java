import  java.util.Scanner;
public class CM_Eval05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, huruf1, huruf2, status1, status2, matkul1 = "Algoritma dan Pemrograman", matkul2 = "Struktur Data", statusSemester;
        double tugas1, uts1, uas1, nilTotal1, nilaiAkhir;
        double tugas2, uas2, uts2, nilTotal2;
        

        System.out.println("=====INPUT DATA MAHASISWA=====");
        System.out.print("NAMA :");
        nama=sc.nextLine();
        System.out.print("NIM  :");
        nim=sc.nextLine();
        System.out.println("");
        
        System.out.println("======Mata Kuliah " + matkul1  +"======");
        System.out.print("Masukan nilai UTS :");
        uts1=sc.nextDouble();
        System.out.print("Masukan nilai UAS :");
        uas1=sc.nextDouble();
        System.out.print("Masukan nilai Tugas :");
        tugas1=sc.nextDouble();
        nilTotal1 = ((uts1*0.3) + (uas1*0.4) + (tugas1*0.3));
        System.out.println("Nilai Total Matkul ke-1 :" + nilTotal1 );
        

        if (nilTotal1 >= 80) {
            huruf1 = "A";
        }else if (nilTotal1 >= 73) {
            huruf1 = "B+"; 
        }else if (nilTotal1 >= 65) {
            huruf1 = "B"; 
        }else if (nilTotal1 >= 60) {
            huruf1 = "C+"; 
        }else if (nilTotal1 >= 50) {
            huruf1 = "C"; 
        }else if (nilTotal1 >= 39) {
            huruf1 = "D";
        }else{
            huruf1 = "E";
        }
        
         System.out.println("======Mata Kuliah " + matkul2  +"======");
        System.out.print("Masukan nilai UTS :");
        uts2=sc.nextDouble();
        System.out.print("Masukan nilai UAS :");
        uas2=sc.nextDouble();
        System.out.print("Masukan nilai Tugas :");
        tugas2=sc.nextDouble();
        nilTotal2 = ((uts2*0.3) + (uas2*0.4) + (tugas2*0.3));
        System.out.println("Nilai Total Matkul ke-2 :" + nilTotal2 );
        
        if (nilTotal2 >= 80) {
            huruf2 = "A";
        }else if (nilTotal2 >= 73) {
            huruf2 = "B+"; 
        }else if (nilTotal2 >= 65) {
            huruf2 = "B"; 
        }else if (nilTotal2 >= 60) {
            huruf2 = "C+"; 
        }else if (nilTotal2 >= 50) {
            huruf2 = "C"; 
        }else if (nilTotal2 >= 39) {
            huruf2 = "D";
        }else{
            huruf2 = "E";
        }
        
        nilTotal1 = (uts1 * 0.30) + (uas1 * 0.40) + (tugas1 * 0.30) ;
        status1 = (nilTotal1 >= 60) ? "Lulus" : "Tidak Lulus";


        nilTotal2 = (uts2 * 0.30) + (uas2 * 0.40) + (tugas2 * 0.30);
        status2 = (nilTotal2 >= 60) ? "Lulus" : "Tidak Lulus";

        
        System.out.println("");
        nilaiAkhir = (nilTotal1 + nilTotal2) / 2.0;
        

       
        

        String keteranganRataRata = String.format("(Rata-rata %.2f)", nilaiAkhir);
        
        if (status1.equalsIgnoreCase("LULUS") && status2.equalsIgnoreCase("LULUS") && nilaiAkhir > 70) {
            statusSemester = "LULUS " + keteranganRataRata;
        } else {
            statusSemester = "TIDAK LULUS " + keteranganRataRata;
        }
       
        
        System.out.println("");
        System.out.println("=====HASIL PENILAIAN NILAI AKADEMIK=====");
        System.out.println("NAMA :" + nama);
        System.out.println("NIM  :" + nim);
        System.out.println("");
        System.out.println("MATA KULIAH\t\t\t\tUTS\t\tUAS\t\tTUGAS\t\tNILAI AKHIR\t\tNILAI HURUF\t\tSTATUS");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Algoritma dan pemrograman\t\t"+uts1+"\t\t"+uas1+"\t\t"+tugas1+"\t\t  "+nilTotal1+"\t\t\t  "+huruf1+"\t\t\t"+status1);
        System.out.println("Sturuktur Data\t\t\t\t"+uts2+"\t\t"+uas2+"\t\t"+tugas2+"\t\t  "+nilTotal2+"\t\t\t  "+huruf2+"\t\t\t"+status2);
        System.out.println("");
        System.out.printf("Rata-rata nilai akhir :" +nilaiAkhir);
        System.out.println("");
        System.out.println("Status Semester " + statusSemester);


        sc.close();
        }
    }
    