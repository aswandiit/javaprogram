import java.util.Scanner;


public class Source_code_array_double {
	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	double[] data = new double[4];
	//INISIALISASI VALUE
	data[0]= 45.574;
	data[1]= 52.2;
	data[2]= 7.54;
	data[3]= 4.54;
	//OPERASI VARIABEL
	double K = data[0] + data[1];
	//MENAMPILKAN NILAI
	System.out.println("OPERASI MATEMATIKA");
	System.out.println(" F : " + data[0]);
	System.out.println(" G : " + data[1]);
	System.out.println(" H : " + data[2]);
	System.out.println(" I : " + data[3]);
	System.out.println(" J : " + K);
	//MENGAMBIL IMPUT DARI KEYBOARD	
	double[] data2= new double[2];
	Scanner keyboard = new Scanner(System.in);
	System.out.print("MASUKKAN ANGKA :");
	data2[0] = keyboard.nextDouble();
	System.out.println(" L : " + data2[0]);
	

	}

}
