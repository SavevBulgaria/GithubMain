package Algorithms;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> cars=new LinkedList<String>();
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Mozda");
        System.out.println("AddFirst Function ");
        cars.addFirst("Toyota");
        System.out.println("Addlast Function ");
        cars.addLast("Mazda");
        System.out.println("Add Function by index ");
        cars.add(2,"Tesla");

        System.out.println("Using for cycle ");
        for(int i=0;i< cars.size();i++){
            System.out.print(cars.get(i)+" ");
        }
        System.out.println();
        System.out.println("Using for each method ");
        for(String elem: cars){
            System.out.print(elem+" ");
        }
        System.out.println();
        System.out.println("Using stream");
        cars.stream().forEach((elem)->{System.out.print(elem+" ");});
        System.out.println();
        System.out.println("Removing first element "+cars.removeFirst());
        System.out.println("Removing last element "+cars.removeLast());
        System.out.println("List after the elements have been removed ");
        for(int i=0;i< cars.size();i++){
            System.out.print(cars.get(i)+" ");
        }

        System.out.println("Size of the list "+cars.size());
        System.out.println("Is the list empty ? "+cars.isEmpty());
        cars.isEmpty();



        }

    }

