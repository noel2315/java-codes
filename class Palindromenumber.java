class Palindromenumber{
public static void main(String arg[]){
int num=12321;
int rem=0,rev=0;
int x=num;
while(num!=0){
rem=num%10;
rev=rev*10+rem;
num=num/10;
}

if(x==rev){
System.out.printf("palindrome number:  " +rev);
}
else{
System.out.printf("Not a palindrome number:  " +rev);
}
}
}