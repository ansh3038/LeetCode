class Solution {
    public int myAtoi(String s) {
        if(s.equals("")){
            return 0;
        }
        s=s.trim();
        String[] str=s.split(" ");
        s=str[0];
        int sign=0;
        if(s.length()==0){
            return 0;
        }
        if(s.charAt(0)=='-'){
            sign=1;
            s=s.substring(1);
                    }
        else if(s.charAt(0)=='+'){
            s=s.substring(1);
        }
        if(s.equals("")){
            return 0;
        }
        if(s.charAt(0)==('+') || s.charAt(0)=='-' || s.charAt(0)=='.'){
            return 0;
        }
        String str1="";
        for(int i=0;i<s.length();i++){
            String regex = "\\d+";
            if(!Character.isDigit(s.charAt(i))){
                break;
            }
            str1+=s.charAt(i);
        }
        // System.out.println(str1);
        int i=0;
        if(str1.equals("")){
            return 0;
        }
        try{ long k =  Long.parseLong(str1);
           if(sign==1){
               k=-k;
           }
        if(k>Integer.MAX_VALUE)     { k = Integer.MAX_VALUE; }
        else if(k<Integer.MIN_VALUE){ k = Integer.MIN_VALUE; }
        i=(int)k;
       }
       catch(NumberFormatException e ){
            if(sign==0)     { i = Integer.MAX_VALUE; }
        else if(sign==1){ i = Integer.MIN_VALUE; }
        }
        return i;
    }
}