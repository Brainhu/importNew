package com.Jobbole.sort;

/**
 * @author Brainhu
 *
 */
public class CommonSortWay {
	
	public static void main(String[] args) {
		int [] a =SortData.data;
		System.out.println("����֮ǰ��");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        //���￪ʼ����
        quick(a);
        System.out.println();
        System.out.println("����֮��");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
	}
	//��������
	public static void quick(int[] args){
		System.out.println("���������㷨������");
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
	
	//��������ֱ�Ӳ�������
	/*����˼��:
		��һ����¼���뵽������õ�������У��Ӷ��õ�һ���£���¼����1������������Ƚ����еĵ�1����¼������һ������������У�Ȼ��ӵ�2����¼������в��룬ֱ��������������Ϊֹ��
		Ҫ�㣺�����ڱ�����Ϊ��ʱ�洢���ж�����߽�֮�á�*/
	public void straightInsertionSort(int[] args){
		
	}
}
