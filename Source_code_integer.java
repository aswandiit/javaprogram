import java.util.Scanner;


public class Source_code_integer {
	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	int l;
	int m;
	int n;
	//INISIALISASI VALUE
	l = 33;
	m = 55;
	n = 55;
	//OPERASI VARIABEL
	int o = m + l / 2 - n * 5;
	//MENAMPILAKAN NILAI VARIABEL
	System.out.println("---Nilai Variabel---");
	System.out.println("l : " + l);
	System.out.println("m : " + m);
	System.out.println("n : " + n);
	System.out.println("o : " + o);
	//MENGAMBIL VARIABEL DARI INPUT KEYBOARD
	int p;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Masukkan bilangan untuk menambah variabel : ");
	p = keyboard.nextInt();
	System.out.println("p : " + p);
	}

}
