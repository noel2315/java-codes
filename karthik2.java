class test{
	int q;
	int r;
	int n;
	int d;
	test(int x,int y){
		n=x;
		d=y;	
	}
	void qr(){
		q=n/d;
		r=n%d;
		System.out.println("Quotient: "+q);
		System.out.println("Remainder: "+r);
		}
}
class karthik2{
	public static void main(String[] args){
	test ob=new test(65,2);
	ob.qr();
	}
}