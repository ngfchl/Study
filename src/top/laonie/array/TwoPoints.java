package top.laonie.array;

import java.util.Arrays;

/**
 * 二分法查找
 * 
 * @author lenovo
 *
 */
public class TwoPoints {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 8, 9, 0, 4, 6, 7 };
		System.out.println(	binarySearch(a,7));
	}
	/**
	 * 二分法查找
	 * @param arr
	 * @param searchword
	 * @return
	 */
	public static int binarySearch(int[] arr, int searchword) {
		Arrays.sort(arr);//对数组进行排序
		System.out.println("\n"+Arrays.toString(arr));//打印数组
		//开始二分查找
		int iIndex= 0;//相当于指针
		int iStart= 0;
		int iEnd = arr.length-1;
		int searchCount = 0;//查找次数
		for (int i = 0; i < arr.length/2; i++) {
			searchCount++;
			iIndex = (iStart+iEnd)/2;
			if (arr[iIndex]<searchword) {
				System.out.println("aa");//测试效果
				iStart=iIndex;
			}else if (arr[iIndex]>searchword) {
				System.out.println("bb");//测试效果
				iEnd = iIndex;
			}else {
				System.out.println(iIndex);;
				break;
			}
			
		}
		return searchCount;
	}
}
