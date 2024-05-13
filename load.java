package new_java;

public class load {
	int num1;
float num2;
public load()
{
	System.out.println("costruct overload");
	num1=11;
	num2=22.2f;
}
public load(int a,float b) {
	System.out.println("parameterized load");
	num1=a;
num2=b;
}
	public static void main(String[] args) {
		load x1=new load();		// TODO Auto-generated method stub

	}

}
