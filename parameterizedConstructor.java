package new_java;

public class parameterizedConstructor {
	int data;
	public parameterizedConstructor(int V) {
	System.out.println("parameterizedConstructor is");
	data=V;
	}

	public static void main(String[] args) {
		parameterizedConstructor A=new parameterizedConstructor( 66);
		System.out.println("data is :"+A.data);
		// TODO Auto-generated method stub

	}

}
