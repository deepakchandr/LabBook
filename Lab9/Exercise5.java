package Lab9;

import Lab9.Exercise3.interfacelogin;

public class Exercise5 {
	
	interface infact{
		int fact(int x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		infact a= (x) -> {
			if (x<2) {
				return 1;
			}
			return x*(a.fact(x-2));
		};
		System.out.println(a.fact(5));
	}

}
