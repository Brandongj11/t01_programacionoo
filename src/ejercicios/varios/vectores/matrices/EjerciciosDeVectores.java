package ejercicios.varios.vectores.matrices;

public class EjerciciosDeVectores {

	public static void main(String[] args) {
	//1.
	int X[] = new int[8];
	//2.
	char Y[] = new char[3];
	Y[2] = 'A';
	//3.
	int A[] = new int[5];
	A[0] = 25;
	A[3] = 49;
	A[2] = A[0];
	//4.
	int B[] = new int[10];
	B[0] = A[3];
	//5.
	int Z[] = new int[12];
	Z[0] = 1;
	Z[1] = 2;
	Z[2] = 3;
	Z[3] = 4;
	Z[4] = 5;
	Z[5] = 6;
	Z[6] = 7;
	Z[7] = 8;
	Z[8] = 9;
	Z[9] = 10;
	Z[10] = 11;
	Z[11] = 12;
	//6.
	int Y[] = new int[10];
	Y[0] = 1;
	Y[1] = 3;
	Y[2] = 5;
	Y[3] = 7;
	Y[4] = 9;
	Y[5] = 11;
	Y[6] = 13;
	Y[7] = 15;
	Y[8] = 17;
	Y[9] = 19;
	//7.
	char H[] = new char[10];
	H[1] = 'A';
	H[3] = 'B';
	H[5] = 'C';
	H[7] = 'D';
	H[9] = 'E';
	//8.
	char F[] = new char[10];
	F[0] = H[3];
	F[3] = H[2];//Vacio
	F[4] = H[6];//Vacio
	F[7] = H[0];//Vacio
	F[8] = H[1];
	F[9] = H[9];
	//9.
	int L[] = new int[15];
	L[0] = 6;
	L[4] = 35;
	L[7] = 126;
	L[10] = 5;
	//10.
	int N[] = new int[12];
	N[0] = 7.33;
	N[4] = 25;
	N[12] = 105;//Esta linea da error
	N[20] = 12;//Esta linea da error
	N[11] = 5;
	}

}
