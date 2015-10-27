package com.Jobbole.sort;

/**
 * @author Brainhu
 *
 */
public class CommonSortWay {
	
	public static void main(String[] args) {
		int [] a =SortData.data;
		System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        //这里开始排序
        quick(a);
        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
	}
	//快速排序
	public static void quick(int[] args){
		System.out.println("快速排序算法计算结果");
		if(args.length>0){
			quicksort(args,0,args.length-1);
		}
	}
	static void quicksort(int n[], int left, int right) {
        int dp;
        if (left < right) {
            dp = partition(n, left, right);
            quicksort(n, left, dp - 1);
            quicksort(n, dp + 1, right);
        }
    }
 
    static int partition(int n[], int left, int right) {
        int pivot = n[left];
        while (left < right) {
            while (left < right && n[right] >= pivot)
                right--;
            if (left < right)
                n[left++] = n[right];
            while (left < right && n[left] <= pivot)
                left++;
            if (left < right)
                n[right--] = n[left];
        }
        n[left] = pivot;
        return left;
    }
    
    
    //
	public void mergeSort(int[] args){}
	
	//插入排序—直接插入排序
	/*基本思想:
		将一个记录插入到已排序好的有序表中，从而得到一个新，记录数增1的有序表。即：先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入，直至整个序列有序为止。
		要点：设立哨兵，作为临时存储和判断数组边界之用。*/
	public void straightInsertionSort(int[] args){
		
	}
}
