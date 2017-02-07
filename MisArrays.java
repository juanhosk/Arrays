
public class MisArrays {
	public static void cambiarBinario (int numero){
		
		int arr[] = new int[25];
		int i=0;
		int res;
		
		
		while(numero>=1){
			res=numero%2;
			numero=numero/2;
			
			arr[i]=res;
			
			i++;
		}

		System.out.print("El numero en binario es  ");
		while(i>=0){
			System.out.print(arr[i]);
			i--;
		}
				
	}

}
