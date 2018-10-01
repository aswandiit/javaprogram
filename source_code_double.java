import java.util.Scanner;


public class source_code_double {
	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	double x;
	double y;
	//INISIALISASI VALUE
	x  = 45.897;
	y  = 3.67;
	//OPERASI VARIABEL
	double z = x + y;
	//MENAMPILKAN NILAI
	System.out.println("operasi matematika");
	System.out.println(" X : " + x);
	System.out.println(" Y : " + y);
	System.out.println(" Z : " + z);
	//MENGAMBIL IMPUT DARI KEYBOARD	
	double w;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Tambahkan angka Desimal : ");
	w = keyboard.nextDouble();
	System.out.println(" W : " + w);

	}

}
