class Solution {
    public int nthFibonacci(int n) {
        int a=0,b=1;
        if(n<0) return -1;
        
        else if(n==0) return a;
        else if(n==1) return b;
        else{
            for(int i=2;i<=n;i++){
                int c=a+b;
                a=b;
                b=c;
            }
            return b;
        }
        
    }
}
