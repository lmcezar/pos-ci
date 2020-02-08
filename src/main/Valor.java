package main;

public class Valor implements ValorINT {

	int arr[] = new int[10];
	
	@Override
	public boolean ins(int v) {
		// TODO Auto-generated method stub
		if(v > 0) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 0) {			
						arr[i] = v;
						return true;	
				}	
			}
		}
		
		return false;
	}
	

	@Override
	public int del(int i) {
		// TODO Auto-generated method stub
		if(size() == 0) {
			return -1;
		}
		
		if(i >= 0 && i < 10) {
			int val = arr[i];
			arr[i] = 0;
			return val;	
		}
		
		return -1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		int cont = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				cont++;
			}
		}
		
		return cont;
	}



}
