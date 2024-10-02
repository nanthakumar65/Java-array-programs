package arrayPrograms;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VarArgs v = new VarArgs();
		v.check_args();
		v.check_args(10);
		v.check_args(20,30,40);
	}

	private void check_args(int... a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
