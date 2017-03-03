package search;

public class SequelSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 在s[0]-s[n-1]中顺序查找关键字为key的记录
	 * 查找成功时返回该记录的下标序号；失败时返回-1
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
