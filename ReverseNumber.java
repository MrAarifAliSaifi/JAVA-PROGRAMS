class reverse{
    int reverse(int n)
    {
        int rev=0,rem=0;
        for(;n>0;n=n/10)
        {
            rem=n%10;
            rev=rev*10+rem;
        }
        return rev;
    }
}
public class ReverseNumber {
    public static void main(String[] args) {
        reverse rv=new reverse();
        int p=rv.reverse(123);
        System.out.println(p);
    }

}
