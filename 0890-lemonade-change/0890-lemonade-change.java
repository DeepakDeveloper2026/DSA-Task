class Solution {
    public boolean lemonadeChange(int[] bills) {
    int count_five=0;
    int count_ten=0;
    int count_twenty=0;
    for(int n:bills){
        if(n==5){
            count_five++;
        }
        else if(n==10){
            if(count_five == 0){
                return false;
            }
            count_five--;
            count_ten++;
        }
        else{
            if(count_five>0 && count_ten>0 ){
                count_five--;
                count_ten--;
            }
            else if(count_five>=3){
                count_five-=3;
            }
            else{
                return false;
            }
        }
    }
    return true;
    }
}