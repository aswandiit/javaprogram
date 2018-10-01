import java.util.Scanner;


public class Source_code_long {
	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	long a;
	long b;
	long c;
	//INISIALISASI VALUE
	b = 54600000;
	c = 97600000;
	//OPERASI VARIABEL
	a = (long)(c-500000);
	//MENAMPILKAN HASIL
	System.out.println("a : " + a);
	System.out.println("b : " + b);
	System.out.println("c : " + c);
	//MENGAMBIL IMPUT DARI KEYBOARD
	long d;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Tambahkan data Long : ");
	d = keyboard.nextLong();
	System.out.println("Data tambahan-----");
	System.out.println("d : " + d);

	}

}
