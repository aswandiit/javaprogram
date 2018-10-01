import java.util.Scanner;


public class Source_code_string {
	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		String nama;
        String nim;
        String jurusan;
        String fakultas;
        //INISIALISASI VALUE
        nama = "aswandi";
        nim =  "D0217011";
        fakultas = "teknik";
        jurusan = "informatika";
        //OPERASI VARIABEL
        String mahasiswa;
        mahasiswa = (fakultas + "," + jurusan);
        //MENAMPILKAN HASIL
        System.out.println("Biodata Mahasiswa");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("FAKULTAS : " + fakultas);
        //MENGAMBIL INPUT DARI KEYBOARD
        String alamat;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("masukkan Alamat : ");
        alamat = keyboard.next();
        System.out.println("Alamat : " + alamat);

	}

}
