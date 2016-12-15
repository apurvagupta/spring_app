package com;

import org.junit.Test;

import java.util.Arrays;

public class MyControllerTest {
    @Test
    public void shouldRemovesequenceOfThreeCharsWithTwoAtleastConsecutive(){
        String seq= "abbbcddd";
        String seq1 = "";
        char[] chars = seq.toCharArray();
        Arrays.sort(chars);
        int j=0;
        for(int i =0; i< (chars.length);){
            if((i< chars.length -2) && chars[i] == chars[i+1] && chars[i] == chars[i+2]){
                i = i+3;
            }
            else{
                seq1 = String.valueOf(new StringBuilder(seq1).insert(j,chars[i]));
                j++;
                i++;
            }
        }
        System.out.print(seq1);
    }

    @Test
    public void shouldCreate(){
        String s = stringType();
        System.out.print(s);
    }

    private String stringType() {
        try{
           throw new Exception();
        }
        catch(Exception e){
            System.out.print("hello I am in catch ");
            return "bac";
        }finally {
            return "xyz";
        }
    }
}