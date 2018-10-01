import java.util.Scanner;


public class Source_code_object {
	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		Object zebra = new Object();
		Object lion = new Object();
		//INISIALISASI VALUE
		zebra = "ahmad";
		lion = "faer";
		//MENAMPILKAN HASIL
		System.out.println("nama zebra saya : " + zebra);
		System.out.println("nama lion saya : " + lion);
		//MENDAPATKAN INPUT DARI KEYBOARD
		Object panda = new Object();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("masukkan nama panda :");
		panda = keyboard.next();
		System.out.println("Nama panda saya : " + panda);


	}

}
