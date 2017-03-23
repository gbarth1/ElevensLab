package com.company;
import java.util.*;
import java.io.*;
/**
 * Created by gb647 on 3/15/17.
 */
public class CardTester {

    public static void main(String[] args) {

        Card c1 = new Card("King", "hearts", 13);
        Card c2 = new Card("Queen", "spades", 12);
        Card c3 = new Card("jack", "hearts", 11);

    public static Deck deal(){
        Deck ret;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> thing = new ArrayList();
        System.out.println("what suits(say stop when done): ");
        while(true){
            System.out.println("enter suit: ");
            String sss = sc.nextLine();
            if(sss.equals("stop")){
                break;
            }
            thing.add(sss);
        }
        System.out.println("What ranks?(say stop when done listing)");
        String s="";
        ArrayList<String> list = new ArrayList();
        ArrayList<Integer> vallist = new ArrayList();
        while(true){
            System.out.println("enter rank: ");
            s = sc.next();
            if(s.equals("stop")){
                break;
            }
            list.add(s);
            System.out.println("enter that rank's value: ");
            int i = sc.nextInt();
            vallist.add(i);
        }
        int count = 0;
        String[] list2 = new String[list.size()];
        for(String ss:list){
            if(count == vallist.size()-1){
//	break;
            }
            list2[count] = ss;
            count++;
        }
        count = 0;
        int[] list3 = new int[list.size()];
        for(int ss:vallist){
            if(count == vallist.size()-1){
//break;
            }
            list3[count] = ss;
            count++;
        }
        count = 0;
        String [] list1 = new String[thing.size()];
        for(String w: thing){
            list1[count] = w;
            count++;
        }


        ret = new Deck(list1,list2,list3);
        System.out.println("Custom cards?(y/n): ");
        String a = sc.next();
        if(a.equals("y")){
            while(true){
                System.out.println("custom card");
                int i;
                String s1,s2;
                System.out.println("rank: ");
                s1 = sc.next();
                System.out.println("suit: ");
                s2 = sc.next();
                System.out.println("value(integer): ");
                i = sc.nextInt();
                ret.addCustom(s1,s2,i);
                System.out.println("continue(y/n): ");
                String t = sc.next();
                if(t.equals("n")){
                    break;
                }

            }
        }
        return ret;

    }
}
