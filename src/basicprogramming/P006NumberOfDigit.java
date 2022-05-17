package basicprogramming;

public class P006NumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ori_num =12345;
		int temp = 0;
		
		while(ori_num > 0)
		{
			ori_num=ori_num/10;
			temp++;
		}
		System.out.println("Number of digits : "+temp);
	}

}
