package search;

public class SequelSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * ��s[0]-s[n-1]��˳����ҹؼ���Ϊkey�ļ�¼
	 * ���ҳɹ�ʱ���ظü�¼���±���ţ�ʧ��ʱ����-1
	 * @param s
	 * @param key
	 * @param n
	 * @return
	 */
	public int sequelSearch(String[] s,String key,int n) {
		int i=0;
		while (i<n && s[i] !=key) {
			i++;
			if (s[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
