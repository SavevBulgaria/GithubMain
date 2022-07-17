package algoritmi;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ARRAYLIST {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>(5);
        arrayList.add(20);
        arrayList.add(39);
        arrayList.add(14);
        arrayList.add(22);
        arrayList.add(50);



        System.out.println("changing the first element to 100");
        arrayList.set(0,100);
        System.out.println("Checking the [0] via get function"+" "+arrayList.get(0));
        System.out.println("removing the second element");
        System.out.println(arrayList.remove(1));
        System.out.println("Removing the third element by value");
        arrayList.remove(Integer.valueOf(14));
        System.out.println("Array after changes"+arrayList);
        System.out.println("Sorted array");
        Collections.sort(arrayList);

        System.out.println("Using for cycle");
            for(int i=0;i< arrayList.size();i++){
                System.out.print(arrayList.get(i)+" ");
            }
        System.out.println();
        System.out.println("Using for each method");
            for(Integer elem: arrayList){
                System.out.print(elem+" ");
            }
        System.out.println();
        System.out.println("Using stream");
            arrayList.stream().forEach((elem)->{System.out.print(elem+" ");});
        System.out.println();
        System.out.println("Size of the array"+" "+arrayList.size());

        System.out.println("Is the array empty"+" "+arrayList.isEmpty());

    }
}
