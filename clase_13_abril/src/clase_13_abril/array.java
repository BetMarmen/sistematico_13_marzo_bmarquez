package clase_13_abril;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[]va;
		int[]vb;
		int[]vc;
		int[]vd;
		int n,m,num,suma=0,sum2=0;
		double z,pro = 1,productomod=0;
		System.out.println("Lo mas preferible es que ambos arreglos tengan la misma cantidad de elementos");
		System.out.println("Ingrese la cantidad del primer arreglo");
		n=scan.nextInt();
		do {
		System.out.println("Ingrese la cantidad del segundo arreglo");
		m=scan.nextInt();}
		while(m>n || m<n);
		va= new int[n];
		vb= new int[n];
		vc= new int[n];
		vd= new int[n];
		for (int i = 0;i<va.length;i++ ) 
		{
			System.out.println("Ingrese el numero "+(i+1)+" del arreglo A:");
			num = scan.nextInt();
			va[i]=num;
		}
		
		for (int i = 0;i<vb.length;i++ ) 
		{
			System.out.println("Ingrese el numero "+(i+1)+" del arreglo B:");
			num = scan.nextInt();
			vb[i]=num;
		}
		for (int i = 0;i<vc.length;i++ ) 
		{
			vc[i]+= (va[i]*vb[i]);
			System.out.println(vc[i]);
			suma+=vc[i];
			pro*=vc[i];
			sum2+=Math.pow(vc[i], 2);
			productomod= (int) Math.sqrt(sum2);
			
		}
		z=pro/productomod;
		System.out.println("Producto de los arreglos: "+pro);
		System.out.println("Producto punto es: "+suma);
		System.out.println("El producto modulo es:"+productomod);
		System.out.println("El valor de Z="+z);
	}

}
