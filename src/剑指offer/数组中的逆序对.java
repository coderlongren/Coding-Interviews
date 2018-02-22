package 剑指offer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月21日 下午3:34:49
* 类说明: 
*/
public class 数组中的逆序对 {
	  private  int reversePair = 0;
	    public int InversePairs(int [] array) {
	        if(array==null)
	            return 0;
	        int len = array.length;
	        if(len==0)
	            return 0;
	        sort(array,0,len-1);
	        return reversePair;
	    }

	    private void sort(int[]arr,int start,int end){
	        if(start<end){
	            int mid = start+(end-start)/2;
	            sort(arr,start,mid);
	            sort(arr,mid+1,end);
	            merger(arr,start,mid,mid+1,end);
	        }
	    }

	    private void merger(int[] arr, int start1, int end1, int start2, int end2) {
	        int len= end2-start1+1;
	        int[] anx = new int[len];
	        int k = end2-start1+1;

	        int i = end1;
	        int j= end2;
	        while(i>=start1&j>=start2){
	            if(arr[i]>arr[j]){
	                anx[--k]=arr[i];
	                i--;
	                reversePair = reversePair+(j-start2+1);
	            }
	            else{
	                anx[--k]=arr[j];
	                j--;
	            }
	        }
	        for(;i>=start1;i--)
	            anx[--k]=arr[i];
	        for(;j>=start2;j--)
	            anx[--k]=arr[j];

	        for(int m=0;m<len;m++)
	            arr[start1++]=anx[m];

	    }
	public static void main(String[] args) {
		int[] array = {7,5,6,4};
//		InversePairs(array);
	}
}
