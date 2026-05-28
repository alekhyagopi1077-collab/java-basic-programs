class palindrome{
   public static void main(String[] args){
        int n=121,original=n,reverse=0,digit;
        while(n>0){
            digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
                if(original==reverse){
                    System.out.println("palindrome");
                }
                else{
                    System.out.println("not palindrome");
                }
    }
}