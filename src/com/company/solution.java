package com.company;

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Map WordCount= new TreeMap<String,Integer>();
        String s=scanner.next();
        int max=0;
        //System.out.println("s"+ s.equals("stop")+scanner.hasNext());
        while ((scanner.hasNext())/* && !(s.equals("stop"))*/) {

            //System.out.println("s"+ s.equals("stop")+scanner.hasNext());
           // if (s.matches("^[a-zA-Z]+$")){
                s=s.toLowerCase();

                 if(WordCount.containsKey(s)){
                     int count=(int)WordCount.get(s)+1;
                     if(count>max) max=count;
                     WordCount.put(s,count);
                 }else{
                       WordCount.put(s,1);
                     if(max<1) max=1;
                 }
           // }
            s=scanner.next();
        }
        String key;

        //=WordCount.keySet().iterator();
        /*while (it.hasNext()){

            key=(String) it.next();
            if ((int)WordCount.get(key)>max) {
                max=(int)WordCount.get(key);
            }


        }*/
        //System.out.println("ntcn");

        Iterator it= WordCount.keySet().iterator();
        while (it.hasNext()){

            key=(String) it.next();
            if((int)WordCount.get(key)==max) {
                System.out.println(key /*+ "-" + WordCount.get(key)*/);
            }
        }
/*
        int count = scanner.nextInt();
        int mass1[] = new int[count];
        int max = 0;
        for (int i = 0; i < count; i++) {
            mass1[i] = scanner.nextInt();
        }
        for (int i = 0; i < count; i++) {
            if (mass1[i] > max) {
                max = mass1[i];
            }
        }
        for (int i = 0; i < count; i++) {
            if (mass1[i] == max) {
                mass1[i] = mass1[i] / 2;
            }
        }

        max = 0;

        for (int i = 0; i < count; i++) {
            if (mass1[i] > max) {
                max = mass1[i];
            }
        }
        for (int i = 0; i < count; i++) {
            if (mass1[i] == max) {
                mass1[i] = mass1[i] / 2;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(mass1[i]);
        }

*/
    }
    /*public boolean isWord (String s) {

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i))
        }
    }*/

}
