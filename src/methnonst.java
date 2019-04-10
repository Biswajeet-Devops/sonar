package methoddemo;

public class methnonst {

	public static void main(String[] args) {
		methnonst obj=new methnonst();
		obj.nonstm1();// TODO Auto-generated method stub
        obj.nonstm2();
        obj.mathSumReturn(10,50,10);
        int retval=obj.mathSumReturn(65, 6, 32);
		System.out.println("retrun value is "+retval);
		obj.mathMulReturn(10, 5.5);
		double retval1=obj.mathMulReturn(40,20);
		System.out.println("return value is "+retval1);
	}
	public void nonstm1() {
		int a=20,b=10,sum;
		sum = a+b;
		System.out.println("sum="+sum);
	}
	public void nonstm2() {
		int a=50,b=50,div;
		div = a/b;
		System.out.println("div="+div);
	}
	public int mathSumReturn(int a,int b,int c) {
		  int sum;
		   sum=a+b+c;
		   System.out.println("inside method sum="+sum);
		   return sum;
	   }
	public double mathMulReturn(double a,double b) {
		double mul;
		mul=a*b;
		System.out.println("mul="+mul);
		return mul;
	}

}
