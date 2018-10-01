import java.util.Scanner;


public class Source_code_float {
	public static void main(String[] args) {
	//DEKLARASI VARIABEL 
	float l;
	float m;
	float hasil;
	//INISIALISASI VALUE
	l = 65;
	m = 64778;
	//OPERASI VARIABEL
	hasil = m * l + l - m;
	//MENAMPILKAN NILAI VARIABEL
	System.out.println("nilai variabel");
	System.out.println("L : " + l);
	System.out.println("M : " + m);
	System.out.println("hasil : " + hasil );
	//MENGAMBIL INPUT DARI KEYBOARD
	float n;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("N : ");
	n = keyboard.nextFloat();
	System.out.println("N : " + n);

	}

}
