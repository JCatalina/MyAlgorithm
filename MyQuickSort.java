package com.luowenjin;
public class MyQuickSort {
	
	public static void main(String[] args) {
		int[] array=new int[]{80, 16, 97, 6 ,12 ,92, 31, 52, 54, 89};
		MyQuickSort.QuickSort(array, 0, array.length-1);
		printArray(array);
	}
	
	public static int Partition(int[] array,int begin,int end){
		int low = begin;
		int high = end ;
		int privot = array[begin];//枢纽/中轴
		while(low< high){
			
			while(low < high && array[high] >= privot ){
				high--;
			}
			array[low] = array[high];
			
			while(low < high && array[low] <= privot ){
				low++;
			}
			array[high]=array[low];
					
			array[low]=privot;
			
		}
		printArray(array);
		return low;
	}
	
	public static void QuickSort(int[] array ,int begin ,int end ){
		if(begin < end){
			int privot = Partition(array,begin,end);
			QuickSort(array,begin,privot-1);
			QuickSort(array,privot+1,end);
			
		}
		
	}
	
	public static void printArray(int[] array){
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}
		System.out.print("]");
		System.out.println();
	}
	
	

}
