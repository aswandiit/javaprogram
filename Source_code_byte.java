import java.util.Scanner;


public class Source_code_byte {
	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	byte a;
	byte b;
	byte c;
	//INISIALISASI VALUE
	a = 55;
	c = 111;
	//OPERASI VARIABEL
	b = (byte) (c-73);
	//MENAMPILKAN HASIL
	System.out.println("a : " + a);
	System.out.println("b : " + b);
	System.out.println("c : " + c);
	//MENGAMBIL IMPUT DARI KEYBOARD
	Scanner keyboar = new Scanner(System.in);
	System.out.println("tambahkan data : ");
	byte d = keyboar.nextByte();
	System.out.println("d : " + d);

	}

}
