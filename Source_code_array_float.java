import java.util.Scanner;


public class Source_code_array_float {
	public static void main(String[] args) {
	//DEKLARASI VARIABEL 
	float[] data = new float[4];
	//INISIALISASI VALUE
	data[0] = 45;
	data[1] = 64547;
	data[2] = 845;
	//OPERASI VARIABEL
	data[3] = data[1] + data[0];
	//MENAMPILKAN NILAI VARIABEL
	System.out.println("NILAI VARIABEL");
	System.out.println("L : " + data[0]);
	System.out.println("M : " + data[1]);
	System.out.println("N : " + data[3]);
	//MENGAMBIL INPUT DARI KEYBOARD
	float[] data2 = new float[1];
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Tambahkan data : ");
	data2[0] = keyboard.nextFloat();
	System.out.println("O : " + data[2]);
	

	}

}
