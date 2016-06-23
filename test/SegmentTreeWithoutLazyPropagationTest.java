import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;


public class SegmentTreeWithoutLazyPropagationTest {

    @Test
    public void shouldCreateAnArrayToStorePartialSums() {
        SegmentTreeWithoutLazyPropagation segmentTree = new SegmentTreeWithoutLazyPropagation();
        int arr[] = new int[5];

        int treeArr[] = segmentTree.constructTreeArray(arr);

        assertEquals(9, treeArr.length);
    }

    @Test
    public void shouldCreateTreeArrayWithData() {
        SegmentTreeWithoutLazyPropagation segmentTree = new SegmentTreeWithoutLazyPropagation();
        int arr[] =  { 1, 2, 3, 4, 5};

        int treeArr[] = segmentTree.constructTreeArray(arr);

        assertEquals(treeArr[0], 15);
        assertEquals(treeArr[1],6);
        assertEquals(treeArr[2],9);
    }

    @Test
    public void shouldGiveSumForRange() {
        SegmentTreeWithoutLazyPropagation segmentTree = new SegmentTreeWithoutLazyPropagation();
        int arr[] =  { 1, 2, 3, 4, 5};

        int treeArr[] = segmentTree.constructTreeArray(arr);

        int sum = segmentTree.getSumForRange(0,4,treeArr);

        assertEquals(sum,15);
    }



}