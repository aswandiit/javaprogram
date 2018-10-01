import java.util.Scanner;


public class Source_code_array_integer {
	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		int[] data= new int[4];
		//INISIALISASI VALUE
		data[0] = 45;
		data[1] = 67;
		data[2] = 34;
		//OPERASI VARIABEL
		data[3] = data[1] + data[2] / 2 - data[0] * 3;
		//MENAMPILAKAN NILAI VARIABEL
		System.out.println("NILAI VARIABEL");
		System.out.println("L : " + data[0]);
		System.out.println("M : " + data[1]);
		System.out.println("N : " + data[2]);
		System.out.println("O : " + data[3]);
		//MENGAMBIL VARIABEL DARI INPUT KEYBOARD
		int[] data2 = new int[2];
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Masukkan bilangan untuk menambah variabel : ");
		data2[0] = keyboard.nextInt();
		data2[1] = keyboard.nextInt();
		System.out.println("P : " + data[0]);
		System.out.println("Q : " + data[1]);

	}

}
