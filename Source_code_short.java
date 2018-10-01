import java.util.Scanner;


public class Source_code_short {
	public static void main(String[] args) {
		//Deklarasi variabel
		short l;
		short m;
		short n;
		//INISIALISASI VALUE
		l = 1345;
		n = 6000;
		//OPERASI VARIABEL
		m = (short)(l+n);
		//MENAMPILKAN HASIL
		System.out.println("l : " + l);
		System.out.println("m : " + m);
		System.out.println("n : " + n);
		//MENGAMBIL IMPUT DARI KEYBOARD
		Scanner keyboard = new Scanner(System.in);
		System.out.println("tambahkan data");
		float o;
		o = keyboard.nextShort();
		System.out.println("o :" + o);

	}

}
