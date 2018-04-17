/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executiontime;

import utilities.SortMethods;

/**
 *
 * @author gansc
 */
public class ExecutionTime {

    /**
     * @param args the command line arguments
     */
    
    //Display text
    public static void main(String[] args) {
        System.out.printf("%5s%5s%10s%10s%10s%10s%10s%10s\n",
                "Array", "|", "Selection", "Bubble", "Merge", "Quick", "Heap", "Radix");
        System.out.printf("%s%6s%10s%10s%10s%10s%10s%10s\n",
                "size", "|", "Sort", "Sort", "Sort", "Sort", "Sort", "Sort");
        System.out.println("------------------------------------------------------------------------");
        
        //declare variables
        int number = 50000;
        
        //create new object
        SortMethods sort = new SortMethods(number);
        for (int i = 0; i < 6; i++)
        {
            System.out.printf("%-9d%s%10d%10d%10d%10d%10d%10d\n",
                    number, "|", sort.selectionSort(),
                                sort.bubbleSort(),
                                sort.mergeSort(),
                                sort.quickSort(),
                                sort.heapSort(),
                                sort.radixSort());
            //increase size
            number += 50000;
            //pass new size over as new object
            sort = new SortMethods(number);
        }
    }
    
}
