import java.util.Scanner;


public class Source_code_array_object {
	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	Object[] binatang = new Object[2];
	//INISIALISASI VALUE
	binatang[0] = "ayam";
	binatang[1] = "kucing";
	//MENAMPILKAN HASIL
	System.out.println("jenis peliharaan saya : " + binatang[0]);
	System.out.println("jenis peliharaan saya : " + binatang[1]);
	//MENGAMBIL IMPUT DARI KEYBOARD
	Object[] binatang1= new Object[2];
	Scanner keyboard = new Scanner(System.in);
	System.out.println("masukkan nama kelinci :");
	binatang1[0] = keyboard.next();
	System.out.println("masukan nama kelinci :");
	binatang1[1] = keyboard.next();
	System.out.println("nama kelinci saya : " + binatang1[0]);
	System.out.println("nama kelinci saya : " + binatang1[1]);


	}

}
