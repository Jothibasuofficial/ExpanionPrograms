public char FindMaxContinuousRepeatingChar(String str)
{
   int maxCount=0;
    int count=1;
    char result='\0';
    char[] temp=str.toCharArray();
    
    if(temp.length==1){
        return temp[0];
    }
    for(int i=1;i<temp.length;i++){
        if(temp[i]==temp[i-1]){
            count++;
        }
        else{
            if(count>maxCount){
                maxCount=count;
                result=temp[i-1];
            }
            count=1;
        }
    }
    return result;

}