package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class GFG {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberOfTC = scanner.nextLine();
        int tc = Integer.parseInt(numberOfTC);
        List<Integer> count = Arrays.asList(new Integer[tc]);
        for(int j=0; j<tc ; j++){
            int key=0;
            List<Integer> list;
            String listSize = scanner.next();
            int size = Integer.parseInt(listSize);
            String keyToSearch = scanner.next();
            key = Integer.parseInt(keyToSearch);
            list= new ArrayList<Integer>();
            for(int i = 0; i< size; i++){
                String listValues = scanner.next();
                list.add(Integer.parseInt(listValues));
            }
            int arraySize = list.size();
            int pivot = arraySize /2;
            int first = 0;
            int last = arraySize-1;
            count.set(j, -1);
            while(first<=last)
            {
                if(list.get(pivot) ==  key){
                    Integer integer = 0;
                    for(int i=first; i<=last; i++)
                    {
                        if(list.get(i)== key){
                            integer++;
                            count.set(j, integer);
                        }
                    }
                    break;
                }
                if(list.get(pivot) < key)
                    first = pivot+1;
                else
                    last = pivot-1;

                pivot =(first+last)/2;
            }
        }

        for (int i : count) {
            System.out.println(i);
        }
    }
}
