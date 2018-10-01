import java.util.Scanner;


public class Source_code_boolean {
	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	int a;
	int b;
	//INISIALISASI VARIABEL
	a = 0;
	b = 9;
	//OPERASI VARIABEL LOGIKA AND & OR
	boolean test_and = false;
	boolean test_or = false;
	test_and = (a < 11) && (b < 7);
	test_or = (a < 11) || (b < 7);
	//MENAMPILKAN VARIABEL & TEST
	System.out.println("a : " + a);
	System.out.println("b : " + b);
	System.out.println("Logika AND :" + test_and);
	System.out.println("Logika OR : " + test_or);
	//MENDAPATKAN INPUT DARI KEYBOARD
	int c;
	boolean and = false;
	boolean or = false;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("masukkan nilai Variabel");
	System.out.print("c :");
	c = keyboard.nextInt();
	and = (c < 10) && (b++ < c);
	or = (c < 10) || (b++ < c);
	System.out.println("c : " + c);
	System.out.println("Logika AND : " + and);
	System.out.println("Logika OR : " + or);

	}

}
