package search;

import java.util.Arrays;

public class BinarySearch {
	/**
	 * ���������ݵĴ�С
	 */
	private static final int SIZE = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[SIZE];
		// ��Ӳ�������
		for (int i = 0; i < data.length; i++) {
			data[i] = i + 1;
		}
		data[999] = 567;
		result(data);
	}

	/**
	 * ���ö��������㷨��ʵ�ֲ�����ͬԪ��
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
				System.out.println("��ͬԪ��Ϊ��" + data[result]);
				break;
			}
		}

	}

	/**
	 * ���������㷨��ʵ��
	 * 
	 * @param data
	 *            ���ݼ���
	 * @param target
	 *            ����������
	 * @return �����ҵ������ݵ�λ�ã�����-1��ʾû���ҵ�
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
