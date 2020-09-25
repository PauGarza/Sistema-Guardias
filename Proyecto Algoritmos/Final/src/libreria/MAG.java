package libreria;

import java.util.ArrayList;

public class MAG {
	
	public static <T> void swap(int posX, int posY, ArrayList<T> a){
		T aux;
		aux = a.get(posX);
		a.add(posX, a.get(posY));
		a.add(posY, aux);
		}
	
	public static <T extends Comparable> int posMinimo(ArrayList<T> arr, int inicio) {
		int min=inicio;
		for(int i=inicio+1; i<arr.size(); i++)
		//compara al elemento determinado como mínimo vs el elemento i 
			if(arr.get(min).compareTo(arr.get(i))>0 ) 
		//si encuentra uno menor se obtiene su índice dentro del arreglo 
				min=i;
		return min;
		}
	
	public static <T extends Comparable> int posMaximo(ArrayList<T> arreglo, int inicio) {
		int max=inicio;
		for(int i=inicio+1; i<arreglo.size(); i++)
			if(arreglo.get(max).compareTo(arreglo.get(i))<0 )  
				max=i;
		return max;
	}
	
	public static <T> void moverDer(ArrayList<T> arr, int k) {
		if (k>0) {
			for (int i=arr.size()-1; i>=k; i--) {
				arr.add(i,arr.get(i-k));
				arr.add(i-k,null);
			}
		}
	}
	
	public static <T> void moverIzq(ArrayList<T> arr, int k) {
		if (k>0) {
			for (int i=0; i<(arr.size())-k; i++) {
				arr.add(i,arr.get(i+k));
				arr.add(i+k,null);
			}
		}
	}
	
	public static <T extends Comparable> void seleccionDirecta(ArrayList<T> arr){ 
		for(int i=0; i<arr.size()-1; i++){ 
			int min = posMinimo(arr,i); 
			swap(i,min,arr);
		}
	}
	
	public static <T extends Comparable> int buscaSecuencialOrdenada(ArrayList<T> a, T x){
		int i = 0;
		while (i<a.size() && a.get(i).compareTo(x)<0) {
			i++;
		}
		if (i>=a.size() || a.get(i).compareTo(x)!=0) {
			i = -i-1;
		}
		return i;
	}
	
	public static <T extends Comparable> int buscaSecuanecialDesordenada (T [] a, int n, T x) {
		int resp = -1;
		for (int i = 0; i < n; i++) {
			if(a[i].equals(x)) {
				resp = i;
			}
		}
		return resp;
	}
	
	public static <T> void alta (ArrayList<T> a, T x) {
		a.add(x);
	}
	
	public static <T> void baja (ArrayList<T> a, T x) {
		a.remove(x);
	}
}