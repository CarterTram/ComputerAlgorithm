import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HeapLabTest {

    @Test    
    public void testMakeTree() {
        String inputString = "1 3 2 4 5 8 7 6 9 52 10 12 99 13 14";
        Scanner input = new Scanner(inputString);

        ArrayList<Integer> expectedTree = new ArrayList<>();
        while (input.hasNextInt()) {
            expectedTree.add(input.nextInt());
        }

        
        Scanner inputForMakeTree = new Scanner(inputString);
        ArrayList<Integer> actualTree = HeapLab.makeTree(inputForMakeTree);
        
        input.close();
        inputForMakeTree.close();

        assertEquals(expectedTree, actualTree);
    }
    @Test
    public void testHeapSort() {
        String inputString = "1 3 2 4 5 8 7 6 9 52 10 12 99 13 14";
        ArrayList<Integer> inputTree = new ArrayList<>();
        Scanner inputScanner = new Scanner(inputString);
        while (inputScanner.hasNextInt()) {
            inputTree.add(inputScanner.nextInt());
        }

        ArrayList<Integer> expectedSortedTree = new ArrayList<>();
        Scanner sortedInputScanner = new Scanner(inputString);
        while (sortedInputScanner.hasNextInt()) {
            expectedSortedTree.add(sortedInputScanner.nextInt());
        }
        expectedSortedTree.sort(null);

        ArrayList<Integer> actualSortedTree = HeapLab.heapSort(inputTree);

        inputScanner.close();
        sortedInputScanner.close();

        assertEquals(expectedSortedTree, actualSortedTree);
    }
}
