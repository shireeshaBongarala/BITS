
public class SegmentTreeWithoutLazyPropagation {

public int[] constructTreeArray(int[] array){
    int e = array.length-1;
    int treeArray[] = new int[(e)*2 + 1];
    int i =0;
    int c =(int) Math.ceil((e)/2);
    treeArray[i]= getPartialSum(2*i+1, treeArray, array,0 ,c ) + getPartialSum(2*i+2, treeArray, array, c+1, e);
    return treeArray;
}

    private int getPartialSum(int i, int[] treeArray, int[] array, int s, int e) {
        if(s==e){
            treeArray[i]=array[s];
            return treeArray[i];
        }
        int c =(int) Math.ceil((s+e)/2);
        treeArray[i]= getPartialSum(2*i+1, treeArray, array,s , c) + getPartialSum(2*i+2, treeArray, array,c+1 , e);
        return  treeArray[i];
    }


    public int getSumForRange(int i, int j, int[] treeArr) {
       return treeArr[i];
    }
}
