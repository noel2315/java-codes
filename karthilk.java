class test{
	int s;
	int n;
	test(int x){
		n=x;
		s=0;	
	}
	void sum(){
		for(int i=0;i<=n;i++){
		s+=i;
		}
	System.out.println("Sum: "+s);
	}
}
class Karthik{
	public static void main(String[] args){
	test ob=new test(5);
	ob.sum();
	}