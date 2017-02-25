package search;

import java.util.Arrays;

public class BinarySearch {
	/**
	 * 被搜索数据的大小
	 */
	private static final int SIZE = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[SIZE];
		// 添加测试数据
		for (int i = 0; i < data.length; i++) {
			data[i] = i + 1;
		}
		data[999] = 567;
		result(data);
	}

	/**
	 * 调用二分搜索算法的实现查找相同元素
	 * 
	 * @param data
	 */
	public static void result(int[] data) {
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			int target = data[i];
			data[i] = 0;
			int result = binaryFind(data, target);
			if (result != -1) {
				System.out.println("相同元素为：" + data[result]);
				break;
			}
		}

	}

	/**
	 * 二分搜算算法的实现
	 * 
	 * @param data
	 *            数据集合
	 * @param target
	 *            搜索的数据
	 * @return 返回找到的数据的位置，返回-1表示没有找到
	 */
	private static int binaryFind(int[] data, int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = data.length - 1;
		while (start <= end) {
			int middleIndex = (start + end) / 2;
			if (target == data[middleIndex]) {
				return middleIndex;
			}
			if (target >= data[middleIndex]) {
				start = middleIndex + 1;
			} else {
				end = middleIndex - 1;
			}
		}
		return -1;
	}
}
