package _02_fibonacci;

public class fibonachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=1;
		
		for (int i = 0; i < 6; i++) {
		System.out.println(x);
			System.out.println(y);
		x+=y;
		y+=x;
		}
		
	}

}
