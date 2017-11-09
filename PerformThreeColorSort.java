public class Answer implements ThreeColorSortInterface {
    @Override 
    public void PerformThreeColorSort(ColorArray colArray) { 
        
    int high=colArray.GetSize()-1, low=0,mid=0;
    
    while(mid<=high){
        switch(colArray.GetColor(mid)){
        case 0:
            {
               colArray.Swap(low,mid);
				low++;
				mid++;
				break;
                
            }
        case 1:
            {
                mid++;
                break;
            }
        case 2:
             {
                 colArray.Swap(mid,high);
				high--;
				break;
             }
    }
    }
}
}
