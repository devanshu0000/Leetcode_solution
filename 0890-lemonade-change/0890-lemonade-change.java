class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount=0;
        int tenCount=0;
        boolean change= true;
        for (int i=0;i<bills.length;i++){
            if(bills[i]==5){
                fiveCount++;
            }
            else if(bills[i]==10){
                if(fiveCount>0){
                    fiveCount--;
                    tenCount++;
                }
                
                else{
                    change=false;
                    break;

                }
            }
            else if(bills[i]==20){
                if(tenCount>0 && fiveCount>0){
                    fiveCount--;
                    tenCount--;
                }
                else if(fiveCount>=3){
                    fiveCount-=3;
                }
                else{
                change = false;
                break;
                }
            }
        }
     return change;   
    }
}