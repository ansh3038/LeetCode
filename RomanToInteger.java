class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int slength=s.length();
        s=s+"0";
    //    try{
        for(int i=0;i<slength;i++){
            if(s.charAt(i)=='I'){
                if(s.charAt(i+1)=='X'){
                    sum+=9;
                    i++;
                }
                else if(s.charAt(i+1)=='V'){
                    sum+=4;
                    i++;
                }
                else{
                    sum+=1;
                }
            }
            else if(s.charAt(i)=='X'){
                if(s.charAt(i+1)=='C'){
                    sum+=90;
                    i++;
                }
                else if(s.charAt(i+1)=='L'){
                    sum+=40;
                    i++;
                }
                else{
                    sum+=10;
                }
            }
            else if(s.charAt(i)=='C'){
                if(s.charAt(i+1)=='D'){
                    sum+=400;
                    i++;
                }
                else if(s.charAt(i+1)=='M'){
                    sum+=900;
                    i++;
                }
                else{
                    sum+=100;
                }
            }
            else if(s.charAt(i)=='V'){
                sum+=5;
            }
            else if(s.charAt(i)=='L'){
                sum+=50;
            }
            else if(s.charAt(i)=='D'){
                sum+=500;
            }
            else if(s.charAt(i)=='M'){
                sum+=1000;
            }
            
        // }
       }
    //    catch(Exception e ){       }
            
            



            

        
        return sum;


        
    }
}