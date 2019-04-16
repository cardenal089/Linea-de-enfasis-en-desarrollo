import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese la dimensión de los vectores a sumar: ");
		int dimension = dato.nextInt();
		int[] a=new int[dimension];
		int[] b=new int[dimension];
		int[] c= new int[dimension];
		System.out.println("Los 2 vectores a sumar se llenaran aleatoriamente");
		for(int i=0;i<dimension;i++){
			a[i]=(int)(Math.random()*10)+1;
			b[i]=(int)(Math.random()*10)+1;
		}
		
		String cadena1="", cadena2="", cadena3="";
		for(int i=0;i<dimension;i++){
			cadena1 = cadena1+a[i]+" , ";
			cadena2 = cadena2+b[i]+" , ";
			c[i]=a[i]+b[i];
			cadena3=cadena3+c[i]+" , ";			
		}
		
		System.out.println("El primer vector es: \t\t"+cadena1);
		System.out.println("El segundo vector es: \t\t"+cadena2);
		System.out.println("La suma de los vectores es: \t"+cadena3);
		
	}

}
