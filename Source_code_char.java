import java.util.Scanner;


public class Source_code_char {
	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	int nilai,nilai_2,c;
	char a= 'A';
	char b= 'B';
	//INISIALISASI VALUE
	nilai = 55;
	nilai_2 = 99;
	//OPERASI VARIABEL
	c = 91-52;
	//MENAMPILKAN HASIL
	if(nilai >= 80){System.out.println("a: " + a);}
	else{System.out.println("b: " + b);}
	if(nilai_2 >= 80){System.out.println("b: " + a);}
	else{System.out.println("b: " + b);}
	if(c >= 80){System.out.println("c: " + c);}
	else{System.out.println("c: " + c);}
	System.out.println("--karena--");
	System.out.println("nilai 1 : " + nilai);
	System.out.println("nilai 2 : " + nilai_2);
	System.out.println("c : " + c);
	//MENGAMBIL IMPUT DARI KEYBOARD
	int d;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("masukkan nilai anda : ");
	d = keyboard.nextInt();
	if(d>=80){System.out.println("selamat nilai anda: " + a);}
	else{System.out.println("selamat nilai anda: " + b);}

	}

}
