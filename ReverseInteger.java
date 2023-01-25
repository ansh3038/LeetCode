class Solution {
    public int reverse(int x) {
        String str =Integer.toString(x);
        int sign = 0;
        if(str.charAt(0)=='-'){
            sign = 1;
            str=str.substring(1);

        }
        String str1="";
        int i = 0;
         while(str1.length()!=str.length()){
             str1=str.charAt(i)+str1;
             i++;

         }
         try{
             x = Integer.parseInt(str1);
             if(sign == 1 ){
                 return -x;
             }
             return x;
         }
         catch(NumberFormatException e){
             return 0;
         }
        
    }
}